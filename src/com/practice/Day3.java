package com.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("-------->BeforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("-------->BeforeClass");
	}
	
	@Test(groups= {"Smoke"},dependsOnMethods = "mobileLogoutCarLoan")
	public void webLoginCarLoan() {
		System.out.println("webLoginCarLoan");
	}
	@Test
	public void mobileLoginCarLoan() {
		System.out.println("mobileLoginCarLoan");
	}
	//@Parameters({"URL"})
	@Test
	public void mobileLogoutCarLoan(String name) {
		System.out.println("mobileLogoutCarLoan "+name);
	}
	
	@Test(dependsOnMethods = "webLoginCarLoan")
	public void apiLoginCarLoan() {
		System.out.println("apiLoginCarLoan");
	}



}
