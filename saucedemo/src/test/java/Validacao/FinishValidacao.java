package Validacao;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.FinishPage;

public class FinishValidacao {
    private WebDriver driver;
    private FinishPage page;

    public FinishValidacao(WebDriver driver) {
        this.driver = driver;
        page = new FinishPage(driver);
    }

    public void validationSucessoCompra() {
        try {
            Assertions.assertEquals("Thank you for your order!", page.getFinishTextLabel().getText());
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
