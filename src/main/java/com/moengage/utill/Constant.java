package com.moengage.utill;

public class Constant {


  public static final String ROBOT_LOCATOR_REPOSITORY = "RobotLocatorRepository.JSON";
  public static final String COMMON_LOCATOR_REPOSITORY = "CommonLocatorRepository.JSON";
  public static final String FLIGHTS_COMMON_LOCATOR_REPOSITORY =
      "FlightsCommonLocatorRepository.JSON";
  public static final String FLIGHTS_DOM_LOCATOR_REPOSITORY = "FlightsDomLocatorRepository.JSON";
  public static final String FLIGHTS_INTL_LOCATOR_REPOSITORY = "FlightsIntlLocatorRepository.JSON";
  public static final String HOTELS_LOCATOR_REPOSITORY = "HotelsLocatorRepository.JSON";
  public static final String HOLIDAYS_LOCATOR_REPOSITORY = "HolidaysLocatorRepository.JSON";
  public static final String BUS_LOCATOR_REPOSITORY = "BusLocatorRepository.JSON";

  public static final String RESELLER_FLIGHTS_INTL_LOCATOR_REPOSITORY =
      "ResellerFlightsIntlLocatorRepository.JSON";
  public static final String RESELLER_COMMON_LOCATOR_REPOSITORY =
      "ResellerCommonLocatorRepository.JSON";
  //public static final String B2C_BUS_LOCATOR_REPOSITORY = "ResellerCommonLocatorRepository.JSON";
  public static final String B2C_BUS_LOCATOR_REPOSITORY = "B2CBusLocatorRepository.JSON";
  public static final String RESELLER_FLIGHT_LOCATOR_REPOSITORY =
      "ResellerFlightsLocatorRepository.JSON";
  public static final String RESELLER_HOLIDAYS_LOCATOR_REPOSITOR =
      "ResellerHolidaysLocatorRepository.JSON";
  public static final String RESELLER_HOTELS_LOCATOR_REPOSITORY =
      "ResellerHotelsLocatorRepository.JSON";
  public static final String RESELLER_BUSES_LOCATOR_REPOSITORY =
      "ResellerBusesLocatorRepository.JSON";
  public static final String RESELLER_TOPUP_LOCATOR_REPOSITORY =
      "ResellerTopupsLocatorRepository.JSON";
  public static final String RESELLER_MONEY_TRANSFER_LOCATOR_REPOSITORY =
      "ResellerMoneyTransferLocatorRepository.JSON";
  public static final String RESELLER_GIFTCARD_LOCATOR_REPOSITORY =
      "ResellerGiftCardLocatorRepository.JSON";
  public static final String RESELLER_CORP_COMMON_LOCATOR_REPOSITORY =
      "ResellerCommonCorpLocatorRepository.JSON";
  public static final String RESELLER_MICE_LOCATOR_REPOSITORY =
      "ResellerMiceLocatorRepository.JSON";
  public static final String RESELLER_INSURANCE_LOCATOR_REPOSITORY =
      "ResellerInsuranceLocatorRepository.JSON";
  public static final String BOOKING_DETAILS_LOCATOR_REPOSITORY =
      "BookingDetailsLocatorRepository.JSON";
 

  public static final String OFFER_PAGE_LOCATOR_REPOSITORY = "OffersLocatorRepository.JSON";

  public static final String CONFIGURATION_PROPERTIES = "Config.properties";
  public static final String MAC_CHROMEDRIVER_PATH = System.getProperty("user.dir")
      + "/Driver/macchromedriver";
  public static final String Linux_CHROMEDRIVER_PATH = System.getProperty("user.dir")
	      + "/Driver/chromedriver";
  public static final String FIREFOX_GECKODRIVER_PATH = System.getProperty("user.dir")
      + "/Driver/geckodriver";
  public static final String WINDOWS_CHROMEDRIVER_PATH = System.getProperty("user.dir")
      + "/Driver/windowschromedriver.exe";
  public static final String SCREENSHOTS_PATH = System.getProperty("user.dir") + "/NotInUsescreenshots/";

  public static final int IMPLICIT_WAIT_TIME = 20;

  public static final int ONWARD_JOURNEY = 0;
  public static final int RETURN_JOURNEY = 1;

  public static final String ONEWAY = "resultSet domestic";
  public static final String ROUNDTRIP_ONWARD = "onwardResults";
  public static final String ROUNDTRIP_RETURN = "returnResults";
  public static final String ROUNDTRIP_ONWARD_BOOK = "onwardFlight";
  public static final String ROUNDTRIP_RETURN_BOOK = "returnFlight";

