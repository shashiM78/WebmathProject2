package com.genralmathpage;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.WebmathBase.BaseClass;

public class GenralMath extends BaseClass {

	public void factors() {
		driver.findElement(By.xpath(prop1.getProperty("genralmath"))).click();
		driver.findElement(By.xpath(prop1.getProperty("factors"))).click();
		driver.findElement(By.name(prop1.getProperty("name"))).sendKeys(prop1.getProperty("factorvalue"));
		driver.findElement(By.xpath(prop1.getProperty("convert"))).click();
		String actual3 = driver.getCurrentUrl();
		String expted1=prop1.getProperty("expturl");
		Assert.assertEquals(actual3, expted1);
		driver.quit();
	}
	public void factorsin() {
		driver.findElement(By.xpath(prop1.getProperty("genralmath"))).click();
		driver.findElement(By.xpath(prop1.getProperty("factors"))).click();
		driver.findElement(By.xpath(prop1.getProperty("prim"))).click();
		driver.findElement(By.name(prop1.getProperty("name"))).sendKeys(prop1.getProperty("factorvalue"));
		driver.findElement(By.xpath(prop1.getProperty("convert"))).click();
		String actual3 = driver.getCurrentUrl();
		String expted1=prop1.getProperty("expturl");
		Assert.assertEquals(actual3, expted1);
		driver.quit();
	}
	
	public void multipy() {
		driver.findElement(By.xpath(prop1.getProperty("genralmath"))).click();
		driver.findElement(By.xpath(prop1.getProperty("multipy"))).click();
		driver.findElement(By.name(prop1.getProperty("mltiplname1"))).sendKeys(prop1.getProperty("mltiplvalue1"));
		driver.findElement(By.name(prop1.getProperty("mltiplname2"))).sendKeys(prop1.getProperty("mltiplvalue2"));
		driver.findElement(By.name(prop1.getProperty("mltiplname3"))).sendKeys(prop1.getProperty("mltiplvalue3"));
		driver.findElement(By.name(prop1.getProperty("mltiplname4"))).sendKeys(prop1.getProperty("mltiplvalue4"));
		driver.findElement(By.xpath(prop1.getProperty("multibutton"))).click();
		String actual5=driver.getCurrentUrl();
		String expted3=prop1.getProperty("expt4");
		Assert.assertEquals(actual5, expted3);
		driver.quit();
	}
	
	public void fractiontodeci() {
		driver.findElement(By.xpath(prop1.getProperty("genralmath"))).click();
		driver.findElement(By.xpath(prop1.getproperty("decimalbutton"))).click();
		driver.findElement(By.name(prop1.getProperty("name1"))).sendKeys(prop1.getProperty("value1"));
		driver.findElement(By.name(prop1.getProperty("name2"))).sendKeys(prop1.getProperty("value2"));
		driver.findElement(By.name(prop1.getProperty("name3"))).sendKeys(prop1.getProperty("value3"));
		driver.findElement(By.xpath(prop1.getProperty("button1"))).click();
		String actual4=driver.getCurrentUrl();
		String expted2=prop1.getProperty("extp3");
		Assert.assertEquals(actual4, expted2);
		driver.quit();
	}
}
