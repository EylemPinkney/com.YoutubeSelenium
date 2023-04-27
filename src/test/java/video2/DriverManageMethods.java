package video2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethods {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- driver.manage().window() methods

        //1a- driver.manage().window().getSize() --> it returns the size of page in pixels. As this is returning some information we either need to create smth to save in it or we print it to see the result.
        System.out.println(driver.manage().window().getSize());

        //1b- driver.manage().window().getPosition() --> it gets the position of the page. It measures from left bottom corner to up and right.
        System.out.println(driver.manage().window().getPosition());

        //1c- driver.manage().window().setPosition(new Point(15, 15)); -->The page we are in, it moves the starting point(left bottom corner) to the new point we gave
        driver.manage().window().setPosition(new Point(15, 15));

        //1d- driver.manage().window().setSize(new Dimension(900, 600)); --> The page we are in, it moves the starting point(left bottom corner) to the new dimensions we gave
        driver.manage().window().setSize(new Dimension(900, 600));


        //Print out after new position and size;
        System.out.println("New window position= " + driver.manage().window().getPosition());
        System.out.println("New window position= " + driver.manage().window().getSize());
        System.out.println("New window position= " + driver.manage().window().getSize().height);


        //1e- driver.manage().window().maximize(); --> it makes the page maximum
        //1f- driver.manage().window().fullscreen(); --> it makes the page fullscreen

        //To see the difference, lets use the methods to see their positions and sizes;

        driver.manage().window().maximize();
        System.out.println("Maximize position" + driver.manage().window().getPosition());
        System.out.println("Maximize size" + driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("Maximize position" + driver.manage().window().getPosition());
        System.out.println("Maximize position" + driver.manage().window().getSize());

        //1g- driver.manage().window().minimize();
        driver.manage().window().minimize();


        //2- driver.manage().timeouts() methods

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
        We'll be learning about wait later on. But
         */


    }
}
