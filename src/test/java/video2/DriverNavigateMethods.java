package video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //1- driver.navigate().to("url"); --> gets the requested link
        // driver.get("url") -- > does the same thing, but you can use forward and back option after you got to the link
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        //2- driver.navigate().back(); goes back to the previous page
        driver.navigate().back();//--> as this will follow the above instructions, this will take us to amazon again

        //3- driver.navigate().forward(); goes to the page where it came with "back" above. So, it'll go to facebook again
        driver.navigate().forward();

        //4- driver.navigate().refresh(); it refreshes the page where it currently is
        driver.navigate().refresh();

        //driver.close(); --> when we create a WebDriver, this command closes the page or the window
        //driver.close();

        //driver.quit(): -->if there are more than one pages or windows, it quits all.
        driver.quit();


    }
}
