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
        return driver.findElement(By.cssSelector(FileOperations.getProperties("form").getProperty("button-registrar")));
    }

    public WebElement getEmailInput() {
        return driver.findElement(By.xpath(FileOperations.getProperties("form").getProperty("input-email")));
    }

    public WebElement getNomeInput() {
        return driver.findElement(By.name(FileOperations.getProperties("form").getProperty("input-nome")));
    }

    public WebElement getPasswordInput(){

        return driver.findElement(By.xpath(FileOperations.getProperties("form").getProperty("input-senha")));
    }

    
    public WebElement getPasswordConfirmationInput(){

        return driver.findElement(By.name(FileOperations.getProperties("form").getProperty("input-senha-confirmacao")));
    }

    public WebElement getCadastrarButton() {
        return driver.findElement(By.cssSelector(FileOperations.getProperties("form").getProperty("button-cadastrar")));
    }

    public WebElement getSaldoButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("saldo")));
    }

    public WebElement getFecharButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-fechar")));
    }
}
