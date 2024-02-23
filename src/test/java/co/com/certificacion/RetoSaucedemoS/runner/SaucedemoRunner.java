package co.com.certificacion.RetoSaucedemoS.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/CompraSaucedemo.feature",
        //tags = "@login",
        glue = {"co.com.certificacion.RetoSaucedemoS.stepdefinitions"},
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class SaucedemoRunner
{
}
