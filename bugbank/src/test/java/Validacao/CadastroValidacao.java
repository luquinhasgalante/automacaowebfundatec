package Validacao;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.CadastroPage;

public class CadastroValidacao {
    private final WebDriver driver;
    private final CadastroPage page;

    public CadastroValidacao(WebDriver driver) {
        this.driver = driver;
        page = new CadastroPage(driver);
    }

    public void validationCadastro() {
        try {
            Assertions.assertTrue(page.getNomeInput().isDisplayed());
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
