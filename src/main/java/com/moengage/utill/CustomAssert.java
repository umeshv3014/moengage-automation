package com.moengage.utill;

import org.apache.commons.lang.ObjectUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomAssert {

  public static void assertTrue(String testId, boolean value, String successMsg, String failureMsg) {

    if (value) {
      Log.info(testId, successMsg);
    } else {
      Log.error(testId, failureMsg);
    }
    Assert.assertTrue(value, failureMsg);
  }
  
  
  //Overloaded version made for taking screen shot.
  public static void assertTrue(WebDriver driver, String testId, boolean value, String successMsg, String failureMsg) {

    if (value) {
      Log.info(testId, successMsg);
    } else {
      Log.error(driver, testId, failureMsg);
    }
    Assert.assertTrue(value, failureMsg);
  }

  public static void assertTrue(String testId, boolean value, String failureMsg) {
    if (!value) {
      Log.error(testId, failureMsg);
    }
    Assert.assertTrue(value, failureMsg);
  }

  //Overloaded version made for taking screen shot.
  public static void assertTrue(WebDriver driver, String testId, boolean value, String failureMsg) {
    if (!value) {
      Log.error(driver, testId, failureMsg);
    }
    Assert.assertTrue(value, failureMsg);
  }

  public static void assertTrue(boolean value, String failureMsg) {
    if (!value) {
      Log.error(failureMsg);
    }
    Assert.assertTrue(value, failureMsg);
  }
  
  //Overloaded version made for taking screen shot.
  public static void assertTrue(WebDriver driver, boolean value, String failureMsg) {
    if (!value) {
      Log.error(failureMsg);
    }
    Assert.assertTrue(value, failureMsg);
  }
  
  
  public static void assertEquals(String testId, Object expectedObject, Object actualObject,
      String successMsg, String failureMsg) {

    if (ObjectUtils.equals(expectedObject, actualObject)) {
      Log.info(testId, successMsg);
    } else {
      Log.error(testId, failureMsg);
    }
    Assert.assertEquals(expectedObject, actualObject);
  }
  
  //Overloaded version made for taking screen shot.
  public static void assertEquals(WebDriver driver, String testId, Object expectedObject, Object actualObject,
      String successMsg, String failureMsg) {

    if (ObjectUtils.equals(expectedObject, actualObject)) {
      Log.info(testId, successMsg);
    } else {
      Log.error(driver, testId, failureMsg);
    }
    Assert.assertEquals(expectedObject, actualObject);
  }

  
  // public static void assertEquals(Object expectedObject, Object
  // actualObject, String successMsg, String failureMsg) {
  //
  // if (ObjectUtils.equals(expectedObject, actualObject)) {
  // Log.info(successMsg);
  // } else {
  // Log.error(failureMsg);
  // }
  // Assert.assertEquals(expectedObject, actualObject);
  // }

  public static void assertEquals(String testId, Object expectedobject, Object actualobject,
      String failureMsg) {

    if (!ObjectUtils.equals(expectedobject, actualobject)) {
      Log.error(testId, failureMsg);
    }
    Assert.assertEquals(expectedobject, actualobject);
  }
  
  //Overloaded version made for taking screen shot.
  public static void assertEquals(WebDriver driver, String testId, Object expectedobject, Object actualobject,
      String failureMsg) {

    if (!ObjectUtils.equals(expectedobject, actualobject)) {
      Log.error(driver, testId, failureMsg);
    }
    Assert.assertEquals(expectedobject, actualobject);
  }

  public static void assertEquals(Object expectedobject, Object actualobject, String failureMsg) {

    if (!ObjectUtils.equals(expectedobject, actualobject)) {
      Log.error(failureMsg);
    }
    Assert.assertEquals(expectedobject, actualobject);
  }
  
  //Overloaded version made for taking screen shot.
  public static void assertEquals(WebDriver driver, Object expectedobject, Object actualobject, String failureMsg) {

    if (!ObjectUtils.equals(expectedobject, actualobject)) {
      Log.error(driver, failureMsg);
    }
    Assert.assertEquals(expectedobject, actualobject);
  }

  public static void assertVerify(String testId, Object expectedValue, Object actualValue,
      String successMsg, String failureMsg) {
    if (ObjectUtils.equals(expectedValue, actualValue)) {
      Log.info(testId, successMsg);
    } else {
      Log.error(testId, failureMsg);
    }
  }
  
  
  //Overloaded version made for taking screen shot.
  public static void assertVerify(WebDriver driver, String testId, Object expectedValue, Object actualValue,
      String successMsg, String failureMsg) {
    if (ObjectUtils.equals(expectedValue, actualValue)) {
      Log.info(testId, successMsg);
    } else {
      Log.error(driver, testId, failureMsg);
    }
  }

  public static void assertVerify(Object expectedValue, Object actualValue, String successMsg,
      String failureMsg) {
    if (ObjectUtils.equals(expectedValue, actualValue)) {
      Log.info(successMsg);
    } else {
      Log.error(failureMsg);
    }
  }

  //Overloaded version made for taking screen shot.
  public static void assertVerify(WebDriver driver, Object expectedValue, Object actualValue, String successMsg,
      String failureMsg) {
    if (ObjectUtils.equals(expectedValue, actualValue)) {
      Log.info(successMsg);
    } else {
      Log.error(driver, failureMsg);
    }
  }
  
  
  public static void assertFail(String testId, String failMsg) {
    Log.error(testId, failMsg);
    Assert.fail();
  }
  
  
  //Overloaded version made for taking screen shot.
  public static void assertFail(WebDriver driver, String testId, String failMsg) {
    Log.error(testId, failMsg);
    Assert.fail();
  }

}
