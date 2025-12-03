package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import PageObjects.HomePage;
import PageObjects.TransferenciaPage;
import Validacao.HomeValidacao;

public class HomeTask {
    private final WebDriver driver;
    private final HomePage page;
    private final HomeValidacao homeValidacao;
    private final TransferenciaPage transferenciaPage;
    private final Waits waits;

    public HomeTask(WebDriver driver) {
        this.driver = driver;
        page = new HomePage(driver);
        waits = new Waits(driver);
        transferenciaPage = new TransferenciaPage(driver);
        homeValidacao = new HomeValidacao(driver);
    }

    public void comecarTransferencia() throws InterruptedException {

        waits.loadElement(page.getTransferenciaButton());

        page.getTransferenciaButton().click();

    }
}
