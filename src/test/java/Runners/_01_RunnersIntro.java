package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/FeatureFiles/_01_Login.feature",
        tags = "@Smoke",
        glue = "StepDefinitions",
        plugin = {"json:target/cucumber.json"}

)
public class _01_RunnersIntro extends AbstractTestNGCucumberTests {
}
