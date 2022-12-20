package pom.testng.cucmber.pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pom.testng.cucumber.base.BaseClass1;

public class LoginPage  extends BaseClass1{
	@Given("Enter the username as {string}")
	public LoginPage enterUsername(String username) {
	    getMethod().findElement(By.id("username")).sendKeys(username);
	    return this;
	}
	@And("Enter the password as {string}")
	public LoginPage enterPassword(String password) {
	    getMethod().findElement(By.id("password")).sendKeys(password);
	    return this;

	}
	@When("Click Login button")
	public WelcomePage clickLoginButton() {
	    getMethod().findElement(By.className("decorativeSubmit")).click();
	    return new WelcomePage();
	}
	
}
