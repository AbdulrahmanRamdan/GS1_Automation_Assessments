package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.DynanicLoadingPage;

public class DynamicLoaingSteps {
    @And("click Example2")
    public void click_Example2(){
        new DynanicLoadingPage().click_Example2();
    }
    @And("click start")
    public void click_Start(){
        new DynanicLoadingPage().click_Start();
    }
    @Then("Verify text appearance")
    public void verify_text_appearance(){
        new DynanicLoadingPage().verify_text_appearance();
    }
}
