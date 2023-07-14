package com.xFleet.stepDefinitions;

import com.xFleet.utilities.BrowserUtils;
import com.xFleet.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    // import the @Before coming from io.cucumber.java
    @Before
    public void setUpMethod(){
        System.out.println("--->  @Before: RUNNING BEFORE EACH SCENARIO");
    }

    // @Before ("@login")
    public void login_scenario_before(){
        System.out.println("--->  @Before: RUNNING BEFORE EACH SCENARIO");
    }
    /*
    @After will be executed automatically after EVERY scenario in the project.
     */
    @After
    public void tearDownMethod(Scenario scenario){

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("--->  @After: RUNNING AFTER EACH SCENARIO");
        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }
    // @BeforeStep
    public void setUpStep(){
        System.out.println("---> @BeforeStep : Running before each step!");
    }

    // @AfterStep
    public void tearDownStep(){
        System.out.println("---> @AfterStep : Running after each step!");
    }

}
