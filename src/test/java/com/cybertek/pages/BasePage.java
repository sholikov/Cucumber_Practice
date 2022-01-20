package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    /**
     * parent class for concrete Page object classes
     * provides constructor with initElements method for re-usability
     * abstract - to prevent instantiation.
     */
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
