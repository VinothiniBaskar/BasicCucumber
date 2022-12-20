package pom.testng.cucumber.testcasesandruuner;

import org.testng.annotations.Test;

import pom.testng.cucmber.pages.LoginPage;
import pom.testng.cucumber.base.BaseClass1;

public class RunCreateLead extends BaseClass1 {

	@Test
	public void runCreateLead() throws InterruptedException {
		LoginPage lp=new LoginPage();
		lp.enterUsername("Democsr2")
		.enterPassword("crmsfa")
		.clickLoginButton()
		.clickCrmLink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyname("HCL")
		.enterFirstname("Vasanthi")
		.enterLastname("A")
		.clickCreateLeadButton()
		.verify();
		

	}
	

}
