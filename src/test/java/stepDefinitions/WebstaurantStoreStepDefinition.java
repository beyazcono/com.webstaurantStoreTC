package stepDefinitions;

import io.cucumber.java.en.Given;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.WebstaurantStorePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.testng.asserts.SoftAssert;

public class WebstaurantStoreStepDefinition {
    WebstaurantStorePage page=new WebstaurantStorePage();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert = new SoftAssert();

    @Given("Go to {string}.")
    public void go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }

    @Given("Search for {string}.")
    public void search_for(String product) {
        page.searchBox.sendKeys(product);
        page.searchButton.click();
    }

    @Given("Check the search result ensuring every product has the word {string} in its title.")
    public void check_the_search_result_ensuring_every_product_has_the_word_in_its_title(String data) {
        ReusableMethods.titleListMethod(data);
    }

    @Given("Add the last of found items to Cart.")
    public void add_the_last_of_found_items_to_cart() {
        actions.scrollToElement(page.nextPageButton).perform();
        ReusableMethods.waitt(2);
        page.lastItemAddButton.click();
        page.viewCartButton.click();
    }

    @Given("Empty Cart.")
    public void empty_cart() {
        page.emptyCartButton1.click();
        page.emptyCartVerifyButton.click();
        String actualText=page.emptyCartText.getText();
        String expectedText="Your cart is empty.";

        Assert.assertEquals(expectedText,actualText);

        ReusableMethods.waitt(3);
        Driver.quitDriver();
    }


}
