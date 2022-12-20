package steps.hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksImpleementation  {
	public static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();

	protected void setMethod() {
		rd.set(new ChromeDriver());
	}

	protected RemoteWebDriver getMethod() {
		return rd.get();

	}

	@Before
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		setMethod();
		getMethod().get("http://leaftaps.com/opentaps/control/main");
		getMethod().manage().window().maximize();
		getMethod().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@After
	public void postCondition() {
		getMethod().close();
	}
}
