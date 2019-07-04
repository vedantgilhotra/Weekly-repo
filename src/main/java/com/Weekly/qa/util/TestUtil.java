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
	
	@FindBy(xpath="//li[@class='category_menu']//a[contains(text(),'Categories')]")
	WebElement CategoriesButton;
	
	@FindBy(xpath="//div[@class='bottom_menu']//ul//li[2]//a[contains(text(),'About Us')]")
	private
	WebElement AboutUsButton;
	
	@FindBy(partialLinkText="Login")
	private
	WebElement LoginButton;
	
	@FindBy(partialLinkText="Sign Up")
	private
	WebElement SignUpButton;

	@FindBy(xpath="//input[@id = 'search']")
	private
	WebElement SearchBar;
	
	@FindBy(xpath="//div[@class='logo']//a//img")
	private
	WebElement Logo;
	
	@FindBy(xpath="//span[@class='select2-selection__rendered']")
	private
	WebElement countrydrpdwn;
	
	
	@FindBy(xpath="//div[@class=\"col-md-12\"]//h2[contains(text(),' Featured ads ')]")
	private
	WebElement FeaturedAds;
	
	@FindBy(xpath="//div[@class=\"col-md-12\"]//h2[contains(text(),' Latest ads ')]")
	private
	WebElement LatestAds;
	
	@FindBy(xpath="//div[@class=\"col-xs-12\"]//h4[contains(text(),' ')]")
	private
	WebElement MainViewedCategories;
	
	@FindBy(xpath="//div[@class=\"categories_link\"]")
	private
	WebElement BrowseByCategory;
	
	
	@FindBy(xpath="//div[@class='newsletter']//div[@class='row']")
	private
	WebElement NewsLetterSection;
	
	@FindBy(xpath="//div[@class='footer']")
	private
	WebElement FooterSection;
	
	@FindBy(xpath="//label[contains(text(),'Popular Search')]")
	private
	WebElement PopularSearch;
	@FindBy(partialLinkText="Automotive")
	private
	WebElement AutomotiveCategoryButton;
	
	@FindBy(xpath= "/html/body/div[2]/section/div/div[3]/div/div/div/div/div/form/div[14]/div/input")
	private
	WebElement AdUpdateButton;
	
	@FindBy(xpath="//a//i[@class='fa fa-bookmark-o']")
	private
	WebElement PostAdButton;
	
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

	public WebElement getPostAdButton() {
		return PostAdButton;
	}

	public void setPostAdButton(WebElement postAdButton) {
		PostAdButton = postAdButton;
	}

	public WebElement getCountrydrpdwn() {
		return countrydrpdwn;
	}

	public void setCountrydrpdwn(WebElement countrydrpdwn) {
		this.countrydrpdwn = countrydrpdwn;
	}

	public WebElement getAboutUsButton() {
		return AboutUsButton;
	}

	public void setAboutUsButton(WebElement aboutUsButton) {
		AboutUsButton = aboutUsButton;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}

	public WebElement getSignUpButton() {
		return SignUpButton;
	}

	public void setSignUpButton(WebElement signUpButton) {
		SignUpButton = signUpButton;
	}

	public WebElement getSearchBar() {
		return SearchBar;
	}

	public void setSearchBar(WebElement searchBar) {
		SearchBar = searchBar;
	}

	public WebElement getLogo() {
		return Logo;
	}

	public void setLogo(WebElement logo) {
		Logo = logo;
	}

	public WebElement getFeaturedAds() {
		return FeaturedAds;
	}

	public void setFeaturedAds(WebElement featuredAds) {
		FeaturedAds = featuredAds;
	}

	public WebElement getLatestAds() {
		return LatestAds;
	}

	public void setLatestAds(WebElement latestAds) {
		LatestAds = latestAds;
	}

	public WebElement getMainViewedCategories() {
		return MainViewedCategories;
	}

	public void setMainViewedCategories(WebElement mainViewedCategories) {
		MainViewedCategories = mainViewedCategories;
	}

	public WebElement getNewsLetterSection() {
		return NewsLetterSection;
	}

	public void setNewsLetterSection(WebElement newsLetterSection) {
		NewsLetterSection = newsLetterSection;
	}

	public WebElement getFooterSection() {
		return FooterSection;
	}

	public void setFooterSection(WebElement footerSection) {
		FooterSection = footerSection;
	}

	public WebElement getPopularSearch() {
		return PopularSearch;
	}

	public void setPopularSearch(WebElement popularSearch) {
		PopularSearch = popularSearch;
	}

	public WebElement getBrowseByCategory() {
		return BrowseByCategory;
	}

	public void setBrowseByCategory(WebElement browseByCategory) {
		BrowseByCategory = browseByCategory;
	}
	
	
	
}
