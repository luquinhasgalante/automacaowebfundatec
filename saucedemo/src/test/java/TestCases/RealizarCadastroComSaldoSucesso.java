package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CadastroTask;
import Tasks.HomeTask;
import Tasks.LoginTask;
import Tasks.TransferenciaTask;

public class RealizarCadastroComSaldoSucesso extends TestBase {

    private final WebDriver driver = getDriverManager();
    
    LoginTask loginTask = new LoginTask(driver);
    CadastroTask cadastroTask = new CadastroTask(driver);
    HomeTask homeTask = new HomeTask(driver);
    TransferenciaTask transferenciaTask = new TransferenciaTask(driver);

    @Test
    public void realizarCadastro() {

        try {
            cadastroTask.realizarCadastro();
            loginTask.efetuarLoginDestinatario();
            homeTask.sair();
            
            cadastroTask.realizarCadastroComSaldo();
            loginTask.efetuarLoginRemetente();
            homeTask.comecarTransferencia();
            transferenciaTask.realizarTransferência();
            

        }catch (Exception e){
            e.getMessage();
        }

    }
}
