package runners.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/main/resources/feature/Signupp.feature" , glue ="steps" , tags = "@Sanity" , plugin = {"pretty" , "html:target/reports/report.html" , })

public class TestRunner extends AbstractTestNGCucumberTests {

}
