package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Utils.FileOperations;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import Validacao.LoginValidacao;

public class LoginTask {

    private final WebDriver driver;
    private final LoginPage loginPage;
    private final LoginValidacao loginValidacao;
    private final HomePage homePage;

    public LoginTask (WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        loginValidacao = new LoginValidacao(driver);
        homePage = new HomePage(driver);
    }

    public void efetuarLoginRemetente() throws InterruptedException {
        loginValidacao.validationLogin();

        loginPage.getEmailInput().sendKeys(FileOperations.getProperties("user").getProperty("email2"));
        loginPage.getPasswordInput().sendKeys(FileOperations.getProperties("user").getProperty("password2"));
        loginPage.getLoginButton().click();

        Thread.sleep(100);

        WebElement numeroDigito = homePage.getNumeroDigitoConta();
        String numeroCompleto = numeroDigito.getText();
        String[] separados = numeroCompleto.split("-");
        String numero = separados[0];
        String digito = separados[1];

        FileOperations.setProperties("user", "numero2", numero);
        FileOperations.setProperties("user", "digito2", digito);

    } 

    
    public void efetuarLoginDestinatario() throws InterruptedException {
        loginValidacao.validationLogin();

        loginPage.getEmailInput().sendKeys(FileOperations.getProperties("user").getProperty("email"));
        loginPage.getPasswordInput().sendKeys(FileOperations.getProperties("user").getProperty("password"));
        loginPage.getLoginButton().click();

        Thread.sleep(100);

        WebElement numeroDigito = homePage.getNumeroDigitoConta();
        String numeroCompleto = numeroDigito.getText();
        String[] separados = numeroCompleto.split("-");
        String numero = separados[0];
        String digito = separados[1];

        FileOperations.setProperties("user", "numero", numero);
        FileOperations.setProperties("user", "digito", digito);

    } 
}
