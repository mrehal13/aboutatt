package com.att.attus;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllNews_Page{
		
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
		@FindBy(xpath="//h1[@id='headline']")	
		public WebElement allnews_headerText;
		
		
	WebDriver dri;
		public AllNews_Page(WebDriver driver) {

				this.dri = driver;
				PageFactory.initElements(driver, this);

			}

}
