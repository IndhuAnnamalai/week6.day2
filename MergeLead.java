package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class MergeLead extends BaseClass{
	
	public List<String> allhandles;
	public List<String> allhandles2;
	
	 @When ("Click the Icon in the From lead text box")
	  public void clickFromIcon() {
		  driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
			Set<String> allWindows = driver.getWindowHandles();
			allhandles = new ArrayList<String>(allWindows);
			driver.switchTo().window(allhandles.get(1));

	}
	  @When ("Click the Icon in the To lead text box")
	  public void clickToIcon() {
		
		  driver.switchTo().window(allhandles.get(0));
		  
		  driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		  Set<String> allWindows2 = driver.getWindowHandles(); 
		  allhandles2 = new ArrayList<String>(allWindows2);
		  driver.switchTo().window(allhandles2.get(1));
	}
	  @When ("Click the Merge button")
	  public void mergeClick() {
			driver.switchTo().window(allhandles2.get(0));
			driver.findElement(By.xpath("//a[text()='Merge']")).click();
			driver.switchTo().alert().accept();

		}
	 

}
