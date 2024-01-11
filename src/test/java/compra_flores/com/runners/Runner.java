package compra_flores.com.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/compra_flores.com.feature",
        tags = "@Filtrar",
        glue = "compra_flores.com.stepdefinitions",
        plugin = "pretty",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class Runner {
}
