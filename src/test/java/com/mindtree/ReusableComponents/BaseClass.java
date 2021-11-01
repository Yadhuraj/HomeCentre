package com.mindtree.ReusableComponents;

import org.openqa.selenium.WebDriver;

import com.mindtree.Utility.ChromeBrowserUtil;

public class BaseClass {
public static WebDriver driver;
	public void DriverSet() {
		driver = ChromeBrowserUtil.DriverChrome(this.driver);
		
	}

}
