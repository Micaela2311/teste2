import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AcessarSite {
	
	WebDriver driver;
	String title;
	
	@Given("que acesse {string}")
	public void que_acesse(String string) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	
	    
	}

	@When("capturar o title")
	public void capturar_o_title() {
	    String title = driver.getTitle();
	}

	@Then("valido o title {string}")
	public void valido_o_title(String string) {
	    assertEquals(string, this.title);
	    driver.quit();
	   
	}
	
}
