package org.example.TestRunner;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
        features = "src\\main\\resources\\features",
        glue = "org/example",
        plugin = {
                "pretty:target/cucumber.pretty",
                "html:target/cucumber.html",
                "json:target/Cucumber.json",
                "rerun:target/rerun.txt",
                "junit:target/cakes.txt",
        },
        tags = "@regression"
)
public class Runner extends AbstractTestNGCucumberTests {
}




