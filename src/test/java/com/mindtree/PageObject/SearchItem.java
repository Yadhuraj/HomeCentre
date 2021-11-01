package com.mindtree.PageObject;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.mindtree.ReusableComponents.DriverFunctions;
import com.mindtree.UIStore.SearchItemUI;



public class SearchItem extends SearchItemUI {

	public static void search_bar(WebDriver driver) {
		DriverFunctions.click(driver, searchbar);

	}

	public static void enter_item(WebDriver driver) {
		DriverFunctions.sendkeys(driver, searchbar, "cups");
	}

	public static void enter_search(WebDriver driver) {
		DriverFunctions.sendkeys(driver, searchbar, Keys.ENTER);
	}
	public static void search_check(WebDriver driver) {
		System.out.println(driver.findElement(search_confirm).getText());
		Assert.assertTrue("You searched \"Cups\"".equalsIgnoreCase(driver.findElement(search_confirm).getText()));
	}

}
