package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class HomePages  {
	
	Metodos metodos = new Metodos();
	
	By user = By.id("user-name");
	By senha = By.id("password");
	By btnLogin = By.id("login-button");

	private By password;

	
	
	public void login(String user, String password) {
		
		metodos.escrever (this.user, user);
		metodos.escrever(this.password, password);
		metodos.clicar (btnLogin);																			
		
	}

	
}

