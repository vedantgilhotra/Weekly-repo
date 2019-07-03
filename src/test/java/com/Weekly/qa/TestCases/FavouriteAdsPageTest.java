package com.Weekly.qa.TestCases;

import org.testng.annotations.*;

import com.Weekly.qa.base.TestBase;
import com.Weekly.qa.pages.CurrentAdsPage;
import com.Weekly.qa.pages.FavouriteAdsPage;
import com.Weekly.qa.pages.PastAdsPage;
import com.Weekly.qa.pages.WebHomePage;
import com.Weekly.qa.util.TestUtil;

import junit.framework.Assert;

public class FavouriteAdsPageTest extends TestBase{

	WebHomePage webHomePage;
	CurrentAdsPage currentAdsPage;
	TestUtil testUtil;
	PastAdsPage pastAdsPage;
	FavouriteAdsPage favouriteAdsPage;
	
	@BeforeMethod
	public void setup() {
		initialization();
		webHomePage = new WebHomePage();
		currentAdsPage = new CurrentAdsPage();
		webHomePage.Login("kunal@yopmail.com", "Kunal@123");
		webHomePage.ClickOnFavouriteAds();
		testUtil = new TestUtil();
		pastAdsPage = new PastAdsPage();
		favouriteAdsPage = new FavouriteAdsPage();
		
	}
	
	@Test(enabled = true)
	public void TC_50() {
		testUtil.getCategoriesButton().click();
		testUtil.getAutomotiveCategoryButton().click();
		if(testUtil.getFavouriteButtonSelected()!=null)
		{
			System.out.println("The Ad Has Already been favourite");
		}
		else
		{
			testUtil.getFavouriteButtonUnselected().click();
			System.out.println("the favourite button has been clicked");
		}
		String ctitle= favouriteAdsPage.getCategoryAdTitle().getText();
		webHomePage.ClickOnFavouriteAds();
	
	String check = favouriteAdsPage.getTitleEntry().getText();
	Assert.assertEquals(ctitle.toLowerCase(),check.toLowerCase());
	
	}
	
	@Test(enabled = true)
	public void TC_52() {
		int poi=0;
		
		if(favouriteAdsPage.getTablePictureHeader().isDisplayed())
		{
			poi++;
			System.out.println("The Image Header is available");
		}
		
		if(favouriteAdsPage.getTableCategoryHeader().isDisplayed())
		{
			poi++;
			System.out.println("The category Header is available");
		}
		
		if(favouriteAdsPage.getTableSubCategoryHeader().isDisplayed())
		{
			poi++;
			System.out.println("The sub category Header is available");
		}
		
		if(favouriteAdsPage.getTableTitleHeader().isDisplayed())
		{
			poi++;
			System.out.println("The Title Header is available");
		}
		
		if(favouriteAdsPage.getTablePostedDateHeader().isDisplayed())
		{
			poi++;
			System.out.println("The Posted Date Header is available");
		}
		
		if(poi==5)
		{
			System.out.println("The needed fields are available");
			Assert.assertTrue(true);
		}
	}
	
	@Test(enabled = true)
	public void TC_54() {
		if(favouriteAdsPage.getDeleteButton().isEnabled() && favouriteAdsPage.getDeleteButton().isDisplayed())
		{
			Assert.assertTrue(true);
		}
	}
	
	@Test(enabled = true)
	public void TC_55() {
		favouriteAdsPage.getDeleteButton().click();
		favouriteAdsPage.getDeleteYesButton().click();
		if(currentAdsPage.getAdDeleted().isDisplayed())
		{
			System.out.println("Ad Deleted");
			Assert.assertTrue(true);
		}
	}
	
	@Test(enabled = true)
	public void TC_56() {
		if(currentAdsPage.TableRowCount()<5)
		{
			System.out.println("Not enough Posts to paginate for");
			Assert.assertTrue(true);
		}
		else
		{
			if(favouriteAdsPage.getPagination1().isDisplayed())
			{
				System.out.println("Pagination is available");
				Assert.assertTrue(true);
			}
		}
	}
	
	@Test(enabled = true)
	public void TC_57() {
		if(currentAdsPage.TableRowCount()<5 && favouriteAdsPage.getPagination1().isDisplayed())
		{
			System.out.println("The required condition is not fulfilled");
			Assert.fail();
		}
		else
		{
			if(currentAdsPage.TableRowCount()==5)
			{
				System.out.println("The required number of 5 posts are available on the favourite Ads Page");
				Assert.assertTrue(true);
			}
		}
	}
	
	
	@Test(enabled = true)
	public void TC_58() {
		if(currentAdsPage.TableRowCount()<5)
		{
			System.out.println("Not enough Posts to paginate for");
			Assert.assertTrue(true);
		}
		else
		{
			if(favouriteAdsPage.getPagination1().isDisplayed())
			{
				System.out.println("Pagination is available");
				favouriteAdsPage.getPagination2().click();
				if(currentAdsPage.TableRowCount()>0)
				{
					System.out.println("user can view Ads by clicking on pagination numbers");
					Assert.assertTrue(true);
				}
			}
		}
		
	}
	
	
	@AfterMethod
	public void destroy() {
	driver.quit();
	}
}
