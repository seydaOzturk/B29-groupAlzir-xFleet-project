package com.xFleet.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.xFleet.utilities.Driver;

import java.time.Duration;

public class Driver {

    // create private constructor to remove access to this object
    private Driver(){}

    /*
    We make WebDriver private, because we want to close access from outside the class
   We  are making it static, because we will use it in a static method.
     */
    // private static WebDriver driver; // default value = null

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();



    /*
    Create are-usable utility method which wil return the same driver instance once we call it.
    -If an instance doesn't exist, it will create first, and then it will always return same instance.
     */

    public static WebDriver getDriver(){
        /*
        We will read our BrowserType from configuration.properties file.
        This way, we can control which browser is opened from outside our code
         */
        if(driverPool.get() == null){
            String browserType = ConfigurationReader.getProperty("browser");
           /*
           Depending on browserType returned from configuration.properties switch statement will determine the "case", and open the matching browser.
            */
            switch (browserType){
                case "chrome":
                    // WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    //WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }
        }
        return driverPool.get();
    }
    /*
    Create a new Driver.closeDriver(); it will use .quit() method to quit browsers, and then set the driver value back
     */

    public static void closeDriver(){
        if(driverPool.get() != null){
            /*
            This line will terminate the currently existing driver completely.  It will not exist going forward.
             */
            driverPool.get().quit();
            /*
            We assign the value  bck to "null" so that my "singleton" can create a newer one if needed.
             */
            driverPool.remove();
        }
    }
}
