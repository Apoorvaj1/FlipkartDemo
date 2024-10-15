package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class GoogleTest {
    @Test
    public void googleTest() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("iphone");
        Thread.sleep(4000);
        List<WebElement> ele = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]"));
        List<String> str = new ArrayList<>();
        for(int i=0;i<ele.size();i++){
            String name = ele.get(i).getText();
            if(name.isEmpty()){
                continue;
            }
            str.add(name);

        }
        System.out.println(str);
        for(String str1:str){
            System.out.println(str1);
        }
        System.out.println("Hello123");
        driver.quit();
    }
}
