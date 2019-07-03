package com.Weekly.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Weekly.qa.base.TestBase;

public class PastAdsPage extends TestBase{

	WebHomePage webHomePage = new WebHomePage();
	
	//Object repository
	
	/*@FindBy(css= "html body div.page_wrap section div.page_section div.page_section "
			+ "div.wapperdiv div.container div.row div.col-xs-12 div.right_customer_detail table.table tbody tr td")
	private
	WebElement StatusEntry;	*/
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[5]")
	private
	WebElement StatusEntry;
			
	@FindBy(xpath ="/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/tbody/tr[1]/td[1]/a/img")
	private
	WebElement ImageEntry;
	
	@FindBy(xpath="/html/body/div[2]/section/div/div/div/div[3]/div/div/div[2]/div/div[2]/div/h4/span")
	private
	WebElement PastAdsPostUsername;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[1]")
	private
	WebElement TablePictureHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[2]")
	private
	WebElement TableCategoryHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[3]")
	private
	WebElement TableSubCategoryheader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[4]")
	private
	WebElement TableTitleHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[5]")
	private
	WebElement TableStatusHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[6]")
	private
	WebElement TablePostedDateHeader;
	
	/*@FindBy(xpath="/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/tbody/tr[1]/td[7]/a/i")
	private
	WebElement EditButton;*/
	
	@FindBy(css = "html body div.page_wrap section div.page_section div.page_section "
			+ "div.wapperdiv div.container div.row div.col-xs-12 div.right_customer_detail table.table tbody tr td a i.fa.fa-pencil-square-o")
	private
	WebElement EditButton;
	
	@FindBy(xpath="/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/tbody/tr[1]/td[7]/form/button/i")
	private
	WebElement DeleteButton;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[7]")
	WebElement TableActionsHeader;
	
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/div[2]/ul/li[2]/span")
	private
	WebElement Pagination1;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/div[2]/ul/li[3]/a")
	private
	WebElement Pagination2;
	
	@FindBy(xpath= "/html/body/div[5]/div/div[2]/div[2]/button")
	private
	WebElement DeleteYes;
	
	
	
	public PastAdsPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getStatusEntry() {
		return StatusEntry;
	}

	public void setStatusEntry(WebElement statusEntry) {
		StatusEntry = statusEntry;
	}
	
	public int TableRowCount() {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		int n=rows.size();
		System.out.println("number of rows on screen are" + n);
		return n;
	}
	
	public String GetTitle()
	{
		return driver.getTitle();
	}
	
	public void ClickOnPastAds()
	{
		webHomePage.ClickOnArrow();
		webHomePage.PastAdsButton.click();
		
	}

	public WebElement getImageEntry() {
		return ImageEntry;
	}

	public void setImageEntry(WebElement imageEntry) {
		ImageEntry = imageEntry;
	}

	public WebElement getPastAdsPostUsername() {
		return PastAdsPostUsername;
	}

	public void setPastAdsPostUsername(WebElement pastAdsPostUsername) {
		PastAdsPostUsername = pastAdsPostUsername;
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

	public WebElement getTableSubCategoryheader() {
		return TableSubCategoryheader;
	}

	public void setTableSubCategoryheader(WebElement tableSubCategoryheader) {
		TableSubCategoryheader = tableSubCategoryheader;
	}

	public WebElement getTableTitleHeader() {
		return TableTitleHeader;
	}

	public void setTableTitleHeader(WebElement tableTitleHeader) {
		TableTitleHeader = tableTitleHeader;
	}

	public WebElement getTableStatusHeader() {
		return TableStatusHeader;
	}

	public void setTableStatusHeader(WebElement tableStatusHeader) {
		TableStatusHeader = tableStatusHeader;
	}

	public WebElement getTablePostedDateHeader() {
		return TablePostedDateHeader;
	}

	public void setTablePostedDateHeader(WebElement tablePostedDateHeader) {
		TablePostedDateHeader = tablePostedDateHeader;
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

	public WebElement getDeleteYes() {
		return DeleteYes;
	}

	public void setDeleteYes(WebElement deleteYes) {
		DeleteYes = deleteYes;
	}

	
	
}
