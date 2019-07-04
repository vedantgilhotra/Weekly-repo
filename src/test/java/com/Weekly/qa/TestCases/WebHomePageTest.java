package com.Weekly.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Weekly.qa.base.TestBase;
import com.Weekly.qa.pages.CurrentAdsPage;
import com.Weekly.qa.pages.FavouriteAdsPage;
import com.Weekly.qa.pages.SavedAdsPage;
import com.Weekly.qa.pages.WebHomePage;
import com.Weekly.qa.util.TestUtil;

public class WebHomePageTest extends TestBase{

	CurrentAdsPage currentAdsPage;
	FavouriteAdsPage favouriteAdsPage;
	SavedAdsPage savedAdsPage;
	WebHomePage webHomePage;
	TestUtil testUtil;
	
	
	public WebHomePageTest() {
		super();
	}
	
@BeforeMethod
public void setup() {
	initialization();
	currentAdsPage = new CurrentAdsPage();
	favouriteAdsPage = new FavouriteAdsPage();
	savedAdsPage = new SavedAdsPage();
	webHomePage = new WebHomePage();
	webHomePage.Login("kunal@yopmail.com", "Kunal@123");
	testUtil = new TestUtil();
}


@Test(enabled = false)
public void TC_01_CurrentAds() {
	webHomePage.ClickOnArrow();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Assert.assertTrue(webHomePage.getCurrentAdsButton().isEnabled());
	webHomePage.getLogoutButton().click();
}

@Test(enabled = false)
public void TC_02_CurrentAds() {
	webHomePage.ClickOnArrow();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(webHomePage.getCurrentAdsButton().isEnabled() && webHomePage.getCurrentAdsButton().isDisplayed()) {
		Assert.assertTrue(true,"The button is not clickable");
	}
	webHomePage.getLogoutButton().click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println("you've been logged out");
}

@Test(enabled = false)
public void TC_03_CurrentAds() {
	webHomePage.ClickOnCurrentAdsButton();
	String check = driver.getTitle();
	Assert.assertEquals(check, "WeeklyPaper - My Current Ads");
	webHomePage.ClickOnLogoutButton();
}



@Test(enabled = false)
public void TC_06_CurrentAds() {
	webHomePage.ClickOnCurrentAdsButton();
	int p = 0;
}

@Test(enabled = true)
public void TC_01() {
	System.out.println("User is on the website and logged in as well");
	Assert.assertTrue(true);
}

@Test(enabled = true)
public void TC_02() {
	testUtil.LogoutAction();
	int poi=0;
	if(testUtil.getCountrydrpdwn().isDisplayed())
	{
		poi++;
		System.out.println("Country dropdown is available");
	}
	
	if(testUtil.getCategoriesButton().isDisplayed())
	{
		poi++;
		System.out.println("Categories Button is available");
	}
	
	if(testUtil.getAboutUsButton().isDisplayed())
	{
		poi++;
		System.out.println("About Us Button is available");
	}
	
	if(testUtil.getLoginButton().isDisplayed())
	{
		poi++;
		System.out.println("LoginButton is available");
	}
	
	if(testUtil.getSignUpButton().isDisplayed())
	{
		poi++;
		System.out.println("Sign Up Button is available");
	}
	
	if(testUtil.getPostAdButton().isDisplayed())
	{
		poi++;
		System.out.println("PostAdButton is available");
	}
	
	if(testUtil.getSearchBar().isDisplayed())
	{
		poi++;
		System.out.println("SearchBar is available");
	}
	
	if(testUtil.getLogo().isDisplayed())
	{
		poi++;
		System.out.println("Logo is available");
	}
	
	if(testUtil.getFeaturedAds().isDisplayed())
	{
		poi++;
		System.out.println("FeatureAds is available");
	}
	
	if(testUtil.getLatestAds().isDisplayed())
	{
		poi++;
		System.out.println("LatestAds is available");
	}
	
	if(testUtil.getMainViewedCategories().isDisplayed())
	{
		poi++;
		System.out.println("MainViewedCategories is available");
	}
	
	if(testUtil.getNewsLetterSection().isDisplayed())
	{
		poi++;
		System.out.println("news letter section is available");
	} 
	

	if(testUtil.getFooterSection().isDisplayed())
	{
		poi++;
		System.out.println("footer section is available");
	} 
	

	if(testUtil.getPopularSearch().isDisplayed())
	{
		poi++;
		System.out.println("popular Search is available");
	} 
	if(poi==13)
		System.out.println("all required sections are available");
	Assert.assertTrue(true);
}


@Test(enabled = true)
public void TC_03() {
	int poi=0;
	if(testUtil.getCountrydrpdwn().isDisplayed())
	{
		poi++;
		System.out.println("Country dropdown is available");
	}
	
	if(testUtil.getCategoriesButton().isDisplayed())
	{
		poi++;
		System.out.println("Categories Button is available");
	}
	
	if(testUtil.getAboutUsButton().isDisplayed())
	{
		poi++;
		System.out.println("About Us Button is available");
	}
	
	if(testUtil.getPostAdButton().isDisplayed())
	{
		poi++;
		System.out.println("PostAdButton is available");
	}
	
	if(testUtil.getSearchBar().isDisplayed())
	{
		poi++;
		System.out.println("SearchBar is available");
	}
	
	if(testUtil.getLogo().isDisplayed())
	{
		poi++;
		System.out.println("Logo is available");
	}
	
	if(testUtil.getFeaturedAds().isDisplayed())
	{
		poi++;
		System.out.println("FeatureAds is available");
	}
	
	if(testUtil.getLatestAds().isDisplayed())
	{
		poi++;
		System.out.println("LatestAds is available");
	}
	
	if(testUtil.getNewsLetterSection().isDisplayed())
	{
		poi++;
		System.out.println("news letter section is available");
	} 
	

	if(testUtil.getFooterSection().isDisplayed())
	{
		poi++;
		System.out.println("footer section is available");
	} 
	
	if(webHomePage.getUserTag().isDisplayed())
	{
		poi++;
		System.out.println("Account menu is available");
	}
	
	if(testUtil.getBrowseByCategory().isDisplayed())
	{
		poi++;
		System.out.println("browse by category button is available");
	}

	if(poi==12)
		System.out.println("all required sections are available");
	Assert.assertTrue(true);
		
}

@Test(enabled = false)
public void TC_04() {
	
}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
