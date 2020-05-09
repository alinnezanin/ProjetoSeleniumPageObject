package tests;


import entities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CadastroPage;

public class ValidarCamposObrigatoriosPessoaTest extends BaseTest {

    String nome ="Aline";
    String sobrenome = "Zanin";
    String escolaridade = "Doutorado";
    String esporte = "Futebol";
    String sugestoes = "colocar o codigo no git";
    String textoDoAlerta = "";

    @Test
    public void deveValidarCamposObrigatoriosCadastroPessoa(){
        CadastroPage page = new CadastroPage(getDriver());

        page.clicarCadastrar();
        textoDoAlerta = page.capturarTextoAlerta();
        Assert.assertEquals(textoDoAlerta, "Nome eh obrigatorio");
        page.aceitarAlerta();
        page.preencherNome(nome);

        page.clicarCadastrar();
        textoDoAlerta = page.capturarTextoAlerta();
        Assert.assertEquals(textoDoAlerta, "Sobrenome eh obrigatorio");
        page.aceitarAlerta();
        page.preencherSobrenome(sobrenome);

        page.clicarCadastrar();
        textoDoAlerta = page.capturarTextoAlerta();
        Assert.assertEquals(textoDoAlerta, "Sexo eh obrigatorio");
        page.aceitarAlerta();
        page.selecionarSexoRadioButton();


        page.clicarCadastrar();

        Assert.assertEquals(page.capturarMensagemSucesso(), "Cadastrado!");
        Assert.assertEquals(page.capturarNomeResultado(), nome);
        Assert.assertEquals(page.capturarSobreNomeResultado(), sobrenome);
        Assert.assertEquals(page.capturarSexoResultado(), "Feminino");

    }




}
