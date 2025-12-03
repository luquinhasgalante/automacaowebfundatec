package Validacao;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperations;
import PageObjects.ExtratoPage;

public class ExtratoValidacao {
    private final WebDriver driver;
    private final ExtratoPage page;

    public ExtratoValidacao(WebDriver driver) {
        this.driver = driver;
        page = new ExtratoPage(driver);
    }

    public void validationValorExtrato() {
        try {
            Assertions.assertEquals(FileOperations.getProperties("form").getProperty("valor"), page.getValorTransferencia().getText());
        }catch(Exception e) {
            e.getMessage();
        }
    }

}
