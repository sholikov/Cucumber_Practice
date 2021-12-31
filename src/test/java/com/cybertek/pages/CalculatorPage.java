package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {

    public CalculatorPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "sciOutPut" )
  public WebElement resultElement;
    public void clickOn(String buttonText){
        WebElement element =Driver.getDriver().findElement(By.xpath("//span[.='" + buttonText + "']"));

        element.click();
    }
}
