package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("web driver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");

        //Hepsiburada sayfasina gidelim
        Thread.sleep(3000);//3 SANIYE BEKLE GEC
        driver.navigate().to("https://hepsiburada.com");

        //Tekrar amozon sayfasina donelim
        driver.navigate().back();

        //Tekrar hepsibuarada sayfasına gidelim
        driver.navigate().forward();

        //Son sayfada sayfayi yenileyelim(rfresh
        driver.navigate().refresh();


        //Ve sayfayı kapatalim
        driver.close();
    }
}
