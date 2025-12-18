package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperations;
import PageObjects.CadastroPage;
import Validacao.CadastroValidacao;

public class CadastroTask {
    private FakersGeneration fakers;
    private final WebDriver driver;
    private final CadastroPage page;
    private final CadastroValidacao cadastroValidacao;
    private final Waits waits;

    public CadastroTask(WebDriver driver) {
        this.driver = driver;
        waits = new Waits(driver);
        page = new CadastroPage(driver);
        cadastroValidacao = new CadastroValidacao(driver);
        fakers = new FakersGeneration();
    }
    
    public void realizarCadastroComSaldo() throws InterruptedException {
        cadastroValidacao.validationCadastro();

        page.getRegistrarButton().click();

        Thread.sleep(500);

        String email = fakers.getEmail();
        String senha = fakers.getPassword();
        String nome = fakers.getFirstName();
        
        FileOperations.setProperties("user", "email", email);
        FileOperations.setProperties("user", "password", senha);
        FileOperations.setProperties("user", "name", nome);
        
        page.getEmailInput().clear();
        page.getNomeInput().clear();
        page.getPasswordInput().clear();
        page.getPasswordConfirmationInput().clear();
        
        page.getEmailInput().sendKeys(email);
        page.getNomeInput().sendKeys(nome);
        page.getPasswordInput().sendKeys(senha);
        page.getPasswordConfirmationInput().sendKeys(senha);

        page.getSaldoButton().click();
        page.getCadastrarButton().click();

        waits.loadElement(page.getFecharButton());
        page.getFecharButton().click(); 
    }
    
    public void realizarCadastroComSaldo2() throws InterruptedException {
        cadastroValidacao.validationCadastro();

        page.getRegistrarButton().click();

        Thread.sleep(500);

        String email = fakers.getEmail();
        String senha = fakers.getPassword();
        String nome = fakers.getFirstName();
        
        FileOperations.setProperties("user", "email2", email);
        FileOperations.setProperties("user", "password2", senha);
        FileOperations.setProperties("user", "name2", nome);
        
        page.getEmailInput().clear();
        page.getNomeInput().clear();
        page.getPasswordInput().clear();
        page.getPasswordConfirmationInput().clear();
        
        page.getEmailInput().sendKeys(email);
        page.getNomeInput().sendKeys(nome);
        page.getPasswordInput().sendKeys(senha);
        page.getPasswordConfirmationInput().sendKeys(senha);

        page.getSaldoButton().click();
        page.getCadastrarButton().click();

        waits.loadElement(page.getFecharButton());
        page.getFecharButton().click(); 
    }
}
