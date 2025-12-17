package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Utils.FileOperations;

public class CadastroPage {
    private final WebDriver driver;
    
    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement getRegistrarButton() {
        return driver.findElement(By.cssSelector(".style__ContainerButton-sc-1wsixal-0.ihdmxA.button__child"));
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.xpath("//div[@class='card__register']//input[@name='email']"));
    }

    public WebElement getNomeInput() {
        return driver.findElement(By.name("name"));
    }

    public WebElement getPasswordInput(){

        return driver.findElement(By.xpath("//div[@class='card__register']//input[@name='password']"));
    }

    
    public WebElement getPasswordConfirmationInput(){

        return driver.findElement(By.name("passwordConfirmation"));
    }

    public WebElement getCadastrarButton() {
        return driver.findElement(By.cssSelector(".style__ContainerButton-sc-1wsixal-0.CMabB.button__child"));
    }

    public WebElement getSaldoButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("saldo")));
    }

    public WebElement getFecharButton() {
        return driver.findElement(By.id("btnCloseModal"));
    }
}
