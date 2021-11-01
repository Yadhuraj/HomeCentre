package com.mindtree.StepDefinition;

import org.junit.runner.RunWith;

import com.mindtree.PageObject.SearchItem;
import com.mindtree.ReusableComponents.BaseClass;
import com.mindtree.ReusableComponents.DriverFunctions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class SearchItemSD extends BaseClass{

    @Given("^the webpage is loaded$")
    public void the_webpage_is_loaded() throws Throwable {
      System.out.println(driver.getTitle());
    }

    @Then("^send the reruired items$")
    public void send_the_reruired_items() throws Throwable {
      SearchItem.enter_item(driver);
      }

    @And("^the searchbar is clicked$")
    public void the_searchbar_is_clicked() throws Throwable {
        SearchItem.search_bar(driver);
    }

    @And("^Click enter to continue the search$")
    public void click_enter_to_continue_the_search() throws Throwable {
    	SearchItem.enter_search(driver);
    	
    }
    @And("^check if navigated to required page$")
    public void check_if_navigated_to_required_page() throws Throwable {
    	SearchItem.search_check(driver);
    }


}
