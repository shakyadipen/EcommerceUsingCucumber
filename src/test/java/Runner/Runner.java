package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features=".//Features/Register.feature",
        glue={"stepDefinitions"},
        dryRun = false,
        monochrome=true,
        plugin ={"pretty","json:target/JsonReports/JsonReports.json",
                "html:target/HTMLReports/LoginReport.html"}
)
public class Runner {
}
