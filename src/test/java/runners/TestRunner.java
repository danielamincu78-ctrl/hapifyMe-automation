package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Calea către fișierele feature (folderul resources)
        features = "src/test/resources/features",

        // Pachetul unde se află clasele Java cu @Given, @When (glue code)
        glue = "stepdefinitions",

        // tags = "@smoke or @regression", // Rulează testele care au ORICARE din aceste tag-uri
        tags = "@smoke", // Rulează smoke, dar exclude negative

        // Plugin-uri pentru rapoarte (în consolă și HTML)
        plugin = {"pretty", "html:target/cucumber-report.html"},

        // Face output-ul din consolă mai ușor de citit
        monochrome = true
)
public class TestRunner {
    // Această clasă rămâne goală!
    // Ea servește doar ca suport pentru adnotări.
}