package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLead extends BaseClass{
	
	@Given ("Enter the First name as {string}")
	public void firstNameEditLead(String fName) {
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.xpath( "(//input[@name='firstName'])[3]")).sendKeys(fName);
	}
	
	@When ("Click the Find Leads button")
	public void buttonClickEditLead() {
		 driver.findElement(By.xpath( "//button[text()='Find Leads']")).click();

	}
	
	@When ("Click the Update button")
	public void buttonUpdate() {
		// driver.findElement(By.xpath( "//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@value = 'Update']")).click();
	}
	
	@When ("Click the first name link in the first name column") 
	public void clickLeadList() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();

	}
	
	
	  @Given ("Enter the Company name as {string}") 
	  public void companyNameUpdate(String compName) {
	  driver.findElement(By.id("updateLeadForm_companyName")).clear();
	  driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(compName);
	  
	  }

}
