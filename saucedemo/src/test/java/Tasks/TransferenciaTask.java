package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperations;
import PageObjects.TransferenciaPage;

public class TransferenciaTask {
    private final WebDriver driver;
    private final TransferenciaPage page;
    private final FakersGeneration faker;
    private final Waits waits;

    public TransferenciaTask(WebDriver driver) {
        this.driver = driver;
        page = new TransferenciaPage(driver);
        waits = new Waits(driver);
        faker = new FakersGeneration();
    }

    public void realizarTransferência() throws InterruptedException {
        Thread.sleep(100);
        page.getNumeroContaInput().sendKeys(FileOperations.getProperties("user").getProperty("numero"));
        page.getDigitoContaInput().sendKeys(FileOperations.getProperties("user").getProperty("digito"));
        page.getValorTransferencia().sendKeys("500");
        page.getDescricaoInput().sendKeys("Vai um pix aí");
        page.getTransferirButton().click();
        
        waits.loadElement(page.fecharButton());
        page.fecharButton().click();
        page.sairButton().click();
    }
}
