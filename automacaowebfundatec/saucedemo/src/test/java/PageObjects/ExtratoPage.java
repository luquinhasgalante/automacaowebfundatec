package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExtratoPage {
    private final WebDriver driver;

    public ExtratoPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getVoltarButton() {
        return driver.findElement(By.id("btnBack"));
    }

    public WebElement getSairButton() {
        return driver.findElement(By.id("btnExit"));
    }

    public WebElement getValorTransferencia() {
        return driver.findElement(By.xpath("//*[@id=\"textTransferValue\"]"));
    }

}