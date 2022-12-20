package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass1 {
	@Given("Click leads button")
	public void click_leads_button() throws InterruptedException {
		Thread.sleep(3000);
		getMethod().findElement(By.linkText("Leads")).click();
	}
	@Given("Click create lead")
	public void click_create_lead() {
		getMethod().findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter the Company name")
	public void enter_the_company_name() {
		getMethod().findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	}
	@Given("Enter the First name")
	public void enter_the_first_name() {
		getMethod().findElement(By.id("createLeadForm_firstName")).sendKeys("Vino");
	}
	@Given("Enter the Last name")
	public void enter_the_last_name() {
		getMethod().findElement(By.id("createLeadForm_lastName")).sendKeys("B");
	}
	@When("Click create lead button")
	public void click_create_lead_button() {
		getMethod().findElement(By.name("submitButton")).click();
	}
	
}
