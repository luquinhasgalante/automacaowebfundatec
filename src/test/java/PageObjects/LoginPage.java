package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Utils.FileOperations;

public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {

        this.driver = driver;
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.name(FileOperations.getProperties("form").getProperty("input-email-login")));
    }

    public WebElement getPasswordInput(){

        return driver.findElement(By.name(FileOperations.getProperties("form").getProperty("input-senha-login")));
    }
    
    public WebElement getLoginButton(){

        return driver.findElement(By.cssSelector(FileOperations.getProperties("form").getProperty("button-login")));
    }
}