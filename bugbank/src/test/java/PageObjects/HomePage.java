package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSairButton() {
        return driver.findElement(By.id("btnExit"));
    }

    public WebElement getTransferenciaButton() {
        return driver.findElement(By.id("btn-TRANSFERÊNCIA"));
    }

    public WebElement getPagamentosButton() {
        return driver.findElement(By.id("btn-PAGAMENTOS"));
    }

    public WebElement getExtratoButton() {
        return driver.findElement(By.id("btn-EXTRATO"));
    }

    public WebElement getSaqueButton() {
        return driver.findElement(By.id("btn-SAQUE"));
    }

    public WebElement getHomeTextLabel() {
        return driver.findElement(By.className("home__Text-sc-1auj767-9"));
    }

    public WebElement getNumeroDigitoConta() {
        return driver.findElement(By.xpath("//p[@id='textAccountNumber']/span"));
    }
}
