package org.dhiren.java.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dhiren.java.models.RestaurantMenuItem;
import org.junit.Assert;

import java.util.Arrays;

import static org.dhiren.java.service.MenuItemManagement.*;

public class MenuManagementStepDefinitions {

    private RestaurantMenuItem newItem;
    private String errorMessage;

    public MenuManagementStepDefinitions() {
        System.out.println("Constructor");
    }

    @Given("I have a menu item name \"([^\"]*)\" and price ([$]*)(\\d+)$")
    public void i_have_a_menu_item_name_and_price(String itemName, String currencyType, Integer price) {
            newItem = new RestaurantMenuItem(itemName, "test desc", price,currencyType);
    }

    @When("I add that menu item")
    public void i_add_that_menu_item() {
        try {
            add(newItem);
        } catch (IllegalStateException e) {
            errorMessage = e.getMessage();
        }
    }

    @Then("Menu item with name {string} should be added")
    public void menu_item_with_name_should_be_added(String itemName) {
        itemAvailable(itemName);
    }

    @Then("Menu item with name {string} and {string} both exists")
    public void menuItemWithNameAndBothExists(String arg0, String arg1) {
        Assert.assertTrue(bothItemAvailable(Arrays.asList(arg0,arg1)));
    }

    @Then("All Menu items should cost total price {int}")
    public void allMenuItemsShouldCostTotalPrice(int total) {
        Assert.assertEquals(calculatePrice(),total);
    }

    @When("I add those items")
    public void iAddThoseItems() {
        print();
    }

    @Given("I have a menu items {string} and {string} and price ${int} and ${int}")
    public void iHaveAMenuItemsAndAndPrice$And$(String item1, String item2, int price1, int price2) {
        RestaurantMenuItem item = new RestaurantMenuItem(item1, "" , price1,"$");
        RestaurantMenuItem itm = new RestaurantMenuItem(item2, "" , price2,"$");
        addAll(Arrays.asList(item,itm));
    }

    @Then("It should give an error message like {string}")
    public void itShouldGiveAnErrorMessageLike(String arg0) {
        Assert.assertEquals(arg0, errorMessage);
    }

}
