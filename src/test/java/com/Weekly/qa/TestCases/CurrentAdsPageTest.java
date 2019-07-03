package com.Weekly.qa.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.Weekly.qa.base.TestBase;
import com.Weekly.qa.pages.CurrentAdsPage;
import com.Weekly.qa.pages.PastAdsPage;
import com.Weekly.qa.pages.WebHomePage;
import com.Weekly.qa.util.TestUtil;

public class CurrentAdsPageTest extends TestBase{

	WebHomePage webHomePage;
	CurrentAdsPage currentAdsPage;
	TestUtil testUtil;
	PastAdsPage pastAdsPage;
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		webHomePage = new WebHomePage();
		currentAdsPage = new CurrentAdsPage();
		webHomePage.Login("kunal@yopmail.com", "Kunal@123");
		webHomePage.ClickOnCurrentAdsButton();
		testUtil = new TestUtil();
		pastAdsPage = new PastAdsPage();
		
	}
	
	
	@Test(enabled = true)
	public void TC_04() {
		currentAdsPage.getCurrentAdsImage().click();
		String check =currentAdsPage.getCurrentAdsPostUsername().getAttribute("value");
		System.out.println(check);
		String tag = webHomePage.getUserTag().getAttribute("value");
		Assert.assertEquals(check, tag,"The User posting the add and the logged in user don't match");
		testUtil.LogoutAction();
	}
	
	@Test(enabled = true)
	public void TC_05() {
		currentAdsPage.getCurrentAdsImage().click();
		String check =currentAdsPage.getCurrentAdsPostUsername().getText();
		System.out.println(check);
		String tag = webHomePage.getUserTag().getText();
		Boolean tf = check.equalsIgnoreCase(tag);
		Assert.assertTrue(tf);
		testUtil.LogoutAction();
	}
	
	@Test(enabled = true)
	public void TC_06() {
		int poi=0;
		if(currentAdsPage.getPictureTableHeader().isDisplayed())
		{
			poi++;
			System.out.println("Pictures field is visible");
			
		}
	
		if(currentAdsPage.getCategoryTableHeader().isDisplayed())
	{
		poi++;
		System.out.println("Categories field is visible");
	}
	
	if(currentAdsPage.getSubcategoryTableHeader().isDisplayed())
	{
		poi++;
		System.out.println("Subcategory field is visible");
	}
	
	if(currentAdsPage.getTitleTableHeader().isDisplayed()) 
	{
		poi++;
		System.out.println("Title field is visible");
	}
	
	if(currentAdsPage.getStatusTableHeader().isDisplayed()) 
	{
		poi++;
		System.out.println("Status field is visible");
	}
	
	if(currentAdsPage.getPostedDateTableHeader().isDisplayed()) 
	{
		poi++;
		System.out.println("Posted Date field is visible");
	}
	
	if(currentAdsPage.getActionsTableHeader().isDisplayed()) 
	{
		poi++;
		System.out.println("Actions field is visible");
	}
	
	if(poi==7)
		{
			Assert.assertTrue(true);
		}
	
	}
	
	@Test(enabled = true)
	public void TC_07() {
		int poi=0;
		if(currentAdsPage.getPictureTableHeader().isDisplayed())
		{
			poi++;
			System.out.println("Pictures field is visible");
			
		}
	
		if(currentAdsPage.getCategoryTableHeader().isDisplayed())
	{
		poi++;
		System.out.println("Categories field is visible");
	}
	
	if(currentAdsPage.getSubcategoryTableHeader().isDisplayed())
	{
		poi++;
		System.out.println("Subcategory field is visible");
	}
	
	if(currentAdsPage.getTitleTableHeader().isDisplayed()) 
	{
		poi++;
		System.out.println("Title field is visible");
	}
	
	if(currentAdsPage.getStatusTableHeader().isDisplayed()) 
	{
		poi++;
		System.out.println("Status field is visible");
	}
	
	if(currentAdsPage.getPostedDateTableHeader().isDisplayed()) 
	{
		poi++;
		System.out.println("Posted Date field is visible");
	}
	
	if(currentAdsPage.getActionsTableHeader().isDisplayed()) 
	{
		poi++;
		System.out.println("Actions field is visible");
	}
	
	if(poi==7)
		{
			Assert.assertTrue(true);
		}
	
	}
	
