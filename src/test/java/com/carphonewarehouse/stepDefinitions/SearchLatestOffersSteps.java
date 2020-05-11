package com.carphonewarehouse.stepDefinitions;

import com.carphonewarehouse.pages.BasePage;
import com.carphonewarehouse.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class SearchLatestOffersSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);




    @Given("i navigate the carphonewarehouse homepage")
    public void i_navigate_the_carphonewarehouse_homepage() {
            launchUrl();
    }

    @When("i move on latestOffers link")
    public void i_move_on_latestOffers_link() {

    }

    @When("i click on Pay Monthly Deals link")
    public void i_click_on_Pay_Monthly_Deals_link() {

    }

    @When("i click on right arrow link")
    public void i_click_on_right_arrow_link() {

    }

    @When("i click on ViewDetails button")
    public void i_click_on_ViewDetails_button() {

    }

    @Then("full detail of offer is displayed")
    public void full_detail_of_offer_is_displayed() {

    }
}
