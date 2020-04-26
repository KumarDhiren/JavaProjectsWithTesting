package org.dhiren.java.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class BillGenerationStepDefinitions {

    @Given("I placed order for following items")
    public void i_placed_order_for_following_items(DataTable dataTable) {
        List<String> billdata = dataTable.asList();
        System.out.println(billdata);
    }

    @When("I generate the bill")
    public void i_generate_the_bill() {

    }

    @Then("A bill for $40 should be generated")
    public void a_bill_for_$40_should_be_generated() {

    }

}