  public static final String WHITESPACE = " ";
  public static final String COMMA = ",";
  public static final String SLASH = "/";
  public static final String COLON = ":";
  public static final String PIPE = "|";
  public static final String UNDERSCORE = "_";
  public static final String HYPHEN = "-";
  public static final String FULLSTOP = ".";
  public static final String NEW_LINE = "\\r?\\n";

  public static final String TOPUP_MOBILE = "Mobile";
  public static final String TOPUP_DTH = "DTH";
  public static final String TOPUP_BILL_PAYMENT = "Bill Payment";
  public static final String TOPUP_DATA_CARD = "Data Card";
  
  public static final String TOPUP_DTH_AIRTEL = "AIRTEL";
  public static final String TOPUP_DTH_BIG_TV = "BIG TV";
  public static final String TOPUP_DTH_DISH_TV = "DISH TV";
  public static final String TOPUP_DTH_SUNTV_DIRECT_TV = "SUNTV DIRECT TV";
  public static final String TOPUP_DTH_Tata_Sky_DTH = "Tata Sky DTH";
  public static final String TOPUP_DTH_VIDEOCON_DTH = "VIDEOCON DTH";
  
  //bill payment products
  //public static final String TOPUP_BILL_PAYMENT_CATEGORY_E = "Electricity";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_BT = "Broadband /Telephone";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_G = "Gas";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_I = "Insurance";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_T = "Telephone";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E = "Electricity";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_CESC = "calcutta_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_JUSCO = "jamsedpur_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_RVVNL = "rajasthan_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_Reliance = "relience_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_MPWZ = "mppashchim_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_MPPKVVCLtd = "bhoopal_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_NPCL = "noida_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_MSEDC = "msedc_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_Torrent = "torrentpower_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_BESCOM = "bangalore_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_BEST = "BES";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_CSEB = "chattisgar_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_BMES_TU = "bestmuob_ec";
  public static final String TOPUP_BILL_PAYMENT_CATEGORY_E_IPCLtd = "indiap_ec";
  
  public static final String ROBOT_TESTDATA = "/TestData/RobotExcelSheet.xlsx";
  public static final String ROBOT_DOM_SHEETNAME = "Robot";
  public static final String FLIGHTS_TESTDATA = "/TestData/FlightExcelSheet.xlsx";
  public static final String FLIGHTS_DOM_SHEETNAME = "DomFlight";
  public static final String FLIGHTS_DOM_RESELLER_SHEETNAME = "DomFlightReseller";
  public static final String FLIGHTS_DOM_CORP_SHEETNAME = "DomFlightCorp";
  public static final String FLIGHTS_INTL_SHEETNAME = "International";
  public static final String FLIGHTS_INTL_RESELLER_SHEETNAME = "InternationalReseller";
  public static final String FLIGHTS_INTL_CORP_SHEETNAME = "InternationalFlightCorp";

  public static final String HOTELS_TESTDATA = "/TestData/HotelExcelSheet.xlsx";
  public static final String HOTELS_SHEETNAME = "Hotels";
  public static final String HOTELS_RESLLER_SHEETNAME = "HotelsReseller";
  public static final String HOTELS_CORP_SHEETNAME = "HotelsCorp";

  public static final String TOPUP_TESTDATA = "/TestData/TopupExcelSheet.xlsx";
  public static final String TOPUP_SHEETNAME = "topups";
  public static final String GIFTCARD_TESTDATA = "/TestData/GiftCardExcelSheet.xlsx";
  public static final String GIFTCARD_SHEETNAME = "giftcard";
  public static final String MICE_TESTDATA = "/TestData/MiceExcelSheet.xlsx";
  public static final String MICE_SHEETNAME_b2b = "Mice_b2b";
  public static final String MICE_SHEETNAME_b2c = "Mice_b2c";
  public static final String INSURANCE_TESTDATA = "/TestData/InsuranceExcelSheet.xlsx";
  public static final String INSURANCE_SHEETNAME = "Insurance";

  public static final String BUS_TESTDATA = "/TestData/BusesExcelSheet.xlsx";
  public static final String BUS_SHEETNAME = "Bus";
  public static final String BUS_RESELLER_SHEETNAME = "BusReseller";

  public static final String HOLIDAYS_TESTDATA = "/TestData/HolidayExcelSheet.xlsx";
  public static final String HOLIDAYS_SHEETNAME = "Holidays";
  public static final String HOLIDAYS_RELLER_SHEETNAME = "HolidaysReseller";

