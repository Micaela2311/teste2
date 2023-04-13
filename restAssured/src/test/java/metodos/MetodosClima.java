package metodos;

import org.junit.Test;

public class MetodosClima {
	
	MetodosClima metodos = new MetodosClima();
	
	@Test
	public void validarMaxHoje() {
		metodos.validarMaxHoje("0", "29");
	}
	@Test
	public void validarMaxAmanha() {
		metodos.validarMaxAmanha("1", "31");
	}

}

