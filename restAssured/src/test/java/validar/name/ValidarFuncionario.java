package validar.name;

import org.junit.Test;

import metodos.Metodos;

public class ValidarFuncionario {

	
	Metodos metodos = new Metodos();
	
	@Test
	public void testsStatusCode() {
		metodos.validarStatusCode(200);
	}
	
	@Test
	public void testValidarName() {
		metodos.validarName("Professional");
	}
}

