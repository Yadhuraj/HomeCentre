package com.mindtree.ReusableComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DriverFunctions {

	public static void click(WebDriver driver,By element) {
		// TODO Auto-generated constructor stub
		driver.findElement(element).click();
	}

	public static void sendkeys(WebDriver driver,By element,String msg)
	{
		driver.findElement(element).sendKeys(msg);
	}
	public static void sendkeys(WebDriver driver,By element,Keys msg)
	{
		driver.findElement(element).sendKeys(msg);
	}
}
