package co.com.certificacion.RetoSaucedemoS.runner;



import co.com.certificacion.RetoSaucedemoS.util.Generica.BeforeSuite;
import co.com.certificacion.RetoSaucedemoS.util.Generica.DataToFeature;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

//@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/CompraSaucedemo.feature",
        //tags = "@login",
        glue = {"co.com.certificacion.RetoSaucedemoS.stepdefinitions"},
        plugin = {"pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)


@RunWith(RunnerPersonalizado.class)

public class SaucedemoRunner
{
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/feature/CompraSaucedemo.feature"); }
}
