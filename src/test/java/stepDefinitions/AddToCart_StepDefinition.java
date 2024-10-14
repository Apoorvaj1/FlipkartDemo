package stepDefinitions;

import PageObjects.AddToCart_Page;
import Utils.BrowerFactory;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart_StepDefinition {

    @Given("user navigate to Amazon website")
    public void user_navigate_to_amazon_website() {
        BrowerFactory.initializeBrowser(ConfigReader.readKey("browser"));
    }
    @When("user search {string}")
    public void user_search(String value) {
        AddToCart_Page page = new AddToCart_Page(BrowerFactory.driver);
        value = ConfigReader.readKey("productName");
        page.enterProductText(value);

    }
    @When("hit enter")
    public void hit_enter() {
        AddToCart_Page page = new AddToCart_Page(BrowerFactory.driver);
        page.clickSearchIcon();
    }
    @Then("user able to see respective products")
    public void user_able_to_see_respective_products() {
        AddToCart_Page page = new AddToCart_Page(BrowerFactory.driver);
        page.getProductList();
    }
    @When("user select desired product")
    public void user_select_desired_product() throws InterruptedException {
        AddToCart_Page page = new AddToCart_Page(BrowerFactory.driver);
        page.clickDesiredProduct();
    }
    @When("click on Add to cart")
    public void click_on_add_to_cart() {
        AddToCart_Page page = new AddToCart_Page(BrowerFactory.driver);
        page.clickAddToCartButton();
    }
    @Then("product able to add in Add to cart section")
    public void product_able_to_add_in_add_to_cart_section() {
        System.out.println("Desired product is successfully added.");
        AddToCart_Page page = new AddToCart_Page(BrowerFactory.driver);
        page.shoppingCartItem();

    }
}
