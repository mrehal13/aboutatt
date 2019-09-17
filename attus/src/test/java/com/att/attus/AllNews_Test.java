package com.att.attus;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class AllNews_Test extends GenExtentReports{
	
	BaseClass baseClass;
	AllNews_Page HpObj;
	
	
	@BeforeTest
	public void setUp() {
		System.out.println("inside setup allnews");
		baseClass = new BaseClass();
		HpObj = new AllNews_Page(baseClass.driver);
		
	}
	
	@Test(priority=0)
	public void OpenAllNewsPageAndVerifyTitle()
	{
		logger = extent.createTest("OpenAllNewsPageAndVerifyTitle");

		baseClass.openULR("https://about.att.com/allnews.html");
		logger.log(Status.PASS, "URL opened successfully");

		baseClass.verifyTitle("All News Features");
		logger.log(Status.PASS, "title verified successfully");

		baseClass.verifyTextEqual(HpObj.allnews_headerText, "All News Features");
		
	
	}
	
	@Test(priority=1)
	public void VerifyFooterLinksOnAllNewsPage()
	{
		logger = extent.createTest("VerifyFooterLinksOnAllNewsPage");
	
		baseClass.verifyTextEqual(HpObj.privacypolicy_footerlink, "Privacy Policy");
		logger.log(Status.PASS, "Privacy Policy footer text verified successfully");
		
		baseClass.verifyTextEqual(HpObj.termsofuse_footerlink, "Terms of Use");
		logger.log(Status.PASS, "Terms of Use footer text verified successfully");
		
		baseClass.verifyTextEqual(HpObj.accessibility_footerlink, "Accessibility");
		logger.log(Status.PASS, "Accessibility footer text verified successfully");
		
		baseClass.verifyTextEqual(HpObj.contactus_footerlink, "Contact Us");
		logger.log(Status.PASS, "Contact Us footer text verified successfully");
	
	}
	
	@AfterTest
	public void setDown() {
		System.out.println("inside setdown allnews");
		baseClass.driver.quit();
		
	}
	
}
