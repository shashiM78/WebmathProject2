package com.mathforeveryonepage;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.WebmathBase.BaseClass;

public class MathForEveryone extends BaseClass {

	
	public void homepage() {
	driver.get(prop.getProperty("ur1"));
	String actual = driver.getCurrentUrl();
	String expt = prop.getProperty("expturl");
	Assert.assertEquals(actual, expt);
	driver.quit();
}
	public void length() {
		driver.findElement(By.xpath(prop.getProperty("math"))).click();
		driver.findElement(By.xpath(prop.getProperty("lenth"))).click();
		driver.findElement(By.name(prop.getProperty("name"))).sendKeys(prop.getProperty("name1"));
		driver.findElement(By.xpath(prop.getProperty("timeselect"))).click();
		driver.findElement(By.xpath(prop.getProperty("convert"))).click();
		String actual = driver.getCurrentUrl();
		String expt1 = prop.getProperty("expt");
		Assert.assertEquals(actual, expt1);
	}
	public void speed() {
		driver.findElement(By.xpath(prop.getProperty("math"))).click();
		driver.findElement(By.xpath(prop.getProperty("speed"))).click();
		driver.findElement(By.name(prop.getProperty("name2"))).sendKeys(prop.getProperty("nam2"));
		driver.findElement(By.name(prop.getProperty("name3"))).click();
		driver.findElement(By.xpath(prop.getProperty("convert1"))).click();
		String actual = driver.getCurrentUrl();
		String expt2 = prop.getProperty("exepturl2");
		Assert.assertEquals(actual, expt2);
		driver.quit();
	}
	public void simpleintrest() {
		driver.findElement(By.xpath(prop.getProperty("math"))).click();
		driver.findElement(By.xpath(prop.getproperty("simpleint"))).click();
		driver.findElement(By.name(prop.getproperty("name4"))).sendKeys(prop.getProperty("nam3"));;
		driver.findElement(By.name(prop.getproperty("interrate"))).sendKeys(prop.getProperty("rate"));
		driver.findElement(By.xpath(prop.getproperty("month"))).click();
		driver.findElement(By.name(prop.getproperty("time"))).sendKeys(prop.getProperty("year"));
		driver.findElement(By.xpath(prop.getproperty("year1")).click();
		driver.findElement(By.xpath(prop.getproperty("button")).click();
		String actual1 = driver.getCurrentUrl();
		String expt3= prop.getproperty("expt1");
		Assert.assertEquals(actual1, expt3);
		driver.quit();
	}}
