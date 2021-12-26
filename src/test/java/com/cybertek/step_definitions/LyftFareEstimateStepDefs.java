package com.cybertek.step_definitions;

import com.cybertek.pages.LyftEstimatePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LyftFareEstimateStepDefs {

    LyftEstimatePage lyftEstimatePage = new LyftEstimatePage();

    @Given("User is on lyft fare estimate page")
    public void user_is_on_lyft_fare_estimate_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("lyft.fare.estimate.url"));
        Assert.assertEquals("Get Fare Estimates for Your City - Lyft Price Estimate | Lyft",Driver.getDriver().getTitle());

    }
    @When("User enters {string} to pickup address")
    public void user_enters_to_pickup_address(String pickUpLocation) {
      //  LyftEstimatePage lyftEstimatePage = new LyftEstimatePage();
        lyftEstimatePage.pickUpLocation.sendKeys("Bentonville,AR");
     //   lyftEstimatePage.enterPickUpLocation(pickUpLocation); i created method and called


    }
    @And("User enters {string} to drop-off address")
    public void user_enters_to_drop_address(String dropOffLocation) {
      //  LyftEstimatePage lyftEstimatePage = new LyftEstimatePage();
        lyftEstimatePage.dropOffLocation.sendKeys("Little, AR");

    }
    @And("User clicks on get estimate button")
    public void user_clicks_on_get_estimate_button() {
    lyftEstimatePage.estimateButton.click();

    }
    @Then("User should see estimated prices")
    public void user_should_see_estimated_prices() {



    }
}
