package steps.defstatic;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadStatic extends BaseClassStatic {
	@Given("Click Leads button")
	public void clickLeadsButton() {
getMethod().findElement(By.linkText("Leads")).click();

	}
	@Given("Click create lead")
	public void clickCreateLead() {
		getMethod().findElement(By.linkText("Create Lead")).click();

	}
	@Given("Enter the company name as {string}")
	public void enterCompanyname(String companyName) {
		getMethod().findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

	}
	@Given("Enter the first name as {string}")
	public void enterFirstname(String firstName) {
		getMethod().findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}
	@Given("Enter the last name as {string}")
	public void enterLastname(String lastName) {
		getMethod().findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}
	@When("Click create lead button")
	public void clickCreateLeadButton() {
		getMethod().findElement(By.name("submitButton")).click();

	}
	
}