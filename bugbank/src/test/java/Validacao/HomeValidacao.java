package Validacao;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperations;
import PageObjects.HomePage;

public class HomeValidacao {
    private final WebDriver driver;
    private final HomePage page;

    public HomeValidacao(WebDriver driver) {
        this.driver = driver;
        page = new HomePage(driver);
    }

    public void validationHomePage1() {
        try {
            Assertions.assertEquals("Olá " + FileOperations.getProperties("user").getProperty("name") + ",", page.getHomeTextLabel().getText());
        } catch(Exception e) {
            e.getMessage();
        }
    }

    public void validationHomePage2() {
        try {
            Assertions.assertEquals("Olá " + FileOperations.getProperties("user").getProperty("name2") + ",", page.getHomeTextLabel().getText());
        } catch(Exception e) {
            e.getMessage();
        }
    }
}
