package com.Weekly.qa.TestCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import com.Weekly.qa.base.TestBase;
import com.Weekly.qa.pages.CurrentAdsPage;
import com.Weekly.qa.pages.PastAdsPage;
import com.Weekly.qa.pages.WebHomePage;
import com.Weekly.qa.util.TestUtil;


public class PastAdsPageTest extends TestBase{

	WebHomePage webHomePage;
	TestUtil testUtil;
	PastAdsPage pastAdsPage;
	CurrentAdsPage currentAdsPage;

	@BeforeMethod
	public void setup() {
		initialization();
		webHomePage = new WebHomePage();
		currentAdsPage = new CurrentAdsPage();
		webHomePage.Login("kunal@yopmail.com", "Kunal@123");
		pastAdsPage = new PastAdsPage();
		pastAdsPage.ClickOnPastAds();
		testUtil = new TestUtil();
	}

	@Test(enabled = true)
	public void TC_31() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String check = pastAdsPage.GetTitle();
		//Assert.assertEquals("WeeklyPaper - My Past Ads", check,"you did not navigate to PastAdsPage");
		Assert.assertEquals("WeeklyPaper - My Past Ads", check);
	}
	
	@Test(enabled = true)
	public void TC_32() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String check = pastAdsPage.getStatusEntry().getText();
		
		
		System.out.println(check);
		
		Assert.assertEquals(check, "sold");
		
	}
	
	@Test(enabled = true)
	public void TC_33() {
		String check = pastAdsPage.getStatusEntry().getText();
		if(check.contentEquals("sold"))
		{	
			System.out.println("Status marked as sold only and nothing else");
			}
		
		//Assert.assertEquals("sold",check,"The status is not set as sold");
		Assert.assertEquals(check, "sold");
		}

	@Test(enabled = true)
	public void TC_34() {
		pastAdsPage.getImageEntry().click();
		String check =pastAdsPage.getPastAdsPostUsername().getText();
		System.out.println(check);
		String tag = webHomePage.getUserTag().getText();
		Boolean tf = check.equalsIgnoreCase(tag);
		Assert.assertTrue(tf);
	}

	@Test(enabled = true)
	public void TC_35() {
		int poi=0;
		if(pastAdsPage.getTablePictureHeader().isDisplayed())
		{
			poi++;
			System.out.println("Image Header is available");
		}
		
		if(pastAdsPage.getTableCategoryHeader().isDisplayed())
		{
			poi++;
			System.out.println("Category Header is available");
		}
		
		if(pastAdsPage.getTableSubCategoryheader().isDisplayed())
		{
			poi++;
			System.out.println("Sub-Category Header is available");
		}
	
		if(pastAdsPage.getTableTitleHeader().isDisplayed())
		{
			poi++;
			System.out.println("Title Header is available");
		}
		
		if(pastAdsPage.getTableStatusHeader().isDisplayed())
		{
			poi++;
			System.out.println("Status Header is available");
		}
		
		if(pastAdsPage.getTableStatusHeader().isDisplayed())
		{
			poi++;
			System.out.println("Status Header is available");
		}
		
		if(pastAdsPage.getTablePostedDateHeader().isDisplayed())
		{
			poi++;
			System.out.println("Posted Date Header is available");
		}
		
		if(poi == 7)
		{
			System.out.println("The asked categories are all available");
			Assert.assertTrue(true);
		}
		else 
		{
			System.out.println("One or more asked information is not available");
			Assert.fail();
		}
	}
		
	
	@Test(enabled = true)
		public void TC_37() {
		String check = pastAdsPage.getStatusEntry().getText();
	//	Assert.assertEquals("sold",check,"The status is not set as sold");
		Assert.assertEquals(check,"sold");
	}
	
	@Test(enabled = true)
	public void TC_38() {
		if(pastAdsPage.getEditButton().isDisplayed() && pastAdsPage.getDeleteButton().isDisplayed())
		{
			System.out.println("Edit and Delete Button are available on Past Ads page");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("one or both of the button are not available");
			Assert.fail();
		}
	}
	
	@Test(enabled = true)
	public void TC_39() {
		if(pastAdsPage.getEditButton().isDisplayed() && pastAdsPage.getEditButton().isEnabled())
		{
			System.out.println("Edit button is clickable");
			Assert.assertTrue(true);
		}
	}
	
	@Test(enabled = true)
	public void TC_40() {
		if(pastAdsPage.getDeleteButton().isDisplayed() && pastAdsPage.getDeleteButton().isEnabled())
		{
			System.out.println("Delete button is clickable");
			Assert.assertTrue(true);
		}
	}
	
	@Test(enabled = true)
	public void TC_41() {
		pastAdsPage.getImageEntry().click();
		if(pastAdsPage.getPastAdsPostUsername().isDisplayed())
		{
			System.out.println("User can display the Ad");
			Assert.assertTrue(true);
		}
		
		else
		{
			System.out.println("user cannot display the Ad");
			Assert.fail();
		}
	}
	
	@Test(enabled = true)
	public void TC_42() {
		
		pastAdsPage.getEditButton().click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String check= pastAdsPage.GetTitle();
		//Assert.assertEquals("WeeklyPaper - Update Your Ads", check,"User will not be able to edit the ad from here");
		Assert.assertEquals("WeeklyPaper - Update Your Ads",check);
	}
	
	@Test(enabled = true)
	public void TC_43() {
		pastAdsPage.getEditButton().click();
		//using element from currentAdsPage because they are same as needed here for past Ads Page.
		currentAdsPage.getTitleAdUpdate().clear();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		currentAdsPage.getTitleAdUpdate().sendKeys("Sample Title");
		
		currentAdsPage.getAdUpdateButton().click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//webHomePage.ClickOnCurrentAdsButton();
		
		//String check = currentAdsPage.getTitleEntry().getText();

		pastAdsPage.getEditButton().click();
		String check = currentAdsPage.getTitleAdUpdate().getAttribute("value");
		//Assert.assertEquals(check,"Sample Title","The available text does not match the text updated with");
		Assert.assertEquals("Sample Title",check);
	}
	
	@Test(enabled = true)
	public void TC_44() {
		
		//using element from currentAdsPage for they are similar to those needed here
		
		pastAdsPage.getEditButton().click();
		Select statusdrpdwn = new Select(currentAdsPage.getStatusAdUpdate());
		statusdrpdwn.selectByVisibleText("Live");
		currentAdsPage.getAdUpdateButton().click();
		
		if(currentAdsPage.getAdDeleted().isDisplayed())
		{
			System.out.println("The Ad was updated successfully");
			Assert.assertTrue(true);
		}

		else{
			System.out.println("The Ad was not Updated");
			Assert.fail();
			
		}
	}
	
	@Test(enabled = true)
	public void TC_45() {
		//using element from currentAdsPage for they are similar to those needed here
		
				pastAdsPage.getEditButton().click();
				Select statusdrpdwn = new Select(currentAdsPage.getStatusAdUpdate());
				statusdrpdwn.selectByVisibleText("Live");
				currentAdsPage.getAdUpdateButton().click();
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(currentAdsPage.getAdDeleted().isDisplayed())
				{
					System.out.println("The Ad was updated successfully");
					Assert.assertTrue(true);
				}

				else{
					System.out.println("The Ad was not Updated");
					Assert.fail();
					
				}
	}
	
	@Test(enabled = true)
	public void TC_46() {
		if(pastAdsPage.TableRowCount()<=4)
		{
			System.out.println("Not enough posts to paginate");
			Assert.assertTrue(true);
			
		}
		
		else if(pastAdsPage.getPagination1().isEnabled() && pastAdsPage.getPagination1().isDisplayed())
	{
		Assert.assertTrue(true);
		System.out.println("Pagination is available");
	}
		else 
		{
			System.out.println("Unknown Issue");
		}
	}
	
	@Test(enabled = true)
	public void TC_47() {
		
		
		if(pastAdsPage.TableRowCount()>5)
		{
			System.out.println("The number of Ads exceeds 5");
			Assert.fail();
		}
		
		
		else
		{
			System.out.println("The number of Ads here is not over 5");
			Assert.assertTrue(true);
		}

	}
	
	@Test(enabled = true)
	public void TC_48() {
		if(pastAdsPage.TableRowCount()<5)
		{
			System.out.println("Pagination is not possible here , less number of posts");
			Assert.assertTrue(true);
		}
		
		else if(pastAdsPage.getPagination2().isDisplayed() && pastAdsPage.getPagination2().isEnabled())
		{
		
			pastAdsPage.getPagination2().click();
			
		}
		else {
			System.out.println("Unknown issue here");
		}
		if(pastAdsPage.TableRowCount()>0)
			{
			Assert.assertTrue(true);
			System.out.println("The Ads can be seen when pagination numbers are clicked");
			}
		else
			{
			System.out.println("The Ads cannot be seen after pagination number is clicked");
			Assert.fail();
			}
		
		}
		
		
		
		
	
	
	@Test(enabled = true)
	public void TC_49() {
		pastAdsPage.getDeleteButton().click();
		pastAdsPage.getDeleteYes().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if(currentAdsPage.getAdDeleted().isDisplayed())
		{
			System.out.println("The Ad was deleted successfully");
			Assert.assertTrue(true);
		}

		else{
			System.out.println("The Ad was not Deleted");
			Assert.fail();
			
		}
	}
	
	@AfterMethod
	public void destroy() {
		driver.quit();
	}

	}

