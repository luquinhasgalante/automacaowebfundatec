package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.name("email"));
    }

    public WebElement getPasswordInput(){

        return driver.findElement(By.name("password"));
    }
    
    public WebElement getLoginButton(){

        return driver.findElement(By.cssSelector(".style__ContainerButton-sc-1wsixal-0.otUnI.button__child"));
    }
}