package com.xFleet.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public static void switchMethodAndVerify(String expectedInUrl, String expectedTitle) {
        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();
        for (String each : allWindowsHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());
            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        //TC #2: Create utility method
        //1. Create a new class called BrowserUtils
        //2. Create a method to make Task1 logic re-usable
        //3. When method is called, it should switch window and verify title.
        //Method info:
        //• Name: switchWindowAndVerify
        //• Return type: void
        //• Arg1: WebDriver
        //• Arg2: String expectedInUrl
        //• Arg3: String expectedTitle
    }

    public static void verifyTitle(String expectedTitle) {
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
        //TC #3: Create utility method
        //1. Create a new method for title verification
        //2. Create a method to make title verification logic re-usable
        //3. When method is called, it should simply verify expected title with actual
        //title
        //Method info:
        //• Name: verifyTitle()
        //• Return type: void
        //• Arg1: WebDriver
        //• Arg2: String expectedTitle
    }

    public static void verifyTitleContains(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }
    /*
    This method accepts WebElement target,
    and waits for that WebElement not to be displayed on the page
     */

    public static void waitForInvisibilityOf(WebElement target) {
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.invisibilityOf(target));

    }
 /*
    This method accepts String title,
    and waits for that Title to contain given String value
     */

    public static void waitForTitleContains(String title) {
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(30));
        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.titleContains(title));

    }

    /*
     *This method accepts a dropdown element and returns a List<String> that contains all options values as String.
     *@param dropdownElement
     *@return actualMonth_as_STRING
     */
    public static List<String> dropdownOptions_as_STRING(WebElement dropdownElement) {
        Select month = new Select(dropdownElement);
        //Storing all the actual options into a list of WebElements
        List<WebElement> actualMonth_as_WEBELEMENT = month.getOptions();
        //Creating an EMPTY list of String to store ACTUAL<option> as String
        List<String> actualMonth_as_STRING = new ArrayList<>();

        //Looping through the List<WebElement>, getting all options' texts, abd storing them into List of String
        for (WebElement each : actualMonth_as_WEBELEMENT) {
            actualMonth_as_STRING.add(each.getText());
        }
        return actualMonth_as_STRING;
    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {

        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                each.click();
            }
        }
    }

    public static void waitUntilLoaderScreenDisappear() {
        try {
            WebElement closeBtn = Driver.getDriver().findElement(By.cssSelector("button[title='close']"));
            closeBtn.click();
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }

    public static WebElement waitForClickablility(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }


}
