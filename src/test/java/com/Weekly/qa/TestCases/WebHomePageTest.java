package com.Weekly.qa.TestCases;

import org.testng.annotations.BeforeTest;

import com.Weekly.qa.base.TestBase;
import com.Weekly.qa.pages.CurrentAdsPage;
import com.Weekly.qa.pages.FavouriteAdsPage;
import com.Weekly.qa.pages.SavedAdsPage;
import com.Weekly.qa.pages.WebHomePage;

import org.testng.Assert;
import org.testng.annotations.*;

public class WebHomePageTest extends TestBase{

	CurrentAdsPage currentAdsPage;
	FavouriteAdsPage favouriteAdsPage;
	SavedAdsPage savedAdsPage;
	WebHomePage webHomePage;
	
	
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
	
}


@Test(enabled = true)
public void TC_01() {
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

@Test(enabled = true)
public void TC_02() {
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

@Test(enabled = true)
public void TC_03() {
	webHomePage.ClickOnCurrentAdsButton();
	String check = driver.getTitle();
	Assert.assertEquals(check, "WeeklyPaper - My Current Ads");
	webHomePage.ClickOnLogoutButton();
}



@Test(enabled = true)
public void TC_06() {
	webHomePage.ClickOnCurrentAdsButton();
	int p = 0;
}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
