package pom.testng.cucmber.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import pom.testng.cucumber.base.BaseClass1;

public class MyHomePage extends BaseClass1 {
	@And("Click Leads button")
	public MyLeadsPage clickLeads() {
		getMethod().findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();

	}

}
