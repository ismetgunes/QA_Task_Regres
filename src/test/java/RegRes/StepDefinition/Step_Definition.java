package RegRes.StepDefinition;

import RegRes.Pages.HomePage;
import RegRes.Utilities.BrowserUtils;
import RegRes.Utilities.ConfigurationReader;
import RegRes.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class Step_Definition {

    HomePage homePage=new HomePage();

    @Given("The user launch the amazon US webpage")
    public void theUserLaunchTheAmazonUSWebpage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        BrowserUtils.waitForPageToLoad(2);
        Assert.assertEquals(url,Driver.get().getCurrentUrl());
    }

    @When("The user search Shoes on this webpage")
    public void theUserSearchShoesOnThisWebpage() {
        homePage.search.click();
        homePage.search.sendKeys("Shoes");
        homePage.searchBtn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify the page loads successfully")
    public void verifyThePageLoadsSuccessfully() {
        BrowserUtils.waitForPageToLoad(2);
        Assert.assertEquals("\"Shoes\"",homePage.verifySearchText.getText());
    }

    @And("The user select a Shoe")
    public void theUserSelectAShoe() {
        homePage.shoes.get(1).click();
    }

    @Then("Verify selection")
    public void verifySelection() {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(homePage.verifySelectShoesText.isDisplayed());
    }
}
