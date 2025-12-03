package Validacao;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.GenericPage;

public class GenericValidacao {

    private WebDriver driver;
    private GenericPage genericPage;

    public GenericValidacao(WebDriver driver){

        this.driver = driver;
        genericPage = new GenericPage(this.driver);
    }

    public void validationTitlePages(String texto){

        try{
            String label = genericPage.getTextTitle().getText();
            Assertions.assertEquals(texto,label);
        }catch (Exception e){
            e.getMessage();
        }
    }
}

