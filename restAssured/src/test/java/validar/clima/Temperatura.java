package validar.clima;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Temperatura {

	Response response = RestAssured.get("https://api.hgbrasil.com/weather/");

	@Test
	public void validarMaxHoje() {
		String max = response.getBody().path("results.forecast[0].max", "max de hoje").toString();
		System.out.println(max);

	}
}