  public static final String MONEY_TRANSFER_TESTDATA = "/TestData/MoneyTransferExcelSheet.xlsx";
  public static final String MONEY_TRANSFER_RESELLER_SHEETNAME = "moneyTransfer";

  public static final String DEPART_CAL_ID = "depart-cal";
  public static final String RETURN_CAL_ID = "return-cal";
  public static final String ENQUIRY_DEPART_CAL_ID = "enquiryDep-cal";

  public static final String ISD_CODE = "91";
  public static final String CONTACT_MOBILE = "9611577993";
  public static final String CONTACT_MOBILE_COMPLETE = "+91-9611577993";
  public static final String CONTACT_LANDLINE = "8040433000,9723560302";
  public static final String CONTACT_EMAIL = "qa@via.com";
  public static final String CONTACT_CITY = "Bangalore";
  public static final String CONTACT_PINCODE = "560045";
  public static final String CONTACT_STREET = "Manyata";
  public static final String CONTACT_STATE = "Karnataka";
  public static final String CONTACT_COUNTRY = "India";

  public static final String BIRTH_DATE = "01";
  public static final String BIRTH_MONTH = "01";
  public static final String BIRTH_YEAR_ADULT = "1990";
  public static final String BIRTH_YEAR_CHILD = "2008";
  public static final String BIRTH_YEAR_INFANT = "2016";
  public static final String DATE_OF_BIRTH = "01/01/1988";

  public static final String SLACK_HOOK_URL =
      "https://hooks.slack.com/services/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";
  public static final String SLACK_IN_CHANNEL = "#indiaautomation";
  public static final String BOOKING_ID = "bookingId";
  public static final String CONV_AMT = "convAmount";
  public static final String BOOKING_VERIFICATION = "bookingVerification";
  public static final String DD_MM_YYYY = "dd-MM-yyyy";
  
  public static final String DD_MM_YYYY_HH_MM_SS = "dd-MM-yyyy HH:mm:ss";
  public static final String HH_MM_SS = "HH:mm:ss";
 

  public interface BankConstants {
    public static final String SBI = "STATE BANK OF INDIA";
    public static final String AXIS = "AXIS BANK";
    public static final String HDFC = "HDFC BANK RETAIL";
    public static final String ICICI = "ICICI BANK";
    public static final String KMB = "KOTAK MAHINDRA BANK";
    public static final String PNB = "PNB RETAIL ACCOUNTS";
    public static final String ALLAHABAD = "ALLAHABAD BANK";
    public static final String ANDHRA = "ANDHRA BANK";
    public static final String BAHRAIN_BANK = "BANK OF BAHRAIN AND KUWAIT";
    public static final String BOBCA = "BANK OF BARODA CORPORATE ACCOUNTS";
    public static final String BOBRA = "BANK OF BARODA RETAIL ACCOUNTS";
    public static final String BOI = "BANK OF INDIA";
    public static final String BOM = "BANK OF MAHARASHTRA";
    public static final String CANARA = "CANARA BANK";
    public static final String CSB = "CATHOLIC SYRIAN BANK";
    public static final String CBI = "CENTRAL BANK OF INDIA";
    public static final String CITI = "CITI BANK";
    public static final String CUB = "CITY UNION BANK";
    public static final String CORPORATION = "CORPORATION BANK";
    public static final String DBS = "DBS Bank Ltd";
    public static final String DCBB = "DCB Bank Business";
    public static final String DCBP = "DCB Bank Personal";
    public static final String DEUTSCHE = "DEUTSCHE BANK";
    public static final String DHANLAXMI = "DHANLAXMI BANK";
    public static final String FEDERAL = "FEDERAL BANK";
    public static final String IDBI = "IDBI BANK";
    public static final String INDIAN = "INDIAN BANK";
    public static final String IOB = "INDIAN OVERSEAS NET BANKING";
    public static final String INDUSIND = "INDUSIND BANK";
    public static final String JKB = "JAMMU AND KASHMIR BANK";
    public static final String KARNATAKA = "KARNATAKA BANK";
    public static final String KVB = "KARUR VYSYA BANK";
    public static final String ING = "Kotak (ING Vysya)";
    public static final String LVB = "LAKSHMI VILAS NETBANKING";
    public static final String OBC = "ORIENTAL BANK OF COMMERCE";
    public static final String PNBC = "PNB CORPORATE ACCOUNTS";
    public static final String SARASWAT = "Saraswat Bank";
    public static final String SIB = "SOUTH INDIAN BANK";
    public static final String SCB = "STANDARD CHARTERED BANK";
    public static final String SBJ = "STATE BANK OF BIKANER AND JAIPUR";
    public static final String SBH = "STATE BANK OF HYDERABAD";
    public static final String SBM = "STATE BANK OF MYSORE";
    public static final String SBP = "STATE BANK OF PATIALA";
    public static final String SBT = "STATE BANK OF TRAVANCORE";
    public static final String SYNDIACATE = "SYNDIACATE BANK";
    public static final String UBI = "UNION BANK OF INDIA";
    public static final String UTBI = "UNITED BANK OF INDIA";
    public static final String VIJAYA = "VIJAYA BANK";
    public static final String YES = "YES BANK";
  }

