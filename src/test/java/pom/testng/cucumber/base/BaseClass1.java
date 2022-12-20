package pom.testng.cucumber.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 extends AbstractTestNGCucumberTests{
	// declare a ThreadLocal class
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();

	// Create a set method
	public void setMethod() {
       rd.set(new ChromeDriver());
	}

	// Create a get method
	public RemoteWebDriver getMethod() {
		return rd.get();

	}
	
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		setMethod();
		getMethod().get("http://leaftaps.com/opentaps/control/main");
		getMethod().manage().window().maximize();
		getMethod().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@AfterMethod
	public void postCondition() {
		// driver.close();
	}
	
}

