package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = {"src/test/java"},
        glue = {"stepsDefinition"},

        dryRun = false
)






public class RunnerGeneralTests extends AbstractTestNGCucumberTests {
}
