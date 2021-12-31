package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

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
    public void tearDownScenario(){
        System.out.println("After = tearDown method is running after the scenario");
        Driver.closeDriver();
    }
}
