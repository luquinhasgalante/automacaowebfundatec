package Tasks;

import org.openqa.selenium.WebDriver;
import Framework.Browser.Waits;
import PageObjects.FinishPage;
import Validacao.FinishValidacao;
import Validacao.LoginValidacao;

public class FinishTask {
    private WebDriver driver;
    private FinishPage finishPage;
    private FinishValidacao finishValidacao;
    private LoginValidacao loginValidacao;
    private Waits waits;

    public FinishTask(WebDriver driver) {
        this.driver = driver;
        finishPage =  new FinishPage(driver);
        waits = new Waits(driver);
        finishValidacao = new FinishValidacao(driver);
        loginValidacao = new LoginValidacao(driver);

    }

    public void finalizarCompra() throws InterruptedException {
        finishPage.getFinishButton().click();
        finishValidacao.validationSucessoCompra();
        finishPage.getMenuButton().click();
        waits.loadElement(finishPage.getMenuLogoutLink());
        finishPage.getMenuLogoutLink().click();
        loginValidacao.validationLogin();
    }
}
