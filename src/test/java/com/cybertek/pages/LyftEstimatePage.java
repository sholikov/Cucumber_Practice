package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LyftEstimatePage {
    public LyftEstimatePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "fare-start")
    public WebElement pickUpLocation;

    @FindBy(name = "fare-end")
    public WebElement dropOffLocation;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement estimateButton;

    public void enterPickUpLocation(String location){
        pickUpLocation.sendKeys(location);
    }

}
