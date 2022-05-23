package com.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@AfterSuite
	public void afterSuit() {
		System.out.println("=======>afterSuit");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("=======>beforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("=======>afterMethod");
	}
	//@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void demo(String name) {
		System.out.println("Hello world "+name);
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("========>afterTest");
	}

}
