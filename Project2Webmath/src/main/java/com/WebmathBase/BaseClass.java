package com.WebmathBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static WebDriver driver;
	public static Properties prop1;
	public static Properties prop3;
	public static Properties prop4;
	
	@BeforeMethod
	public void initialization() throws IOException {
	String Data = ".\\src\\main\\java\\com\\mathforeveryproperty\\mathforeveryone.properties";
	FileInputStream file = new FileInputStream(Data);
	prop = new Properties();
	prop.load(file);
	
	WebDriverManager.chromedriver().setup();
	 driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(prop.getProperty("ur1"));
	
	
	String Data1 = ".\\src\\main\\java\\com\\genralmathproperty\\Genralmath.properties";
	FileInputStream file1 = new FileInputStream(Data1);
	prop1 = new Properties();
	prop1.load(file1);
	
	String Data2 = ".\\src\\main\\java\\com\\K8properties\\K8.properties";
	FileInputStream file2 = new FileInputStream(Data2);
	prop3 = new Properties();
	prop3.load(file2);
	
	String Data3 = ".\\src\\main\\java\\com\\plotgeometryproperties\\Plotgeo.properties";
	FileInputStream file3 = new FileInputStream(Data3);
	prop4 = new Properties();
	prop4.load(file3);
	}
	
	public void tearDown() {
		driver.quit();
	}
	}
	

