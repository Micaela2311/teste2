package validar.name;

import static org.junit.Assert.assertTrue;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidarClima {
	
	Response response = RestAssured.get();

	/**
	 * Informar posição do dia desejado passando 0 para data atual, para os prox dias incrementar 
	 * + um número. Exemplo: results.forecast[1].max   colocamos [1] para representar d+1
	 * @param pathDia
	 */

	public void validarMax(String pathDia) {
		String masx = response.getBody().path("results.forecast["+pathDia+"].max", "validar o max");
         assertTrue(max.contains(maxDesejada));

}
}

