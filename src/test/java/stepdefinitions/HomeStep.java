package stepdefinitions;

import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeStep {
    @When("click file upload")
    public void click_Upload_File(){
        new HomePage().click_Upload_File();
    }

    @When("click Dynamic Loading")
    public void click_Dynamic_Loading(){
        new HomePage().click_Dynamic_Loading();
    }
}
