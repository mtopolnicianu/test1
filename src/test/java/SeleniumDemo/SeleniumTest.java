package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "C:Users\\mtopolnicianu\\Downloads\\chromedriver_mac64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
