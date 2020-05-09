package tests;


import entities.BaseTest;
import io.sicredi.tm4j.common.annotations.TestCase;
import io.sicredi.tm4j.testng.TM4JTestNGListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.CadastroPage;

//@Listeners(TM4JTestNGListener.class)
public class CadastrarPessoaTest extends BaseTest {

  /*  String nome ="Aline";
    String sobrenome = "Zanin";
    String escolaridade = "Doutorado";
    String esporte = "Futebol";
    String sugestoes = "colocar o codigo no git";*/

    //@TestCase(key = "12121")
    @Test(dataProvider="providerPessoa",dataProviderClass= DataProvider.class)
    public void deveCadastrarPessoa(String none, String sobrenome, String escolaridade, String esporte, String sugestao){
      preCond();
        CadastroPage cp = new CadastroPage(getDriver());
                 cp.preencherNome(none)
                .preencherSobrenome(sobrenome)
                .selecionarSexoRadioButton()
                .selecionarComidaCheck()
                .selecionarEscolaridade(escolaridade)
                .selecionarEsporte(esporte)
                .preencherSugestoes(sugestao)
                .clicarCadastrar();
        Assert.assertEquals(cp.capturarMensagemSucesso(), "Cadastrado!");
        Assert.assertEquals(cp.capturarNomeResultado(), none);
        Assert.assertEquals(cp.capturarSobreNomeResultado(), sobrenome);
        Assert.assertEquals(cp.capturarSexoResultado(), "Feminino");
        Assert.assertEquals(cp.capturarComidaFavoritaResultado(), "Carne");
        Assert.assertEquals(cp.capturarEscolaridadeResultado(), escolaridade.toLowerCase());
        Assert.assertEquals(cp.capturarEsporteResultado(), esporte);
        Assert.assertEquals(cp.capturarSugestoesResultado(), sugestao);
        posCond();
    }







}
