package StepDefinitions;


import POM.Login_Page_Elements;
import Utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {

    WebDriver driver = Driver.getDriver();

    Login_Page_Elements lp = new Login_Page_Elements();

    @Before
    public void setup() {
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        lp.loginFunction("abcd", "abcd");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {

            TakesScreenshot screenshot = ((TakesScreenshot) driver); // which driver to get a screenshot

            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            String scenarioName = scenario.getName();

            File destinationFile = new File("target/reports/FailedScreenshots/" + scenarioName + ".png");

            try {
                FileUtils.copyFile(srcFile, destinationFile);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        Driver.quitDriver();
    }
}