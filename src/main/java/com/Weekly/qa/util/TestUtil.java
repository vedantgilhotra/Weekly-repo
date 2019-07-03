package com.Weekly.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.Weekly.qa.base.TestBase;
import com.Weekly.qa.pages.WebHomePage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestUtil extends TestBase{
	WebHomePage webHomePage = new WebHomePage();
	

	public static long PAGE_LOAD_TIMEOUT = 70;
	public static long IMPLICIT_WAIT = 70;

	//object repository
	
	@FindBy(partialLinkText="Categories")
	private
	WebElement CategoriesButton;

	@FindBy(partialLinkText="Automotive")
	private
	WebElement AutomotiveCategoryButton;
	
	@FindBy(xpath= "/html/body/div[2]/section/div/div[3]/div/div/div/div/div/form/div[14]/div/input")
	private
	WebElement AdUpdateButton;
	
	@FindBy(xpath="//span[@class='fav-heart' and @style='background: rgb(148, 148, 148);']")
	private
	WebElement FavouriteButtonUnselected;
	
	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div/div/div/div[2]/div[1]/div/div[1]/div/div[1]/span[@style='background:#f1464c;']")
	private
	WebElement FavouriteButtonSelected;
	
	public TestUtil()
	{
	PageFactory.initElements(driver, this);
	}
	
	public void LogoutAction() {
	webHomePage.getUserTag().click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	webHomePage.getLogoutButton().click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("You've been logged out");
}
	
	public void ArrowClick() {
		webHomePage.getUserTag().click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}

	public WebElement getCategoriesButton() {
		return CategoriesButton;
	}

	public void setCategoriesButton(WebElement categoriesButton) {
		CategoriesButton = categoriesButton;
	}

	public WebElement getAutomotiveCategoryButton() {
		return AutomotiveCategoryButton;
	}

	public void setAutomotiveCategoryButton(WebElement automotiveCategoryButton) {
		AutomotiveCategoryButton = automotiveCategoryButton;
	}

	public WebElement getFavouriteButtonSelected() {
		return FavouriteButtonSelected;
	}

	public void setFavouriteButtonSelected(WebElement favouriteButtonSelected) {
		FavouriteButtonSelected = favouriteButtonSelected;
	}

	public WebElement getFavouriteButtonUnselected() {
		return FavouriteButtonUnselected;
	}

	public void setFavouriteButtonUnselected(WebElement favouriteButtonUnselected) {
		FavouriteButtonUnselected = favouriteButtonUnselected;
	}

	public WebElement getAdUpdateButton() {
		return AdUpdateButton;
	}

	public void setAdUpdateButton(WebElement adUpdateButton) {
		AdUpdateButton = adUpdateButton;
	}
	
	
	
}
