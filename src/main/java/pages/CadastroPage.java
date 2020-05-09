package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CadastroPage extends BasePage{


    @FindBy(id = "elementosForm:nome")
    private WebElement nomeTextField;
    @FindBy(id = "elementosForm:sobrenome")
    private WebElement sobrenomeTextField;
    @FindBy(id = "elementosForm:sexo:1")
    private WebElement sexoRadioButton;
    @FindBy(id = "elementosForm:comidaFavorita:0")
    private WebElement comidaCheck;
    @FindBy(id = "elementosForm:escolaridade")
    private Select escolaridadeSelect;
    @FindBy(id = "elementosForm:esportes")
    private Select esporteSelect;
    @FindBy(id = "elementosForm:sugestoes")
    private WebElement sugestoesTextArea;
    @FindBy(id = "elementosForm:cadastrar")
    private WebElement cadastrarButton;
    @FindBy(id ="alert")
    private WebElement alertButton;
    @FindBy(xpath ="//*[@id='resultado']/span")
    private WebElement msgSucessoCadastro;
    @FindBy(xpath ="//*[@id='descNome']/span")
    private WebElement nomeResultado;
    @FindBy(xpath ="//*[@id='descSobrenome']/span")
    private WebElement sobreNomeResultado;
    @FindBy(xpath ="//*[@id='descSexo']/span")
    private WebElement sexoResultado;
    @FindBy(xpath ="//*[@id='descComida']/span")
    private WebElement comidaFavoritaResultado;
    @FindBy(xpath ="//*[@id='descEscolaridade']/span")
    private WebElement escolaridadeResultado;
    @FindBy(xpath ="//*[@id='descEsportes']/span")
    private WebElement esporteResultado;
    @FindBy(xpath ="//*[@id='descSugestoes']/span")
    private WebElement sugestoesResultado;


    public CadastroPage(WebDriver driver) {
        super(driver);
    }


    public CadastroPage preencherNome(String nome) {
        nomeTextField.sendKeys(nome);
        return this;
    }

    public CadastroPage preencherSobrenome(String sobrenome) {
        sobrenomeTextField.sendKeys(sobrenome);
        return this;
    }

    public CadastroPage selecionarSexoRadioButton() {
        sexoRadioButton.click();
        return this;
    }

    public CadastroPage selecionarComidaCheck() {
        comidaCheck.click();
        return this;
    }

    public CadastroPage selecionarEscolaridade(String escolaridade) {
        escolaridadeSelect.selectByVisibleText(escolaridade);
        return this;
    }

    public CadastroPage selecionarEsporte(String esporte) {
        esporteSelect.selectByVisibleText(esporte);
        return this;
    }

    public CadastroPage preencherSugestoes(String sugestao) {
        sugestoesTextArea.sendKeys(sugestao);
        return this;
    }

    public CadastroPage ClicarCadastrar() {
        cadastrarButton.click();
        return this;
    }

    public CadastroPage clicarAlertButton(){
        alertButton.click();
        return this;
    }

    public String capturarMensagemSucesso(){
        return msgSucessoCadastro.getText();
    }

    public String capturarNomeResultado(){
        return nomeResultado.getText();
    }
    public String capturarSobreNomeResultado(){
        return sobreNomeResultado.getText();
    }
    public String capturarSexoResultado(){
        return sexoResultado.getText();
    }
    public String capturarComidaFavoritaResultado(){
        return comidaFavoritaResultado.getText();
    }
    public String capturarEscolaridadeResultado(){
        return escolaridadeResultado.getText();
    }
    public String capturarEsporteResultado(){
        return esporteResultado.getText();
    }
    public String capturarSugestoesResultado(){
        return sugestoesResultado.getText();
    }











}
