package runnerfor.dynamic;

import io.cucumber.testng.CucumberOptions;
import stpes.dynamic.BaseClassDynamic;
@CucumberOptions(features="src/main/java/features/dynamic/CreateLeadDynamic.feature",
                 glue="stpes/dynamic",
                 monochrome=true,
                 publish=true)
public class RunnerForCreateLeadDynamic extends BaseClassDynamic {

}
