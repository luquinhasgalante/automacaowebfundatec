package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CadastroTask;
import Tasks.ExtratoTask;
import Tasks.HomeTask;
import Tasks.LoginTask;
import Tasks.TransferenciaTask;

public class RealizarTransferenciaBancariaSucesso extends TestBase {

    private final WebDriver driver = getDriverManager();
    
    private final LoginTask loginTask = new LoginTask(driver);
    private final CadastroTask cadastroTask = new CadastroTask(driver);
    private final HomeTask homeTask = new HomeTask(driver);
    private final TransferenciaTask transferenciaTask = new TransferenciaTask(driver);
    private final ExtratoTask extratoTask = new ExtratoTask(driver);
    

    @Test
    public void transferenciaBancaria() {

        try {
            cadastroTask.realizarCadastroComSaldo();
            loginTask.efetuarLoginDestinatario();
            homeTask.sair();
            
            cadastroTask.realizarCadastroComSaldo();
            loginTask.efetuarLoginRemetente();
            homeTask.comecarTransferencia();
            transferenciaTask.realizarTransferência();
            homeTask.acessarExtrato();
            extratoTask.checarExtrato();

        }catch (Exception e){
            e.getMessage();
        }

    }
}