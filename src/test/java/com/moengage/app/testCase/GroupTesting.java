package com.moengage.app.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTesting {

	@Test(priority = 1)
	public void test0() {
		System.out.println("test0");
	}

	@Test(groups = { "car" })
	public void test1() {
		System.out.println("test1");
	}

	@Test(dependsOnMethods = { "test3" }, groups = { "car" })
	public void test2() {
		System.out.println("test2");
	}

	@Test(groups = { "car" })
	public void test3() {
		System.out.println("test3");
	}

	@Test
	public void dependsOnMethodsTest() {
		Assert.assertEquals(false, true);
	}

	@Test(groups = { "scooter" })
	public void test4() {
		System.out.println("test4");
	}

	@Test(groups = { "car", "sydan" })
	public void test5() {
		System.out.println("test5");
	}
}