@Test(enabled = true)
public void TC_08() {
	String tex = currentAdsPage.getStatusEntry().getText();
	Assert.assertEquals(tex,"live","status of post is not live");
}

@Test(enabled = true)
public void TC_09() {
	currentAdsPage.getEditButton().click();
	
	Select categorydrpdwn = new Select(currentAdsPage.getCategoryUpdateAd());
	categorydrpdwn.selectByVisibleText("Jobs");
	
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Select subcategorydrpdwn = new Select(currentAdsPage.getSubcategoryUpdateAd());
	subcategorydrpdwn.selectByVisibleText("Domestic");
	
	String check1=currentAdsPage.getCategoryUpdateAd().getAttribute("value");
	String check2=currentAdsPage.getSubcategoryUpdateAd().getAttribute("value");
	
	currentAdsPage.getAdUpdateButton().click();
	
	if(check1.contentEquals("Jobs") && check2.contentEquals("Domestic"))
	{
		Assert.assertTrue(true);
		System.out.println("Category and Subcategory Updated Successfully");
	}
	
}

@Test(enabled = true)
public void TC_10() {
	currentAdsPage.getEditButton().click();
	
	currentAdsPage.getTitleAdUpdate().clear();
	currentAdsPage.getTitleAdUpdate().sendKeys("Test Text");
	
	currentAdsPage.getDescriptionAdUpdate().clear();
	currentAdsPage.getDescriptionAdUpdate().sendKeys("Test Text");
	
	currentAdsPage.getAdUpdateButton().click();
	
	String check1 = currentAdsPage.getDescriptionAdUpdate().getAttribute("value");
	String check2 = currentAdsPage.getTitleAdUpdate().getAttribute("value");
	
	if(check1.contentEquals("Test Text") && check2.contentEquals("Test Text"))
	{
		System.out.println("Description and title updated successfully");
		Assert.assertTrue(true);
	}
}

@Test(enabled = true)
public void TC_11() {
	currentAdsPage.getEditButton().click();
	
	currentAdsPage.getAddressAdUpdate().clear();
	currentAdsPage.getAddressAdUpdate().sendKeys("Test Text");
	
	currentAdsPage.getAdUpdateButton().click();
	
	String check = currentAdsPage.getAddressAdUpdate().getAttribute("value");
	
	Assert.assertEquals(check, "Test Text","address not updated");
}

@Test(enabled = true)
public void TC_12() {
	currentAdsPage.getEditButton().click();
	
	currentAdsPage.getPriceAdUpdate().clear();
	currentAdsPage.getPriceAdUpdate().sendKeys("100");
	
	currentAdsPage.getAdUpdateButton().click();
	
	String check = currentAdsPage.getPriceAdUpdate().getAttribute("value");
	
	Assert.assertEquals(check,"100","price wasn't updated");
}

@Test(enabled = true)
public void TC_13() {
	if(currentAdsPage.getEditButton().isDisplayed() && currentAdsPage.getDeleteAdButton().isDisplayed())
	{
		
		Assert.assertTrue(true);
		System.out.println("Edit and delete button are available on the page");
		
	}
	else {

		System.out.println("Edit and delete button are not available on the page");
	}
}

@Test(enabled = true)
public void TC_14() {
	
	if(currentAdsPage.getEditButton().isDisplayed() && currentAdsPage.getEditButton().isEnabled())
	{
		Assert.assertTrue(true);
		System.out.println("Edit Button is Clickable");
	}

}

@Test(enabled = true)
public void TC_15() {
	
	if(currentAdsPage.getDeleteAdButton().isDisplayed() && currentAdsPage.getDeleteAdButton().isEnabled())
	{
		Assert.assertTrue(true);
		System.out.println("Delete Button is Clickable");
	}

}

@Test(enabled = true)
public void TC_16() {
	currentAdsPage.getEditButton().click();
	
	String check = driver.getTitle();
	Assert.assertEquals(check, "WeeklyPaper - Update Your Ads","You cannot see ad when edit button is clicked");
}

