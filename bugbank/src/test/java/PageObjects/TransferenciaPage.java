package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferenciaPage {
    private final WebDriver driver;

    public TransferenciaPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getVoltarButton() {
        return driver.findElement(By.id("btnBack"));
    }

    public WebElement getNumeroContaInput() {
        return driver.findElement(By.name("accountNumber"));
    }

    public WebElement getDigitoContaInput() {
        return driver.findElement(By.name("digit"));
    }

    public WebElement getValorTransferencia() {
        return driver.findElement(By.name("transferValue"));
    }

    public WebElement getDescricaoInput() {
        return driver.findElement(By.name("description"));
    }

    public WebElement getTransferirButton() {
        return driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/button"));
    }

    public WebElement fecharButton() {
        return driver.findElement(By.id("btnCloseModal"));
    }

    public WebElement sairButton() {
        return driver.findElement(By.id("btnExit"));
    }
}
