package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Utils.FileOperations;

public class ExtratoPage {
    private final WebDriver driver;

    public ExtratoPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getVoltarButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-voltar")));
    }

    public WebElement getSairButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-sair")));
    }

    public WebElement getValorTransferencia() {
        return driver.findElement(By.xpath(FileOperations.getProperties("form").getProperty("div-transferencia-valor")));
    }
}