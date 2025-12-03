package Validacao;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.LoginPage;

public class LoginValidacao {
    private WebDriver driver;
    private LoginPage page;

    public LoginValidacao(WebDriver driver) {
        this.driver = driver;
        this.page = new LoginPage(driver);
    }

    public void validationLogin() {
        try {
            Assertions.assertTrue(page.getLoginButton().isDisplayed());
        }catch(Exception e) {
            e.getMessage();
        }
    }
}
