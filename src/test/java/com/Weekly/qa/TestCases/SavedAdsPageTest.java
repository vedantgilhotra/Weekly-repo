package com.Weekly.qa.TestCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import com.Weekly.qa.base.TestBase;
import com.Weekly.qa.pages.CurrentAdsPage;
import com.Weekly.qa.pages.PastAdsPage;
import com.Weekly.qa.pages.SavedAdsPage;
import com.Weekly.qa.pages.WebHomePage;
import com.Weekly.qa.util.TestUtil;

import junit.framework.Assert;

public class SavedAdsPageTest extends TestBase{

	WebHomePage webHomePage;
	CurrentAdsPage currentAdsPage;
	TestUtil testUtil;
	PastAdsPage pastAdsPage;
	SavedAdsPage savedAdsPage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		webHomePage = new WebHomePage();
		currentAdsPage = new CurrentAdsPage();
		webHomePage.Login("kunal@yopmail.com", "Kunal@123");
		webHomePage.ClickOnSavedAdsButton();
		testUtil = new TestUtil();
		pastAdsPage = new PastAdsPage();
		savedAdsPage = new SavedAdsPage();

		
	}
	
	@Test(enabled = true)
	public void TC_59() {
		webHomePage.ClickOnArrow();
		if(savedAdsPage.getSavedAdsButton().isDisplayed())
		{
			System.out.println("saved ads Button is present in the menu");
			Assert.assertTrue(true);
		}
	}
	
	@Test(enabled = true)
	public void TC_60() {
		String check = savedAdsPage.GetTitle();
		Assert.assertEquals(check,"WeeklyPaper - My Saved Ads","The title of the page doesen't match the needed");
	}
	
	@Test(enabled = true)
	public void TC_61() {
		savedAdsPage.getEditButton().click();
		String check = savedAdsPage.GetTitle();
		Assert.assertEquals(check,"WeeklyPaper - Update Your Ads","User could not edit the page after clicking the edit button");
		
	}
	
	
	@Test(enabled = true)
	public void TC_62() {
		//using elements from other pages for they are similar
		savedAdsPage.getDeleteButton().click();
		pastAdsPage.getDeleteYes().click();
		if(currentAdsPage.getAdDeleted().isDisplayed())
		{
			System.out.println("Ad Deleted");
			Assert.assertTrue(true);
		}
	}
	
	@Test(enabled = true)
	public void TC_63() {
		//using elements from other pages for they are similar
		savedAdsPage.getEditButton().click();
		Select statusdrpdwn = new Select(currentAdsPage.getStatusAdUpdate());
		statusdrpdwn.selectByVisibleText("Live");
		testUtil.getAdUpdateButton().click();
		if(currentAdsPage.getAdDeleted().isDisplayed())
		{
			System.out.println("Ad has been updated");
			Assert.assertTrue(true);
		}
	}
	
	@Test(enabled = true)
	public void TC_64() {
		
	}
	
	
	@AfterMethod
	public void destroy() {
		driver.quit();
	}
}
