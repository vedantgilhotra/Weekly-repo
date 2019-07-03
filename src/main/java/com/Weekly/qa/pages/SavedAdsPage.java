package com.Weekly.qa.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.Weekly.qa.base.TestBase;

public class SavedAdsPage extends TestBase{

	
	@FindBy(xpath="//i[@class=\"fa fa-download\"]")
	private
	WebElement SavedAdsButton;
	
	@FindBy(xpath="//table//tbody//tr[1]//td[7]//i[@class='fa fa-pencil-square-o']")
	private
	WebElement EditButton;
	
	@FindBy(xpath="//table//tbody//tr[1]//td[7]//button[@class='btn btn-danger btn-sm']")
	private
	WebElement DeleteButton;
	
	
	public SavedAdsPage()
		{
		PageFactory.initElements(driver, this);
		}

	public WebElement getSavedAdsButton() {
		return SavedAdsButton;
	}

	public void setSavedAdsButton(WebElement savedAdsButton) {
		SavedAdsButton = savedAdsButton;
	}

	public String GetTitle()
	{
	return	driver.getTitle();
	}

	public WebElement getEditButton() {
		return EditButton;
	}

	public void setEditButton(WebElement editButton) {
		EditButton = editButton;
	}

	public WebElement getDeleteButton() {
		return DeleteButton;
	}

	public void setDeleteButton(WebElement deleteButton) {
		DeleteButton = deleteButton;
	}

	
	
}
