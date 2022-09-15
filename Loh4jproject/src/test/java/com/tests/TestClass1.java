package com.tests;

import org.testng.annotations.Test;

import com.utility.Log;

public class TestClass1 {
	@Test
	public void testCase1() {
		Log.startTestCase("testCase1");
		Log.info("testCase1");
		Log.endTestCase("testCase1");
	}
	@Test
	public void testCase2() {
		Log.startTestCase("testCase2");
		Log.info("testCase2");
		Log.endTestCase("testCase2");
	}
	
	

}
