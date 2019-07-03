package com.Weekly.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import com.Weekly.qa.base.TestBase;

public class FavouriteAdsPage extends TestBase{

	
	//object repository
	
	
	@FindBy(xpath="//table//th[1]")
	private
	WebElement TablePictureHeader;
	
	@FindBy(xpath="//table//th[2]")
	private
	WebElement TableCategoryHeader;
	
	@FindBy(xpath="//table//th[3]")
	private
	WebElement TableSubCategoryHeader;

	@FindBy(xpath="//table//th[4]")
	private
	WebElement TableTitleHeader;
	
	@FindBy(xpath="//table//th[5]")
	private
	WebElement TablePostedDateHeader;
	
	@FindBy(xpath="//table//tbody//tr[1]//td[6]//i[@class='fa fa-times']")
	private
	WebElement DeleteButton;
	
	@FindBy(xpath="//button[@class='swal-button swal-button--confirm']")
	private
	WebElement DeleteYesButton;
	
	@FindBy(xpath="//table//th[6]")
	WebElement TableActionHeader;
	
	@FindBy(xpath="//table//tbody//tr//td[1]//a")
	WebElement ImageEntry;
	
	@FindBy(xpath="//table//tbody//tr//td[4][text()]")
	private
	WebElement TitleEntry;
	
	@FindBy(xpath="//span[@class=\"page-link\" and text()=1]")
	private
	WebElement Pagination1;
	
	@FindBy(xpath="//a[@class=\"page-link\" and text()=2]")
	private
	WebElement Pagination2;

	@FindBy(xpath="/html/body/div[2]/section/div[1]/div[3]/div/div/div/div[2]/div[1]/div/div[1]/div/div[2]/h4/a")
	private
	WebElement CategoryAdTitle;
	
	@FindBy(partialLinkText="Categories")
	WebElement CategoriesButton;

public FavouriteAdsPage()
{
	PageFactory.initElements(driver, this);
}

public WebElement getTitleEntry() {
	return TitleEntry;
}

public void setTitleEntry(WebElement titleEntry) {
	TitleEntry = titleEntry;
}

public WebElement getCategoryAdTitle() {
	return CategoryAdTitle;
}

public void setCategoryAdTitle(WebElement categoryAdTitle) {
	CategoryAdTitle = categoryAdTitle;
}

public WebElement getTablePictureHeader() {
	return TablePictureHeader;
}

public void setTablePictureHeader(WebElement tablePictureHeader) {
	TablePictureHeader = tablePictureHeader;
}

public WebElement getTableCategoryHeader() {
	return TableCategoryHeader;
}

public void setTableCategoryHeader(WebElement tableCategoryHeader) {
	TableCategoryHeader = tableCategoryHeader;
}

public WebElement getTableSubCategoryHeader() {
	return TableSubCategoryHeader;
}

public void setTableSubCategoryHeader(WebElement tableSubCategoryHeader) {
	TableSubCategoryHeader = tableSubCategoryHeader;
}

public WebElement getTableTitleHeader() {
	return TableTitleHeader;
}

public void setTableTitleHeader(WebElement tableTitleHeader) {
	TableTitleHeader = tableTitleHeader;
}

public WebElement getTablePostedDateHeader() {
	return TablePostedDateHeader;
}

public void setTablePostedDateHeader(WebElement tablePostedDateHeader) {
	TablePostedDateHeader = tablePostedDateHeader;
}

public WebElement getDeleteButton() {
	return DeleteButton;
}

public void setDeleteButton(WebElement deleteButton) {
	DeleteButton = deleteButton;
}

public WebElement getDeleteYesButton() {
	return DeleteYesButton;
}

public void setDeleteYesButton(WebElement deleteYesButton) {
	DeleteYesButton = deleteYesButton;
}

public WebElement getPagination1() {
	return Pagination1;
}

public void setPagination1(WebElement pagination1) {
	Pagination1 = pagination1;
}

public WebElement getPagination2() {
	return Pagination2;
}

public void setPagination2(WebElement pagination2) {
	Pagination2 = pagination2;
}


}
