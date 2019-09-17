package com.att.attus;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class AboutHome_Test extends GenExtentReports{
	
	BaseClass baseClass;
	AboutHome_Page pObj;
	

	@BeforeTest
	public void setUp() {
		System.out.println("inside set up home");
		baseClass = new BaseClass();
		pObj = new AboutHome_Page(baseClass.driver);
		
	}
	
	@Test(priority=0)
	public void OpenHomePageAndVerifyTitle()
	{
		logger = extent.createTest("OpenHomePageAndVerifyTitle");

		baseClass.openULR("https://about.att.com/category/all_news.html");
		logger.log(Status.PASS, "URL opened successfully");

		baseClass.verifyTitle("AT&T News, Wireless and Network Information | AT&T Newsroom");
		logger.log(Status.PASS, "Title verified successfully");

		baseClass.verifyTextEqual(pObj.home_search_heading, "Latest News");
		
	
	}
	@Test(priority=1)
	public void VerifyFooterLinksOnHomePage()
	{
		logger = extent.createTest("VerifyFooterLinksOnHomePage");
	
		baseClass.verifyTextEqual(pObj.privacypolicy_footerlink, "Privacy Policy");
		logger.log(Status.PASS, "Privacy Policy footer text verified successfully");
		
		baseClass.verifyTextEqual(pObj.termsofuse_footerlink, "Terms of Use");
		logger.log(Status.PASS, "Terms of Use footer text verified successfully");
		
		baseClass.verifyTextEqual(pObj.accessibility_footerlink, "Accessibility");
		logger.log(Status.PASS, "Accessibility footer text verified successfully");
		
		baseClass.verifyTextEqual(pObj.contactus_footerlink, "Contact Us");
		logger.log(Status.PASS, "Contact Us footer text verified successfully");
	
	}
	
	@AfterTest
	public void setDown() {
		System.out.println("inside set dowm home");
		baseClass.driver.quit();
		
	}
	
}
