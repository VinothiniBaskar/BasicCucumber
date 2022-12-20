package runnerstatic;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass1;
import steps.defstatic.BaseClassStatic;
@CucumberOptions(features="src/main/java/features/staticdata",
                 glue="steps/defstatic",
                 monochrome=true,
                 publish=true
                
                 )
public class RunnerLoginStatic  extends BaseClassStatic {

}