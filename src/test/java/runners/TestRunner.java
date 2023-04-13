package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
        tags = "@test",
        features = {"src/test/resources/features"}, // Path to your feature files
        glue = {"steps"}, // Package where your step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for generating reports

)
public class TestRunner {

}
