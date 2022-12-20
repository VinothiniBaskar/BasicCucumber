package stpes.dynamic;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDynamic extends BaseClassDynamic {
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String string) {
		getMethod().findElement(By.id("username")).sendKeys(string);
		
	}
	@Given("Enter the password as {string}")
	public void enter_the_password_as(String string) {
		getMethod().findElement(By.id("password")).sendKeys(string);
	}
	@When("Click on  Login button")
	public void click_on_the_login_button() {
		getMethod().findElement(By.className("decorativeSubmit")).click();
	}
	@Then("HomPage should be displayed")
	public void home_page_should_be_displayed() {
		boolean displayed = getMethod().findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("HomePage is displayed");
		}else {
			System.out.println("HomePage is not displayed");
		}
	}
	
	@But("ErrorMessage should be displayed")
	public void errormsg() {
	  String text = getMethod().findElement(By.xpath("//div[@id='errorDiv']/p")).getText();
	  if (text.contains("The Following Errors")) {
		System.out.println("Error msg is displayed");
	}
	}
}
