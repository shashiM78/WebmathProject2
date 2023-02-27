package com.WebmathTestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.K8page.KinTo8Std;
import com.WebmathBase.BaseClass;
import com.genralmathpage.GenralMath;
import com.mathforeveryonepage.MathForEveryone;
import com.plotGeometry.PlotGeometryPage;

public class TestClass extends  BaseClass{
	 
	MathForEveryone MathEvery;
	GenralMath Genmath;
	KinTo8Std K8;
	PlotGeometryPage PG;
	
	@BeforeMethod
	public void baseclass() throws IOException {
		initialization();
		MathEvery = new MathForEveryone();
		Genmath   = new GenralMath();
		K8 = new KinTo8Std();
		PG = new PlotGeometryPage();
	}
	@Test(priority = 1)
	public void validateHomepage() {
		MathEvery.homepage();
	}
	@Test(priority = 2)
	public void validatelength() {
		MathEvery.length();
	}
	
	@Test(priority = 3)
	public void validatespeedcalculateion() {
		MathEvery.speed();
	}
	
	@Test(priority = 4)
	public void validatesimpleintrest() {
		MathEvery.simpleintrest();
		
	}
	
	@Test(priority = 5)
	public void validatenumbersfactors() {
		Genmath.factors();
	}
	@Test(priority = 6)
	public void findprimefactors() {
		Genmath.factorsin();
	}
	@Test(priority = 6)
	public void validatefractiontodecimal() {
		Genmath.fractiontodeci();
	}
	@Test(priority = 7)
	public void validatemultipy() {
		Genmath.multipy();
	}
	

	@Test(priority = 8)
	public void multiplybasic() {
		K8.basicmultiply();
	}
	@Test(priority = 9)
	public void multiplybasicinvaliddata() {
	K8.multiplywithinvaliddata();
}
	@Test(priority = 10)
	public void proportionscalculating() {
		K8.proportions();
	}
	@Test(priority = 11)
	public void proportionscalculatinginvaliddata() {
	K8.proptionsinvaliddata();
	}
	
	@Test(priority = 12)
	public void pointswithslopecalculation(){
		PG.pointswithslope();
	}
	@Test(priority = 13)
	public void circledraw() {
		PG.circle();
	}

@AfterMethod
	private void closebowser() {
	tearDown();
	}}