  public interface CityConstantsHotels {
    public static final String BANGALORE = "Bangalore,Karnataka,India";
    public static final String DELHI = "Delhi,New Delhi,India";
    public static final String GOA = "Goa,Goa,India";
    public static final String KOLKATA = "Kolkata,West Bengal,India";
    public static final String MUMBAI = "Mumbai,Maharashtra,India";
    public static final String JAIPUR = "Jaipur,Rajasthan,India";
    public static final String VARANASI = "Varanasi,Uttar Pradesh,India";
    public static final String HYDERABAD = "Hyderabad,Andhra Pradesh,India";
    public static final String CHENNAI = "Chennai,Tamil Nadu,India";
    public static final String KUL = "Kuala Lumpur,Malaysia";
    public static final String HKG = "Hong Kong,Hong Kong";
    public static final String BALI = "Bali,Indonesia";
    public static final String CGK = "Jakarta,Indonesia";
    public static final String BD = "Bandung,Indonesia";
    public static final String SUB = "Surabaya,Indonesia";
    public static final String YOG = "Yogyakarta,Indonesia";
    public static final String BPN = "Balikpapan,Indonesia";
    public static final String SIN = "Singapore,Singapore";
    public static final String SAN = "Shanghai,China";
    public static final String BKK = "Bangkok,Thailand";
    public static final String DXB = "Dubai,United Arab Emirates";
    public static final String OMN = "Muscat,Oman";
    public static final String AMN = "Ajman,United Arab Emirates";
    public static final String SHJ = "Sharjah,United Arab Emirates";
    public static final String AMM = "Amman,Jordan";
    public static final String IXE = "Mangalore,Karnataka,India";
  }

  public interface CityConstantsFlightsIntlReseller {
    public static final String BLR = "Bangalore, Bangalore[BLR]";
    public static final String SIN = "Changi Intl Arpt, Singapore[SIN]";
    public static final String DEL = "Delhi, Delhi[DEL]";
    public static final String DXB = "Dubai Intl Arpt, Dubai[DXB]";
    public static final String KUL = "Kuala Lumpur International Arpt, Kuala-lumpur[KUL]";
    public static final String ATQ = "Amritsar, Amritsar[ATQ]";
    public static final String MNL = "Ninoy Aquino Intl, Manila[MNL]";
    public static final String CEB = "Cebu Intl, Cebu[CEB]";
    public static final String SHJ = "Sharjah Airport, Sharjah[SHJ]";
    public static final String MCT = "Seeb Intl, Muscat[MCT]";
    public static final String HYD = "Hyderabad, Hyderabad[HYD]";
    public static final String BKK = "Suvarnabhumi Intl Arpt, Bangkok[BKK]";
    public static final String MAA = "Chennai, Chennai[MAA]";

  }

