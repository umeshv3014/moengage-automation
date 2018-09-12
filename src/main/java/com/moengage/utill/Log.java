package com.moengage.utill;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Log {
  // Initialize Log4j logs
  private static Logger log; // = Logger.getLogger(Log.class.getName());

  public static void setLog(Class<?> className) {
    log = Logger.getLogger(className.getName());
  }

  // This is to print log for the beginning of the test case, as we usually
  // run so many test cases as a test suite
  public static void startTestCase(String sTestCaseName) {
    log.info("****************************************************************************************");
    log.info("$$$$$$$$$$$$$$$$$$$$$                 " + sTestCaseName
        + "       $$$$$$$$$$$$$$$$$$$$$$$$$");
    log.info("****************************************************************************************");
  }

  // This is to print log for the ending of the test case
  public static void endTestCase(String sTestCaseName) {
    log.info("XXXXXXXXXXXXXXXXXXXXXXX             " + "-E---N---D-"
        + "             XXXXXXXXXXXXXXXXXXXXXX");
    log.info("X");
    log.info("X");
    log.info("X");
    log.info("X");
  }

  public static void divider(String testId) {
    log.info(testId + "------------------------------------------------------------------");
  }

  // Need to create these methods, so that they can be called
  public static void info(String testId, String message) {
    log.info(testId + " " + message);
    System.out.println(testId + " " + message);
  }

  public static void warn(String testId, String message) {
    log.warn(testId + " " + message);
    System.out.println(testId + " " + message);
  }

  public static void error(String testId, String message) {
    System.out.println("============ERROR===========");
    log.error(testId + " " + message);
    System.out.println(testId + " " + message);
  }
  
  
  //Overloaded version made for taking screen shot.
  public static void error(WebDriver driver, String testId, String message) {
    System.out.println("============ERROR===========");
    log.error(testId + " " + message);
    /*try {
      PageHandler.takeScreenshot(driver, testId);
    } catch (Exception e) {
      e.printStackTrace();
    }*/
    System.out.println(testId + " " + message);
  }

  public static void fatal(String testId, String message) {
    System.out.println("============FATAL===========");
    log.fatal(testId + " " + message);
    System.out.println(testId + " " + message);
  }

  public static void debug(String testId, String message) {
    log.debug(testId + " " + message);
    System.out.println(testId + " " + message);
  }

  public static void info(String message) {
    log.info(message);
    System.out.println(message);
  }

  public static void warn(String message) {
    log.warn(message);
    System.out.println(message);
  }

  public static void error(String message) {
    System.out.println("============ERROR===========");
    log.error(message);
    System.out.println(message);    
  }
  
  //Overloaded version made for taking screen shot.
  public static void error(WebDriver driver, String message) {
    System.out.println("============ERROR===========");
    log.error(message);
    /*try {
      PageHandler.takeScreenshot(driver, message);
    } catch (Exception e) {
      e.printStackTrace();
    }*/
    System.out.println(message);
    
  }

  public static void fatal(String message) {
    log.fatal(message);
    System.out.println(message);
  }

  public static void debug(String message) {
    log.debug(message);
    System.out.println(message);
  }
}
