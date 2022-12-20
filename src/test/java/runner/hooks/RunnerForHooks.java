package runner.hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/feature/hooks/Login.feature",
                 glue="steps/hooks",
                 monochrome=true,
                 publish=true)
public class RunnerForHooks extends AbstractTestNGCucumberTests {

}