  public interface CityConstantsFlights {
//    public static final String RJA = "Rajahmundry - India";
//    public static final String BOM = "Mumbai - India";
//    public static final String BLR = "Bangalore - India";
//    public static final String DEL = "Delhi - India";
//    public static final String IXC = "Chandigarh - India";
//    public static final String GOI = "Goa - India";
//    public static final String GAU = "Guwahati - India";
//    public static final String CCU = "Kolkata - India";
//    public static final String JAI = "Jaipur - India";
//    public static final String SXR = "Srinagar - India";
//    public static final String COK = "Cochin (kochi) - India";
//    public static final String PNQ = "Pune - India";
//    public static final String VTZ = "Vigaz - India";
//    public static final String IMF = "Imphal - India";
//    public static final String MAA = "Chennai - India";
//    public static final String AMD = "Ahmedabad - India";
//    public static final String HYD = "Hyderabad - India";
//    public static final String IXM = "Madurai - India";
//    public static final String TRV = "Trivandrum - India";
//    public static final String IXE = "Mangalore - India";
//    public static final String IXB = "Bagdogra - India";
//    public static final String IXZ = "Port Blair - India";
//    public static final String RPR = "Raipur - India";
//    public static final String HBX = "Hubli - India";
//    public static final String VNS = "Varanasi - India";
//    public static final String VGA = "Vijaywada - India";
//    public static final String CJB = "Coimbatore - India";
//    public static final String TIR = "Tirupati - India";
//    public static final String ATQ = "Amritsar - India";
//
//    public static final String SIN = "Changi Intl Arpt - Singapore";
//    public static final String DXB = "Dubai Intl Arpt - United Arab Emirates";
//    public static final String BKK = "Suvarnabhumi Intl Arpt - Thailand";
//    public static final String KTM = "Tribuvan Arpt,Kathmandu";
//    public static final String MCT = "Seeb Intl - Oman, Sultanate Of";
//    public static final String KUL = "Kuala Lumpur International Arpt - Malaysia";
//    public static final String SHJ = "Sharjah Airport - United Arab Emirates";
//    public static final String CEB = "Cebu Intl - Philippines";
//    public static final String MNL = "Ninoy Aquino Intl - Philippines";
    
    
    
    //Updated Complete source and destination.
    public static final String RJA = "Rajahmundry,Rajahmundry - India";
    public static final String BOM = "Mumbai,Mumbai - India";
    public static final String BLR = "Bangalore,Bangalore - India";
    //public static final String BLR = "Bangalore,Bangalore(bengaluru) - India";
    public static final String DEL = "Delhi,Delhi - India";
    //public static final String DEL = "Delhi,Delhi(new Delhi) - India";
    public static final String IXC = "Chandigarh,Chandigarh - India";
    public static final String GOI = "Goa,Goa - India";
    public static final String GAU = "Guwahati,Guwahati(gauhati) - India";
    public static final String CCU = "Kolkata,Kolkata - India";
    public static final String JAI = "Jaipur,Jaipur - India";
    public static final String SXR = "Srinagar,Srinagar - India";
    public static final String COK = "Cochin,Cochin - India";
    public static final String PNQ = "Pune,Pune - India";
    public static final String VTZ = "Vizag,Visakhapatnam - India";
    public static final String IMF = "Imphal,Imphal - India";
    public static final String MAA = "Chennai,Chennai - India";
    public static final String AMD = "Ahmedabad,Ahmedabad - India";
    public static final String HYD = "Hyderabad,Hyderabad - India";
    public static final String IXM = "Madurai,Madurai - India";
    public static final String TRV = "Trivandrum,Trivandrum(thiruvananthapuram) - India";
    public static final String IXE = "Mangalore,Mangalore - India";
    public static final String IXB = "Bagdogra,Bagdogra - India";
    public static final String IXZ = "Port Blair,Portblair - India";
    public static final String RPR = "Raipur,Raipur - India";
    public static final String HBX = "Hubli,Hubli - India";
    public static final String VNS = "Varanasi,Varanasi(benares) - India";
    public static final String VGA = "Vijaywada,Vijayawada - India";
    public static final String CJB = "Coimbatore,Coimbatore - India";
    public static final String TIR = "Tirupati,Tirupati - India";
    public static final String ATQ = "Amritsar,Amritsar - India";

    public static final String SIN = "Changi Intl Arpt,Singapore - Singapore";
    public static final String DXB = "Dubai Intl Arpt,Dubai - United Arab Emirates";
    public static final String BKK = "Suvarnabhumi Intl Arpt,Bangkok - Thailand";
    public static final String KTM = "Tribuvan Arpt,Kathmandu - Nepal";
    public static final String MCT = "Seeb Intl,Muscat - Oman, Sultanate Of";
    public static final String KUL = "Kuala Lumpur International Arpt,Kuala-lumpur - Malaysia";
    public static final String SHJ = "Sharjah Airport,Sharjah - United Arab Emirates";
    public static final String CEB = "Cebu Intl,Cebu - Philippines";
    public static final String MNL = "Ninoy Aquino Intl,Manila - Philippines";
    public static final String SYD=  "Sydney Kingsford Smith Arpt,Sydney";
    public static final String DAC=  "Zia Intl Airport,Dhaka";
  }

  public interface CityConstantsHolidays {
    public static final String GOA = "Goa, India";
    public static final String KERALA = "Cochin, Kerala, India";
    public static final String COORG = "Coorg, Karnataka, India";
    public static final String BANGALORE = "Bangalore, Karnataka, India";
    public static final String HONEYMOON = "Honeymoon";

  }

}
