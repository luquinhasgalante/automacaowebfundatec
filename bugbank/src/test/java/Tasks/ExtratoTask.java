package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.ExtratoPage;
import Validacao.ExtratoValidacao;

public class ExtratoTask {
    private final WebDriver driver;
    private final ExtratoPage page;
    private final ExtratoValidacao extratoValidacao;

    public ExtratoTask(WebDriver driver) {
        this.driver = driver;
        page = new ExtratoPage(driver);
        extratoValidacao = new ExtratoValidacao(driver);
    }

    public void checarExtrato() throws InterruptedException {
        Thread.sleep(100);
        extratoValidacao.validationValorExtrato();
        page.getSairButton().click();
        Thread.sleep(1000);
    }

}
