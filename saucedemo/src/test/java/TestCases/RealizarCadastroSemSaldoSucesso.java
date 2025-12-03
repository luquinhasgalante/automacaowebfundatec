package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CadastroTask;
import Tasks.LoginTask;

public class RealizarCadastroSemSaldoSucesso extends TestBase {

    private final WebDriver driver = getDriverManager();
    
    LoginTask loginTask = new LoginTask(driver);
    CadastroTask cadastroTask = new CadastroTask(driver);

    @Test
    public void realizarCompra() {

        try {
            cadastroTask.realizarCadastro();
            loginTask.efetuarLogin();

        }catch (Exception e){
            e.getMessage();
        }

    }
}
