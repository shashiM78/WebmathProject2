package com.plotGeometry;

import org.openqa.selenium.By;

import com.WebmathBase.BaseClass;

public class PlotGeometryPage extends BaseClass {
	
	public void pointswithslope()   {
		driver.findElement(By.xpath(prop4.getProperty("geometry"))).click();
		driver.findElement(By.xpath(prop4.getProperty("PointSlope"))).click();
		driver.findElement(By.name(prop4.getProperty("name"))).sendKeys(prop4.getProperty("value"));
		driver.findElement(By.name(prop4.getProperty("name2"))).sendKeys(prop4.getProperty("value1"));
		driver.findElement(By.name(prop4.getProperty("name4"))).sendKeys(prop4.getProperty("value2"));
		driver.findElement(By.xpath(prop4.getProperty("button"))).click();
		driver.quit();
	}
	
	public void circle() {
		driver.findElement(By.xpath(prop4.getProperty("geometry"))).click();
		driver.findElement(By.xpath(prop4.getProperty("circle"))).click();
		driver.findElement(By.name(prop4.getProperty("name3"))).sendKeys(prop4.getProperty("value3"));
		driver.findElement(By.xpath(prop4.getProperty("button2"))).click();
		driver.quit();
	}
	}


