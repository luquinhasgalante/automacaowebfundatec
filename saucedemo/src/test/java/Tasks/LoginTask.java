package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Utils.FileOperations;
import PageObjects.HomePage;
import PageObjects.LoginPage;

public class LoginTask {

    private final WebDriver driver;
    private final LoginPage loginPage;
    private final HomePage homePage;

    public LoginTask (WebDriver driver){
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        homePage = new HomePage(driver);
    }

    public void efetuarLogin() throws InterruptedException{

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
