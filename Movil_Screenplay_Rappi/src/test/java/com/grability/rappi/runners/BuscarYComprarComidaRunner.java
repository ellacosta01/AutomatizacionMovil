package com.grability.rappi.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\com.grability.rappi\\buscar_y_comprar.feature",
        glue="com.grability.rappi.stepdefinitions",
        snippets= SnippetType.CAMELCASE)

public class BuscarYComprarComidaRunner {
}
