package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends BaseClass1 {
	@Given("Enter the Username as Democsr2")
	public void enterUsername() {
		getMethod().findElement(By.id("username")).sendKeys("Democsr2");
	}

    //For positive
	@Given("Enter the Password as crmsfa")
	public void enterPassword() {
		getMethod().findElement(By.id("password")).sendKeys("crmsfa");

	}

	// For negative
	@Given("Enter the Password as crmfal")
	public void enterPasswordForNegaive() {
		getMethod().findElement(By.id("password")).sendKeys("crmfal");

	}

	@When("Click on Login Button")
	public void clickLoginButton() {
		getMethod().findElement(By.className("decorativeSubmit")).click();

	}

	@When("Click on CrmLink")
	public void clickCrmLink() {
		WebElement home = getMethod().findElement(By.linkText("CRM/SFA"));
		home.click();
		String homePage = getMethod().getTitle();
		if (homePage.contains("My Home")) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is not displayed");

		}
	}

	@But("ErrorMessage should be displayed")
	public void errormsg() {
		String text = getMethod().findElement(By.xpath("//div[@id='errorDiv']/p")).getText();
		if (text.contains("The Following Errors")) {
			System.out.println("Error msg is displayed");
		} else {
			System.out.println("Error msg is not  displayed");

		}
	}
}
