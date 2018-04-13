package teste;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.AWTException;
import java.awt.Robot;

import core.BasePage;
import core.DriverFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Teste {
	BasePage bp = new BasePage();
	
	@Given("^testeBanco - Acessar a tela inicial$")
	public void acessarPaginaInicial() {
		bp.abrirPage("http://www.bancoripley.com.pe/bancoripley/home/index.html#");
	}
	
	@When("^testeBanco - Clicar na opcao credito$")
	public void clicarCreditos() throws InterruptedException {
		bp.acao("//*[@id=\"MMMenu0805194703_0_Item_0\"]");
	}
	
	@When("^testeBanco - Escolher opcao$")
	public void clicarNaPrimeiraOpcao() throws InterruptedException {
		  
	}
	
	@When ("^CT01 - Escolher um seguro de carro$")
public void escolherSeguroDeCarro() {
		
	}
	
	@When ("^CT01 - Escolher a marca Citroen$")
	public void escolherMarca() {
		
	}
	
	@When ("^CT01 - Escolher o modelo 2014/2014$")
	public void escolherModelo() {
		
	}
	
	@When ("^CT01 - Escolher o modelo C3 PICASSO GLX 1.6 16V FLEX$")
	public void escolherModelo2() {
		
	}
	
	@When ("^CT01 - Clique em iniciar Cota��o$")
	public void clicarIniciarCotacao() {
		
	}
}
