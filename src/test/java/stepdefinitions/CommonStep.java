package stepdefinitions;

import drivers.DriverFactory;
import io.cucumber.java.en.Given;

public class CommonStep {
    @Given("User opens the internet herokuapp website")
    public void open_herokuapp_site(){
        DriverFactory.getDriver().get("https://the-internet.herokuapp.com/");
    }
}
