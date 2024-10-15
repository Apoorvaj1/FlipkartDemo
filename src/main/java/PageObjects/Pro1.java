package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Pro1 {

    @Test
    public void test1(){
        System.out.println("Hello");
    }
    @Test
    public void test4(){
        System.out.println("Rahul");
    }
    @Test
    public void test3(){
        System.out.println("Apoorv");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
}
