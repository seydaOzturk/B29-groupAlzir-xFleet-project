package com.xFleet.pages;

import com.xFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(id = "prependedInput")
    public WebElement inputUsername;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;


    public  void login(String username, String password){
        this.inputUsername.sendKeys(username);
        this.inputPassword.sendKeys(password);
        this.loginButton.click();
    }


}
