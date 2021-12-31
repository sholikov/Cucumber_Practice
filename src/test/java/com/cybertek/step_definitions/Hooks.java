package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    /**
     * similar to TestBase.java in TestNG framework
     * We open close browser here
     */
    // we need to select that comes from cucumber
    @Before
    public void setUpScenario(){
        System.out.println("Before = setUp method is running before the scenario");
    }


    @After
    public void tearDownScenario(Scenario scenario) {
        /**
        * cast webdriver to takeScreenshot interface. (TakesScreenshot)Driver.getDriver()
         * call
         */

        byte[] image=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(image, "image/png", scenario.getName());

        System.out.println("AFTER - tearDown method is running after the scenario:" + scenario.getName());
        Driver.closeDriver();
    }
}
