package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebstaurantStorePage {

    public WebstaurantStorePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Search box location on webstaurantstore homepage.
    @FindBy(xpath = "(//input[@id='searchval'])[1]")
    public WebElement searchBox;

    //Search button location on webstaurantstore homepage.
    @FindBy(xpath = "(//button[@value='Search'])[1]")
    public WebElement searchButton;

    //Product title's location
    @FindBy(xpath = "//span[@class='block font-semibold text-sm-1/2 leading-none mt-4 mb-0 max-h-10 hover:max-h-full min-h-10 overflow-hidden hover:overflow-visible text-center']")
    public static WebElement productTitleText;

    //Next page buttobn location on search result.
    @FindBy(xpath = "//li[@class='inline-block leading-4 align-top rounded-r-md']")
    public WebElement nextPageButton;

    //Last item's add button location
    @FindBy(xpath = "(//input[@class='btn btn-cart btn-small'])[60]")
    public WebElement lastItemAddButton;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//*[text()='Empty Cart']")
    public WebElement emptyCartButton1;

    @FindBy(xpath = "(//*[text()='Empty'])[2]")
    public WebElement emptyCartVerifyButton;

    @FindBy(xpath = "//*[text()='Your cart is empty.']")
    public WebElement emptyCartText;

}