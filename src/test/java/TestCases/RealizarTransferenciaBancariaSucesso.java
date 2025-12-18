package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Framework.Utils.TakeScreenshot;
import Tasks.CadastroTask;
import Tasks.ExtratoTask;
import Tasks.HomeTask;
import Tasks.LoginTask;
import Tasks.TransferenciaTask;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
@Epic("Teste de banco")
@Feature("Realizar uma transferência com sucesso")

public class RealizarTransferenciaBancariaSucesso extends TestBase {

    private final WebDriver driver = getDriverManager();
    
    private final LoginTask loginTask = new LoginTask(driver);
    private final CadastroTask cadastroTask = new CadastroTask(driver);
    private final HomeTask homeTask = new HomeTask(driver);
    private final TransferenciaTask transferenciaTask = new TransferenciaTask(driver);
    private final ExtratoTask extratoTask = new ExtratoTask(driver);
    

    @Test
    @Story("Dois usuarios fazem cadastro e login e uma transferência bancária é realizada.")
    @Description("Testa uma transferência bancária com sucesso")
    public void transferenciaBancaria() throws Exception {

        try {
            cadastroTask.realizarCadastroComSaldo();
            loginTask.efetuarLoginDestinatario();
            homeTask.sair();
            
            cadastroTask.realizarCadastroComSaldo2();
            loginTask.efetuarLoginRemetente();
            homeTask.comecarTransferencia();
            transferenciaTask.realizarTransferência();
            homeTask.acessarExtrato();
            extratoTask.checarExtrato();
            
            loginTask.efetuarLoginDestinatario();
            homeTask.acessarExtrato();
            extratoTask.checarExtrato();
            
        }catch (Exception e){
            TakeScreenshot.attachPageScreenshot(driver, "ERRO!!!");
            throw e;
        }

    }
}