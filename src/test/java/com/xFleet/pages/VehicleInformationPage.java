package com.xFleet.pages;

import com.xFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleInformationPage {

    public VehicleInformationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']")
    public WebElement carsTable;

    @FindBy(xpath = "//label[@class= 'dib'][2]")
    public WebElement numOfPage;

    @FindBy(xpath = "//i[contains(text(), \"Nex\")]")
    public WebElement nextPage;

    @FindBy(xpath = "//i[contains(text(), \"Prev\")]")
    public WebElement previousPage;

    @FindBy(xpath = "//label[text()=\"Total of 1 records\"]")
    public WebElement totalRecords;

}
