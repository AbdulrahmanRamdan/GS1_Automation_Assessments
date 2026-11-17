
package hooks;

import drivers.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void beforeScenario() {
        DriverFactory.initDriver();
    }

    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot)
                    DriverFactory.getDriver())
                    .getScreenshotAs(OutputType.BYTES);

            scenario.attach(
                    screenshot,
                    "image/png",
                    "Failure Screenshot"
            );
        }

        DriverFactory.quitDriver();
    }
}
