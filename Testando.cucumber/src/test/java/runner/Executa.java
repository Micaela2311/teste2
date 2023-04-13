package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "steps",
		tags = "@teste",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","json:target/cucumber-report.json","html:target/cucumber-report.html"},
		snippets = SnippetType.CAMELCASE
		
	

		)
public class Executa {
	
	public static void iniciarTeste() {
		String site = "https://saucedemo.com";
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}
	

}
