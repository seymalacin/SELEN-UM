package day01_DriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Day01_Example1 {
    public static void main(String[] args) {


        System.setProperty("web driver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();




        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //doğrulayın  (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com/");
        WebElement youtube = driver.findElement(By.id("logo-icon"));
        String actualTitle= driver.getCurrentUrl();
        if (youtube.isDisplayed()){
            System.out.println("passed");
        }else System.out.println("faıed"+ actualTitle);

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //doğru  URL'yi yazdırın.
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("youtube")){
            System.out.println("passed");
        }else System.out.println("faıled"+actualURL);

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //5. Youtube sayfasina geri donun
        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        WebElement baslik = driver.findElement(By.id("nav-logo-sprites"));
        String actualUrll = driver.getCurrentUrl();
        if (baslik.isDisplayed()){
            System.out.println("sayfa baslik passed" +actualUrll.contains("Amazon"));
        }else System.out.println("faıled");

        //Yoksa  doğru başlığı(Actual Title) yazdırın.
        System.out.println("baslık"+driver.getTitle());

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String acutalUrl = driver.getCurrentUrl();
        if (acutalUrl.contains("Amazon")){
            System.out.println("passed");
        }else System.out.println("faıled"+driver.getCurrentUrl());

        //11.Sayfayi kapatin
        driver.close();
    }
}
