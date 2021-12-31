package com.cybertek.step_definitions;

import com.cybertek.pages.PercentageCalculatorPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;


    public class PercentageCalculatorStepDefs {
        @Given("User is on percentage calculator page")
        public void user_is_on_percentage_calculator_page() {
            Driver.getDriver().get(ConfigurationReader.getProperty("percentage.url"));
            Assert.assertEquals("Percentage Calculator", Driver.getDriver().getTitle());
        }

        @Then("User should see following calculations:")
        public void user_should_see_following_calculations(Map<Integer, Integer> valuesMap) {
            System.out.println("valuesMap = " + valuesMap);
            PercentageCalculatorPage percentageCalculatorPage = new PercentageCalculatorPage();
            percentageCalculatorPage.percentInput.sendKeys("5");
            for (Integer inputKey : valuesMap.keySet()) {

                percentageCalculatorPage.valueInput.clear();
                percentageCalculatorPage.valueInput.sendKeys(inputKey + "" + Keys.ENTER);
                BrowserUtils.sleep(1);
                System.out.println("Input Value = " + inputKey);
                System.out.println("Expected 5% Value = " + valuesMap.get(inputKey));// value of key in the map
                System.out.println("Actual 5% Calculated Value  = " + percentageCalculatorPage.result.getAttribute("value"));
                System.out.println();
                //assert expected 5% value matches the actual calculated value
                Assert.assertEquals(valuesMap.get(inputKey)+"", percentageCalculatorPage.result.getAttribute("value"));
            }
        }
    }

