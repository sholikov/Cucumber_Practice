package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage extends BasePage {
    //no need for @FindBy, since "name" in html is matching variable name
//    public WebElement _username;
//    public WebElement _password;

    @FindBy(name = "_username")
    public WebElement _username;

    @FindBy(name = "_password")
    public WebElement _password;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login(String userName, String password) {
        _username.sendKeys(userName);
        _password.sendKeys(password);
        loginBtn.click();
    }
}
