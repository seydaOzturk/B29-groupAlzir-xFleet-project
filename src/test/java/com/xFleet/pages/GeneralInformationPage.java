package com.xFleet.pages;

import com.xFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInformationPage {
    public GeneralInformationPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy()
    public WebElement generalInfo;

    @FindBy()
    public WebElement threeDots;

    @FindBy()
    public WebElement editBtn;

    @FindBy()
    public WebElement deleteBtn;




}
