package PageObjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Utils.FileOperations;

public class TransferenciaPage {
    private final WebDriver driver;

    public TransferenciaPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getVoltarButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-voltar")));
    }

    public WebElement getNumeroContaInput() {
        return driver.findElement(By.name(FileOperations.getProperties("form").getProperty("input-numero")));
    }

    public WebElement getDigitoContaInput() {
        return driver.findElement(By.name(FileOperations.getProperties("form").getProperty("input-digito")));
    }

    public WebElement getValorTransferencia() {
        return driver.findElement(By.name(FileOperations.getProperties("form").getProperty("input-valor-transferencia")));
    }

    public WebElement getDescricaoInput() {
        return driver.findElement(By.name(FileOperations.getProperties("form").getProperty("input-descricao")));
    }

    public WebElement getTransferirButton() {
        return driver.findElement(By.xpath(FileOperations.getProperties("form").getProperty("button-transferir")));
    }

    public WebElement fecharButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-fechar")));
    }

    public WebElement sairButton() {
        return driver.findElement(By.id(FileOperations.getProperties("form").getProperty("button-sair")));
    }
}
