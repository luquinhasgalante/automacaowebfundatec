package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperations;
import PageObjects.CheckoutPage;
import Validacao.CheckoutValidacao;
import Validacao.GenericValidacao;

public class CheckoutTask {
    private WebDriver driver;
    private CheckoutPage checkoutPage;
    private GenericValidacao genericValidacao;
    private CheckoutValidacao checkoutValidacao;
    private FakersGeneration fakers;

    public CheckoutTask (WebDriver driver){
        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidacao = new GenericValidacao(this.driver);
        fakers = new FakersGeneration();
        checkoutValidacao = new CheckoutValidacao(this.driver);
    }

    public void realizarCheckout() throws InterruptedException {
        String name = fakers.getFirstName();
        String lastName = fakers.getLastName();
        String cep = fakers.getZipCode();

        FileOperations.setProperties("form", "name", name);
        FileOperations.setProperties("form", "lastname", lastName);
        FileOperations.setProperties("form", "zip", cep);

        genericValidacao.validationTitlePages("Checkout: Your Information");
        checkoutPage.getFirstNameInput().sendKeys(name);
        checkoutPage.getLastNameInput().sendKeys(lastName);
        checkoutPage.getZipCodeInput().sendKeys(cep);
        checkoutValidacao.validationCamposForm();
        checkoutPage.getContinueButton().click();
        genericValidacao.validationTitlePages("Checkout: Overview");
        genericValidacao.validationProduto();
    }
}
