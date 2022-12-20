package steps.defstatic;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClassStatic {
	@Given("Enter the username as {string}")
	public void enterUsername(String username) {
		getMethod().findElement(By.id("username")).sendKeys(username);
	}
	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		getMethod().findElement(By.id("password")).sendKeys(password);
	}
	@Given("Click on Login Button")
	public void clickLoginButton() {
		getMethod().findElement(By.className("decorativeSubmit")).click();
	}
	@When("Click Crm Link")
	public void clickCrmLink() throws InterruptedException {
		getMethod().findElement(By.linkText("CRM/SFA")).click();
		String title = getMethod().getTitle();
		System.out.println("Home page is Dispalyed "+title);
		
	}
	

}
