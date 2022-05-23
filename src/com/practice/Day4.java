package com.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("========>beforeSuit");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("========>beforeTest");
	}

	@Test(groups= {"Smoke"})
	public void webLoginHomeLoan() {
		System.out.println("webLoginHomeLoan");
	}
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("mobileLoginHomeLoan");
	}
	@Test
	public void apiLoginHomeLoan() {
		System.out.println("apiLoginHomeLoan");
	}
	


}
