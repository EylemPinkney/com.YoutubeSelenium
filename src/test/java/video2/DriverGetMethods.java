package video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1- driver.get("url") -- > goes/gets to the url we typed
        driver.get("https://www.amazon.com");

        //2- driver.getTitle() --> It gets the title of the page where it initially got
        System.out.println("Page title: " + driver.getTitle());//Amazon.com. Spend less. Smile more.

        //3 -driver.getCurrentUrl() -->It gets the url of the page where it initially got
        System.out.println(driver.getCurrentUrl());

        //4- driver.getPageSource(); --> It gets the page source of the page where it initially got
        System.out.println("===================================================");
        System.out.println(driver.getPageSource());
        System.out.println("===================================================");

        //5- driver.getWindowHandle(); -->It gets the UNIQUE hash code of the page
        System.out.println(driver.getWindowHandle());//Note:This has code changes everytime we open a new page.

        //6-  driver.getWindowHandles(); --> It gets the UNIQUE hash code of the page
        driver.getWindowHandles();//If driver opens more than one page, it gets all unique codes for the pages.


    }
}
