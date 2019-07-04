package com.Weekly.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Weekly.qa.base.TestBase;

public class WebHomePage extends TestBase{

	//Element Repository WebHome
	
		@FindBy(xpath= "/html/body/div[2]/header/div[2]/div/div/div[4]/div[2]/span")
		private
		WebElement UserTag;
		
		@FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div/div[4]/div[3]/ul/li[1]/a")
		private
		WebElement CurrentAdsButton;
		
		@FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div/div[4]/div[3]/ul/li[2]/a")
		WebElement SavedAdsButton;
		
		@FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div/div[4]/div[3]/ul/li[3]/a")
		WebElement PastAdsButton;

		
		@FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div/div[4]/div[3]/ul/li[4]/a")
		WebElement FavouriteAdsButton;
		
		
		@FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div/div[4]/div[3]/ul/li[9]/a")
		private
		WebElement LogoutButton;
		
		@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/tbody/tr[1]/td[1]/a/img")
		private
		WebElement CurrentAdsImage;
		
		@FindBy(xpath = "/html/body/div[2]/section/div/div/div/div[3]/div/div/div[2]/div/div[2]/div/h4/span")
		private
		WebElement CurrentAdsPostUsername;
		
		@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[1]")
		WebElement PictureTableHeader;
		
	
		
		
		// Initializing the Page Objects:
			public WebHomePage() {
			PageFactory.initElements(driver, this);
	}
			
			public void ClickOnLogoutButton() {
				getUserTag().click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				getLogoutButton().click();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("You've been logged out");
			}
			
			public CurrentAdsPage ClickOnCurrentAdsButton() {
				getUserTag().click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				getCurrentAdsButton().click();
				return new CurrentAdsPage();
			}

			public SavedAdsPage ClickOnSavedAdsButton() {
				getUserTag().click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				SavedAdsButton.click();
				return new SavedAdsPage();
			}
			
			public FavouriteAdsPage ClickOnFavouriteAds() {
				getUserTag().click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				FavouriteAdsButton.click();
				return new FavouriteAdsPage();
			}
			
			public void ClickOnArrow() {
				getUserTag().click();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			public void Login(String email,String password) {
				WebElement LoginButtonElement = (new WebDriverWait(driver, 10))
						  .until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Login")));
				
				LoginButtonElement.click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					driver.findElement(By.id("email")).sendKeys(email);
					WebElement pass = driver.findElement(By.id("password"));
					pass.sendKeys(password);
					pass.submit();
					try {
						Thread.sleep(6000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("You are now logged in");
			}

			public WebElement getCurrentAdsButton() {
				return CurrentAdsButton;
			}

			public void setCurrentAdsButton(WebElement currentAdsButton) {
				CurrentAdsButton = currentAdsButton;
			}

			public WebElement getLogoutButton() {
				return LogoutButton;
			}

			public void setLogoutButton(WebElement logoutButton) {
				LogoutButton = logoutButton;
			}

			public WebElement getCurrentAdsImage() {
				return CurrentAdsImage;
			}

			public void setCurrentAdsImage(WebElement currentAdsImage) {
				CurrentAdsImage = currentAdsImage;
			}

			public WebElement getCurrentAdsPostUsername() {
				return CurrentAdsPostUsername;
			}

			public void setCurrentAdsPostUsername(WebElement currentAdsPostUsername) {
				CurrentAdsPostUsername = currentAdsPostUsername;
			}

			public WebElement getUserTag() {
				return UserTag;
			}

			public void setUserTag(WebElement userTag) {
				UserTag = userTag;
			}

}
