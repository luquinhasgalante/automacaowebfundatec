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
        return driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div[2]/div[2]/p[2]"));
    }

}