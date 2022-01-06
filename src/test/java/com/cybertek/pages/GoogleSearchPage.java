package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name="q")
    public WebElement searchBar;


    @FindBy(xpath = "//a[@class='FLP8od']")
    public WebElement searchResultText;
}
