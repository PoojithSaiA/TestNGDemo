package com.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day2 {
	@Test(dataProvider = "providers")
	public void byeDemo(String name,String pass){
		System.out.println("Bye");
		System.out.println(name);
		System.out.println(pass);
	}
	
	@DataProvider
	public Object[][] providers() {
		Object ob[][]=new Object[3][2];
		ob[0][0]="firstname";
		ob[0][1]="1Password";
		
		ob[1][0]="firstname";
		ob[1][1]="1Password";
		
		ob[2][0]="firstname";
		ob[2][1]="1Password";
		
		return ob;
		
	}

}
