package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Utils.FileOperations;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSairButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-sair")));
    }

    public WebElement getTransferenciaButton() {
        return driver.findElement(By.id("btn-TRANSFERÊNCIA"));
    }

    public WebElement getPagamentosButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-pagamentos")));
    }

    public WebElement getExtratoButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-extrato")));
    }

    public WebElement getSaqueButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-saque")));
    }

    public WebElement getHomeTextLabel() {
        return driver.findElement(By.className(FileOperations.getProperties("form").getProperty("home-title")));
    }

    public WebElement getNumeroDigitoConta() {
        return driver.findElement(By.xpath(FileOperations.getProperties("form").getProperty("label-digito")));
    }
}
