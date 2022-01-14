package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage extends BasePage {

@FindBy(id = "prependedInput")
    public WebElement userInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String userName,String pwd){
        userInput.sendKeys(userName);
        passwordInput.sendKeys(pwd);
        loginBtn.click();
    }
}
