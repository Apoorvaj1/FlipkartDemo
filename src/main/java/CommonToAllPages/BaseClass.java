package CommonToAllPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BaseClass {

    public WebDriver driver;
    public BaseClass(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterText(WebElement text,String name){
        text.sendKeys(name);
    }

    public void hoverAndClick(WebElement ele){
        Actions action = new Actions(driver);
        action.moveToElement(ele).click().build().perform();
    }

    public void getTotalItems(List<WebElement> name){
        int count = name.size();
        for(int i=0;i<count;i++){
            String value = name.get(i).getText();
            System.out.println(value);
        }
    }

    public void clickElement(WebElement ele){
        ele.click();
    }
}
