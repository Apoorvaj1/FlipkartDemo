package PageObjects;

import CommonToAllPages.BaseClass;
import Utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AddToCart_Page extends BaseClass {

    public AddToCart_Page(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@id=\"twotabsearchtextbox\"]")
    private WebElement textBox;

    @FindBy(xpath = "//div[@class=\"nav-search-submit nav-sprite\"]")
    private WebElement searchIcon;

    @FindBy(xpath = "//span[@class=\"a-size-medium a-color-base a-text-normal\"]")
    private List<WebElement> productList;

    @FindBy(xpath = "//span[@class='a-button-inner']/input[@title='Add to Shopping Cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = "(//a[contains(text(),\"Go to Cart\")])[2]")
    private WebElement goToCart;

    @FindBy(xpath = "//span[@class=\"a-truncate-cut\"]")
    private List<WebElement> list_ShoppingCart;

    String xpath_Product = "(//span[@class='a-size-medium a-color-base a-text-normal'])["+ConfigReader.readKey("num")+"]";


    public void enterProductText(String name){
        enterText(textBox,name);
    }

    public void clickSearchIcon(){
        hoverAndClick(searchIcon);
    }

    public void getProductList(){
        getTotalItems(productList);
    }

    public void clickDesiredProduct() throws InterruptedException {
        WebElement desired_product = driver.findElement(By.xpath(xpath_Product));
        clickElement(desired_product);
        Thread.sleep(2000);
    }

    public void clickAddToCartButton(){
        Set<String> handle = driver.getWindowHandles();
        Iterator<String> itr = handle.iterator();
        while(itr.hasNext()){
            String parent = itr.next();
            String child = itr.next();
            driver.switchTo().window(child);
            clickElement(addToCartButton);
            clickElement(goToCart);
        }
    }

    public void shoppingCartItem(){
        int item = list_ShoppingCart.size();
        System.out.println(item);
    }
}
