package pom.testng.cucmber.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import pom.testng.cucumber.base.BaseClass1;

public class WelcomePage extends BaseClass1 {
	@Given("Click CRMLink")
	public MyHomePage clickCrmLink() throws InterruptedException {
		
		getMethod().findElement(By.linkText("CRM/SFA")).click();
		String actualTitle="My Home | opentaps CRM";
		String Title=getMethod().getTitle();
		Assert.assertEquals(actualTitle, Title);
		if (actualTitle.equals(Title)) {
			System.out.println("Title is matched");
		}else {
			System.out.println("Title is not matched");
		}
		return new MyHomePage();

	}

}
