package pom.testng.cucumber.testcasesandruuner;

import io.cucumber.testng.CucumberOptions;
import pom.testng.cucumber.base.BaseClass1;

@CucumberOptions(features="src/test/java/features",
                glue="/pom/testng/cucmber/pages",
                monochrome=true,
                 publish=true,
                 tags="@Group1 or @Group2")

public class RunnerCucumber  extends BaseClass1{

}
