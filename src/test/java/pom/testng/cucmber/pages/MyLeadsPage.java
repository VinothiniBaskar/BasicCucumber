package pom.testng.cucmber.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import pom.testng.cucumber.base.BaseClass1;

public class MyLeadsPage extends BaseClass1 {
	@And("Click Create Lead")
	public CreateLeadPage clickCreateLead() {
		getMethod().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

	}


}
