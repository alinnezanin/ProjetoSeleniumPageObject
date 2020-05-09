package tests;


import entities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CadastroPage;

import java.util.Map;

public class CadastrarPessoaTest extends BaseTest {

    String nome ="Aline";
    String sobrenome = "Zanin";
    String escolaridade = "Doutorado";
    String esporte = "Futebol";
    String sugestoes = "colocar o codigo no git";



    @Test
    public void deveCadastrarPessoa(){
        CadastroPage cp = new CadastroPage(getDriver());
                 cp.preencherNome(nome)
                .preencherSobrenome(sobrenome)
                .selecionarSexoRadioButton()
                .selecionarComidaCheck()
                .selecionarEscolaridade(escolaridade)
                .selecionarEsporte(esporte)
                .preencherSugestoes(sugestoes)
                .ClicarCadastrar();
        Assert.assertEquals(cp.capturarMensagemSucesso(), "Cadastrado!");
        Assert.assertEquals(cp.capturarNomeResultado(), nome);
        Assert.assertEquals(cp.capturarSobreNomeResultado(), sobrenome);
        Assert.assertEquals(cp.capturarSexoResultado(), "Feminino");
        Assert.assertEquals(cp.capturarComidaFavoritaResultado(), "Carne");
        Assert.assertEquals(cp.capturarEscolaridadeResultado(), escolaridade);
        Assert.assertEquals(cp.capturarEsporteResultado(), esporte);
        Assert.assertEquals(cp.capturarSugestoesResultado(), sugestoes);


    /*Colocar os assert neste teste
      --- DENTRO DE PRIMEIROS PASSOS CADASTRO PESSOA*/
    }

    /*colocar no padrão pageobject o teste das
     regras de negocio
    --- TESTS PARTE 2 VERIFICAR REGRA DE NEGOCIO*/

    /*colocar no padrão pageobject o teste dos botoes
    --- TESTS PARTE 2 VerificaComportamentoPopUps*/





}
