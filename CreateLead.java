package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead  extends BaseClass{
	
	@Given("Enter the company name as {string}")
	public void companyName(String compName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compName);

	}
	
	@And ("Enter the first name as {string}")
	public void firstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

	}
	
	
	
	@Given ("Enter the first name field as {string}")
	public void firstNameMergeLead(String firstName) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
	}
	@And ("Enter the last name as {string}")
	public void lastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);

	}
	@When ("Click the Create Lead button")
	public void buttonClick() {
		driver.findElement(By.name("submitButton")).click();

	}
	
	
	
	@Then ("New lead should be created")
	public void createLead() {
		System.out.println("New lead is created successfully");

	}
	
	
	 
	 
	 
}
