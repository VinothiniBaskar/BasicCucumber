package pom.testng.cucumber.testcasesandruuner;

import org.testng.annotations.Test;

import pom.testng.cucmber.pages.LoginPage;
import pom.testng.cucumber.base.BaseClass1;

public class RunLogin extends BaseClass1{
	
	@Test
	public void runLogin() throws InterruptedException {
		LoginPage lp=new LoginPage();
		lp.enterUsername("Democsr2")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.clickCrmLink();
		
		

	}

}
