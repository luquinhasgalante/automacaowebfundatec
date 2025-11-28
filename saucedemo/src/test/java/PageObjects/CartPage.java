package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Browser.Waits;

public class CartPage {

    private WebDriver driver;
    private Waits waits;

    public CartPage (WebDriver driver){
        this.driver = driver;
        this.waits = new Waits(this.driver);
    }

    public WebElement getCheckoutButton(){

        waits.visibilityOfElement(By.id("checkout"));
        return driver.findElement(By.id("checkout"));

    }
}