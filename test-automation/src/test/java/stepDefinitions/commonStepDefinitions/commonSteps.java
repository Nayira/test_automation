package stepDefinitions.commonStepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

public class commonSteps {

    @Steps
    String steps = "test";

        @Given("some conditions are met")
        public void testOneGiven(){
            int test = 4;
            assert test == 4;
        }

        @When("I do a thing")
        public void testOneWhen(){
            int test = 4;
            assert test == 4;
        }

        @Then("another thing happens")
        public void testOneThen(){
            int test = 4;
            assert test == 4;
        }

        @Then("this other thing happens")
        public void testAnotherOneThen(){
            int test = 4;
            assertEquals(5, test);
        }

}
