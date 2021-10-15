package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonImplementation extends BaseClass{

	/*
	 * @Given("Open the chromebrowser") public void openBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * 
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * 
	 * }
	 */

	/*
	 * @And("Load the application Url as {string}") public void loadUrl(String url)
	 * { driver.get(url); }
	 */

	@And("Enter the username as {string}")
	public void enterUsername(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);

	}

	@And("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);

	}

	@When("Click the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@Then("Homepage should be displayed")
	public void displayHomePage() {

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Homepage is displayed");
		} else {
			System.out.println("Homepage is not displayed");
		}

	}

	@But("Error message should be displayed")
	public void displayError() {
		System.out.println("Error message is displayed");

	}
	
	@When("Click the {string} link")
	public void clickLink(String link) {
		driver.findElement(By.xpath("//a[contains(text(),'" + link + "')]")).click();
	}

	@Then("{string} page should be displayed")
	public void verifyPage(String page) {
		System.out.println("The page " + page + " is displayed");

	}
}
