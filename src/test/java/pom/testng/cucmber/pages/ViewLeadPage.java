package pom.testng.cucmber.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pom.testng.cucumber.base.BaseClass1;

public class ViewLeadPage extends BaseClass1{
	@Then("View Lead page is displayed")
	public void verify() {
		boolean displayed = getMethod().findElement(By.name("submitButton")).isDisplayed();
		Assert.assertTrue(displayed);
		String actualTitle="View Lead | opentaps CRM";
		String Title=getMethod().getTitle();
		Assert.assertEquals(actualTitle, Title);
		if (actualTitle.equals(Title)) {
			System.out.println("View Lead Title is matched");
		}else {
			System.out.println("View Lead Title is not matched");
		}
	}
}
	
	
