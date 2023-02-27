package com.K8page;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.WebmathBase.BaseClass;

public class KinTo8Std extends BaseClass {

	public void basicmultiply() {
		driver.findElement(By.xpath(prop3.getProperty("K8"))).click();
		driver.findElement(By.xpath(prop3.getProperty("multply"))).click();
		driver.findElement(By.name(prop3.getProperty("name1"))).sendKeys(prop3.getProperty("value"));
		driver.findElement(By.name(prop3.getProperty("name2"))).sendKeys(prop3.getProperty("value1"));
		driver.findElement(By.xpath(prop3.getProperty("button"))).click();
		String actua1=driver.getCurrentUrl();
		String expect=prop3.getProperty("expt");
		Assert.assertEquals(actua1, expect);
		driver.quit();
	}


	public void multiplywithinvaliddata() {
		driver.findElement(By.xpath(prop3.getProperty("K8"))).click();
		driver.findElement(By.xpath(prop3.getProperty("multply"))).click();
		driver.findElement(By.name(prop3.getProperty("name1"))).sendKeys(prop3.getProperty("invalidvalue"));
		driver.findElement(By.name(prop3.getProperty("name2"))).sendKeys(prop3.getProperty("invalidvalue1"));
		driver.findElement(By.xpath(prop3.getProperty("button"))).click();
		String actua1=driver.getCurrentUrl();
		String expect1=prop3.getProperty("expt");
		Assert.assertNotEquals(actua1, expect1);
		driver.quit();	
	}
	public void proportions() {
		driver.findElement(By.xpath(prop3.getProperty("K8"))).click();
		driver.findElement(By.xpath(prop3.getProperty("proportions"))).click();
		driver.findElement(By.name(prop3.getProperty("name3"))).sendKeys(prop3.getProperty("value3"));
		driver.findElement(By.name(prop3.getProperty("name4"))).sendKeys(prop3.getProperty("value4"));
		driver.findElement(By.name(prop3.getProperty("name5"))).sendKeys(prop3.getProperty("value5"));
		driver.findElement(By.name(prop3.getProperty("name6"))).sendKeys(prop3.getProperty("value6"));
		driver.findElement(By.xpath(prop3.getProperty("button1"))).click();
		String actua2= driver.getCurrentUrl();
		String expect2=prop3.getProperty("expt2");
		Assert.assertEquals(actua2, expect2);
		driver.quit();
	}
	public void proptionsinvaliddata() {
		driver.findElement(By.xpath(prop3.getProperty("K8"))).click();
		driver.findElement(By.xpath(prop3.getProperty("proportions"))).click();
		driver.findElement(By.name(prop3.getProperty("name3"))).sendKeys(prop3.getProperty("invalidvalue2"));
		driver.findElement(By.name(prop3.getProperty("name4"))).sendKeys(prop3.getProperty("invalidvalue3"));
		driver.findElement(By.name(prop3.getProperty("name5"))).sendKeys(prop3.getProperty("invalidvalue4"));
		driver.findElement(By.name(prop3.getProperty("name6"))).sendKeys(prop3.getProperty("invalidvalue5"));
		driver.findElement(By.xpath(prop3.getProperty("button1"))).click();
		String actua2= driver.getCurrentUrl();
		String expect2=prop3.getProperty("expt2");;
		Assert.assertNotEquals(actua2, expect2);
		driver.quit();
	}
}
