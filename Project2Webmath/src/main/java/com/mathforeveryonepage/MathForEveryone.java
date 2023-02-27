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
		driver.findElement(By.xpath("//a[contains(text(),'Simple Interest')]")).click();
		driver.findElement(By.name("principal")).sendKeys("200");
		driver.findElement(By.name("interest")).sendKeys("3");
		driver.findElement(By.xpath("//select[1]/option[3][@value='month']")).click();
		driver.findElement(By.name("desired_time")).sendKeys("1");
		driver.findElement(By.xpath("//option[contains(text(),'Month(s)')]")).click();
		driver.findElement(By.xpath("//input[1][@type=\"submit\"]")).click();
		String actual1 = driver.getCurrentUrl();
		String expt3= "https://www.webmath.com/_answer.php";
		Assert.assertEquals(actual1, expt3);
		driver.quit();
	}}
