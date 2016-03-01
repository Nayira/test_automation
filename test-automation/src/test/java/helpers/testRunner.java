package helpers;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/main/resources/features"},
        glue={"stepDefinitions.commonStepDefinitions"})
public class testRunner {}
