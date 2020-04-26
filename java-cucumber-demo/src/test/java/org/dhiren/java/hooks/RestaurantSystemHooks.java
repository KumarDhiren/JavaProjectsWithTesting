package org.dhiren.java.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.dhiren.java.service.MenuItemManagement;

public class RestaurantSystemHooks {
    @Before
    public void beforeDisplayMessage(Scenario scenario) {
        System.out.println("Before Execution of scenario "+scenario.getName());
    }

    @After
    public void afterDisplayMessage(Scenario scenario) {
        MenuItemManagement.clear();
        System.out.println("After Execution of scenario "+scenario.getName());
    }
}
