package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@Regression",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "json:target/reports/cucumber_json_RegressionReport.json",
                "junit:target/reports/cucumber_xml_RegressionReport.xml",
                "html:target/reports/cucumber_html_RegressionReport.html"}
)

public class RegressionRunner extends AbstractTestNGCucumberTests {

}