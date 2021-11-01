package com.mindtree.StepDefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.ReusableComponents.BaseClass;
import com.mindtree.Utility.ChromeBrowserUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class TitleCheckSD extends BaseClass{
	static int flag =0;
	@Given("The driver is intialized")
	public void the_driver_is_intialized() {
		DriverSet();
	}

	    @Then("^the title of the page is checked$")
	    public void the_title_of_the_page_is_checked() throws Throwable {
	    	System.out.println("3");
	    	if(driver.getTitle().equals("Online Shopping at homecentre"))
	        {
	        	flag =1;
	        }
	    }

	    @And("^the driver access the \"([^\"]*)\"$")
	    public void the_driver_access_the_something(String strArg1) throws Throwable {
	      System.out.println("2");
	    	driver.get(strArg1);
	    }


	    @And("^the page is confirmed$")
	    public void the_page_is_confirmed() throws Throwable {
	    	System.out.println("4");
	    	if(flag==1)
	        {
	        	System.out.println("Landed on the expected page");
	        }
	        else
	        {
	        	System.out.println("Did not land on the expected page");
	        }
	    }


}
