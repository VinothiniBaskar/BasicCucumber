package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 extends AbstractTestNGCucumberTests{
	//Declare a variable as private-->Locally create -->secret  
	private  static final ThreadLocal <RemoteWebDriver> rd=new ThreadLocal <RemoteWebDriver>();
	public void setMethod() {
		// use the ThreadLocal object and set the driver using the method set
		rd.set(new ChromeDriver());

	}

	public RemoteWebDriver getMethod() {
		// use the ThreadLocal object and get the value of the driver from setMethod
		return rd.get();

	}
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		// remove the new ChromeDriver and call the SetMethod
		setMethod();
		// Remove the driver where ever used and replace with all by getMethod()
		getMethod().get("http://leaftaps.com/opentaps/control/main");
		getMethod().manage().window().maximize();
	}

	@AfterMethod
	public void postCondition() {
		// driver.close();
	}
}


