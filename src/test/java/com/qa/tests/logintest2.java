package com.qa.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logintest2 {

	@Test
	public void test1(){
		System.out.println("this is testcases");
	}
	
	@BeforeTest
	public void rest2(){
		System.out.println("running succesfully");
	}
}
