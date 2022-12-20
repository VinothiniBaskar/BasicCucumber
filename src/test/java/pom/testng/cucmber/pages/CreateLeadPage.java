package pom.testng.cucmber.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pom.testng.cucumber.base.BaseClass1;

public class CreateLeadPage extends BaseClass1 {
	@And("Enter the company name as (.*)$")
	public CreateLeadPage enterCompanyname(String companyname) {
		getMethod().findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		return this;
	}
	@And("Enter the first name as (.*)$")
	public CreateLeadPage enterFirstname(String firstname) {
		getMethod().findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		return this;
	}
	@And("Enter the lastname as (.*)$")
	public CreateLeadPage enterLastname(String lastname) {
		getMethod().findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		return this;
	}
	@When("Click Create Lead button")
	public ViewLeadPage clickCreateLeadButton() {
		getMethod().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}
