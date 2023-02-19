package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "json:target/reports/cucumber_json_SmokeReport.json",
                "junit:target/reports/cucumber_xml_SmokeReport.xml",
                "html:target/reports/cucumber_html_SmokeReport.html"}
)

public class SmokeRunner extends AbstractTestNGCucumberTests {
}
