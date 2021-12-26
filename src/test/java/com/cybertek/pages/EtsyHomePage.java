package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {

    public EtsyHomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "search_query")
    public WebElement searchField;

    @FindBy(xpath = "//button[@value='Search']")
    public WebElement searchButton;


    /**
     *
     * @param item
     */
    public void searchFor(String item){
        searchField.clear();
        searchField.sendKeys(item);
        searchButton.click();
    }
}
