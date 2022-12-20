package runner;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass1;
@CucumberOptions(features="src/main/java/features",
                 glue="steps",
                 monochrome=true,
                 publish=true,
                 tags="@Group1 or @Group2"  )
public class RunnerLogin extends BaseClass1 {

}