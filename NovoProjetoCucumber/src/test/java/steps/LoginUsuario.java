package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePages;
import runner.Executa;

public class LoginUsuario {

	HomePages home = new HomePages();
	Executa executa = new Executa();

	@Given("que desejo fazer login")
	public void queDesejoFaerLogin() {
		Executa.iniciarTeste();
	}

	@When("enviar dados validos")
	public void enviarDadosValidos() {
		home.login("standard_user", "secret_sauce");

	}

	@Then("usuario logado")
	public void usuariologado() {
	}
}
