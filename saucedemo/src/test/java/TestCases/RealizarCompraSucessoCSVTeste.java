package TestCases;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

public class RealizarCompraSucessoCSVTeste extends TestBase {

    private final WebDriver driver = getDriverManager();

    LoginTask loginTask = new LoginTask(driver);
    ProdutoTask produtoTask = new ProdutoTask(driver);
    CheckoutTask checkoutTask = new CheckoutTask(driver);
    FinishTask finishTask = new FinishTask(driver);

    @ParameterizedTest
    @CsvFileSource(resources = "/resources/CSV/loginCSV.csv", numLinesToSkip = 1)
    public void realizarCompra(String user, String password) {

        try {

            loginTask.efetuarLoginCSV(user, password);
            produtoTask.selecionarProduto();
            checkoutTask.realizarCheckout();
            finishTask.finalizarCompra();

        }catch (Exception e){
            e.getMessage();
        }

    }
    
}
