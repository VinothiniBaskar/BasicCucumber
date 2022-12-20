package stpes.dynamic;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadDynamic extends BaseClassDynamic  {
	@Given("Click CRMSFA link")
	public void clickcrmsfa() {
		getMethod().findElement(By.linkText("CRM/SFA")).click();
	
	}
	@And("Click Leads Button")
	public void clickLeads() {
		getMethod().findElement(By.linkText("Leads")).click();
	}
	@And("Click CreateLead link")
	public void clickCreateLead() {
		getMethod().findElement(By.linkText("Create Lead")).click();
	}
	@When("Enter the companyName as (.*)$")
	public void enterCompanyName(String companyName) {
		getMethod().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@And("Enter the firstName as (.*)$")
	public void enterFirstName(String firstName) {
		getMethod().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	@And("Enter the LastName as (.*)$")
	public void enterLastName(String lastName) {
		getMethod().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@And("Click on the CreateLeads Button")
	public void clickCreateLeadButton() {
		getMethod().findElement(By.name("submitButton")).click();
	}
}
