package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdrive.chrom.driver","src/resources/drives/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//bos bir browser actik
        driver.get("https://www.amazon.com");//ilk olarak gitmek istedigimiz sayfayi belirtiriz
        System.out.println("Sayfa basligi :"+ driver.getTitle());
        System.out.println("sayfa url: " + driver.getCurrentUrl());
         //System.out.println(driver.getPageSource());
        System.out.println(driver.getWindowHandle());//bize o window!a hash degerini verir. bıze bu hash degerlerini
                                                     //bir string'e atayip pencereler arasi gecis yapabiliriz


    }
}
