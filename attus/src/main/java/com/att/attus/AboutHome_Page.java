package com.att.attus;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutHome_Page{
		
	//---------------------------Footer Links------------------------------
			/**https://about.att.com/allnews.html - footer link - privacy policy**/
			@FindBy(xpath="//a[@aria-label='Privacy Policy']")
			public WebElement privacypolicy_footerlink;
			
			/**https://about.att.com/allnews.html - footer link - privacy policy**/
			@FindBy(xpath="//a[@aria-label='Terms of Use']")
			public WebElement termsofuse_footerlink;
			
			/**https://about.att.com/allnews.html - footer link - privacy policy**/
			@FindBy(xpath="//a[@aria-label='Accessibility']")
			public WebElement accessibility_footerlink;
			
			/**https://about.att.com/allnews.html - footer link - privacy policy**/
			@FindBy(xpath="//a[@aria-label='Contact Us']")
			public WebElement contactus_footerlink;
			//---------------------------Footer Links------------------------------
			
			/**https://about.att.com/allnews.html - heading**/
			@FindBy(xpath="/html/body/div[1]/div/main/div[3]/div/div/div[1]/div/div/div/h2")	
			public WebElement home_search_heading;
		
		
	WebDriver dri;
		public AboutHome_Page(WebDriver driver) {

				this.dri = driver;
				PageFactory.initElements(driver, this);

			}

}