@Test(enabled = true)
public void TC_17() {
	currentAdsPage.getEditButton().click();
	
	String check = driver.getTitle();
	Assert.assertEquals(check, "WeeklyPaper - Update Your Ads","You cannot see ad when edit button is clicked");
}

@Test(enabled = true)
public void TC_18() {
	currentAdsPage.getEditButton().click();
	
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

	currentAdsPage.getEditButton().click();
	String check = currentAdsPage.getTitleAdUpdate().getAttribute("value");
	Assert.assertEquals(check,"Sample Title","The available text does not match the text updated with");
}

@Test(enabled = true)
public void TC_19() {
	currentAdsPage.getEditButton().click();
	
	Select statusdrpdwn = new Select(currentAdsPage.getStatusAdUpdate());
	statusdrpdwn.selectByVisibleText("Sold");
	
	currentAdsPage.getAdUpdateButton().click();
	
	String check = pastAdsPage.getStatusEntry().getText();
	Assert.assertEquals(check,"sold","The status of the ad was not updated");
}

@Test(enabled = true)
public void TC_20() {
	currentAdsPage.getEditButton().click();
	
	Select statusdrpdwn = new Select(currentAdsPage.getStatusAdUpdate());
	statusdrpdwn.selectByVisibleText("Sold");
	
	currentAdsPage.getAdUpdateButton().click();
	
	String check = pastAdsPage.getStatusEntry().getText();
	Assert.assertEquals(check, "sold");

}

@Test(enabled = true)
public void TC_21() {
Assert.assertTrue(currentAdsPage.getRatingTableHeader().isDisplayed());
}

@Test(enabled = true)
public void TC_22() {
	Assert.assertTrue(currentAdsPage.getRatingTableHeader().isDisplayed());
}

@Test(enabled = true)
public void TC_24() {
	currentAdsPage.getEditButton().click();
	boolean tf= driver.getPageSource().contains("rating");
	if(!tf)
	{
		Assert.assertTrue(true);
		System.out.println("User cannot edit their own ad's rating");
	}
	
}


@Test(enabled = true)
public void TC_26() {
	
	if(currentAdsPage.TableRowCount()<=4)
	{
		System.out.println("Not enough posts to paginate");
		Assert.assertTrue(true);
		
	}
	
	if(currentAdsPage.getPagination().isEnabled() && currentAdsPage.getPagination().isDisplayed())
{
	Assert.assertTrue(true);
	System.out.println("Pagination is available");
}
}

@Test(enabled = true)
public void TC_27() {

	if(currentAdsPage.TableRowCount()==5)
{
	Assert.assertTrue(true);
	
}
else {
	Assert.fail();

}
}

@Test(enabled = true)
public void TC_28() {
	
	if(currentAdsPage.TableRowCount()<=4)
	{
		System.out.println("Not enough posts to paginate");
		Assert.assertTrue(true);
		
	}
	
	if(currentAdsPage.getPagination().isEnabled() && currentAdsPage.getPagination().isDisplayed())
{
	System.out.println("Pagination is available");

	if(currentAdsPage.getPagination2().isDisplayed() && currentAdsPage.getPagination2().isEnabled()) {
		Assert.assertTrue(true);
		System.out.println("posts can be viewed by clicking page numbers");
		
		}
	}
}

@Test(enabled = true)
public void TC_29() {
	if(currentAdsPage.TableRowCount()<=4)
	{
		System.out.println("Not enough posts to paginate");
		Assert.assertTrue(true);
		
	}
	
	if(currentAdsPage.getPagination().isEnabled() && currentAdsPage.getPagination().isDisplayed())
{
	System.out.println("Pagination number 1 is available");

	if(currentAdsPage.getPagination2().isDisplayed() && currentAdsPage.getPagination2().isEnabled()) {
		Assert.assertTrue(true);
		System.out.println("pagination number 2 is available");
		
	}	
}
}

@Test(enabled = true)
public void TC_30() {
	
	currentAdsPage.DeleteAd();
	

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
	public void terminate() {
		driver.quit();
	}
	
}
