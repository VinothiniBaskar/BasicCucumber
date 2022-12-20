package runnerfor.dynamic;

import io.cucumber.testng.CucumberOptions;
import stpes.dynamic.BaseClassDynamic;
@CucumberOptions(features="src/main/java/features/dynamic//LoginDynamic.feature",
                 glue="stpes/dynamic",
                 monochrome=true,
                 publish=true,
                 tags="@Group2")
public class RunnerForDynamic extends BaseClassDynamic {

}
