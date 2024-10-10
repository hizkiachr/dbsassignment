package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\fathi\\Documents\\Assesment\\dbs-indonesia-assignment\\src\\test\\resource\\features\\Login",
    glue = "stepDefinitions"
)

public class TestRunner {
}