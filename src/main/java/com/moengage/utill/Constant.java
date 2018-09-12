package com.moengage.utill;

public class Constant {

	public static final String CONFIGURATION_PROPERTIES = "Config.properties";
	public static final String MAC_CHROMEDRIVER_PATH = System
			.getProperty("user.dir") + "/Driver/macchromedriver";
	public static final String Linux_CHROMEDRIVER_PATH = System
			.getProperty("user.dir") + "/Driver/chromedriver";
	public static final String FIREFOX_GECKODRIVER_PATH = System
			.getProperty("user.dir") + "/Driver/geckodriver";
	public static final String WINDOWS_CHROMEDRIVER_PATH = System
			.getProperty("user.dir") + "/Driver/windowschromedriver.exe";
	public static final String SCREENSHOTS_PATH = System
			.getProperty("user.dir") + "/NotInUsescreenshots/";

	public static final int IMPLICIT_WAIT_TIME = 20;

	public static final int ONWARD_JOURNEY = 0;
	public static final int RETURN_JOURNEY = 1;

	public static final String WHITESPACE = " ";
	public static final String COMMA = ",";
	public static final String SLASH = "/";
	public static final String COLON = ":";
	public static final String PIPE = "|";
	public static final String UNDERSCORE = "_";
	public static final String HYPHEN = "-";
	public static final String FULLSTOP = ".";
	public static final String NEW_LINE = "\\r?\\n";

	public static final String CreatCampTestData = "/TestData/creatCampTestData.xlsx";
	public static final String CreatCampTestData_SheetName = "sheet_name";

}
