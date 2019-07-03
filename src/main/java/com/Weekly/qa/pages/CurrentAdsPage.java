package com.Weekly.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Weekly.qa.base.TestBase;

public class CurrentAdsPage extends TestBase{

//Element Repository
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/tbody/tr[1]/td[1]/a/img")
	private
	WebElement CurrentAdsImage;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div/div/div[3]/div/div/div[2]/div/div[2]/div/h4/span")
	private
	WebElement CurrentAdsPostUsername;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[1]")
	private
	WebElement PictureTableHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[2]")
	private
	WebElement CategoryTableHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[3]")
	private
	WebElement SubcategoryTableHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[4]")
	private
	WebElement TitleTableHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[5]")
	private
	WebElement RatingTableHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[6]")
	private
	WebElement StatusTableHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[7]")
	private
	WebElement PostedDateTableHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/thead/tr/th[8]")
	private
	WebElement ActionsTableHeader;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/tbody/tr[1]/td[6]")
	private
	WebElement StatusEntry;
	
	/*@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/tbody/tr[1]/td[8]/a/i")
	private
	WebElement EditButton; */
	
	@FindBy(css = "	html body div.page_wrap section div.page_section div.page_section div.wapperdiv"
			+ " div.container div.row div.col-xs-12 div.right_customer_detail table.table tbody tr td a i.fa.fa-pencil-square-o")
	private
	WebElement EditButton; 
	

	@FindBy(id= "category_id")
	private
	WebElement CategoryUpdateAd;
	
	@FindBy(name = "sub_category_id")
	private
	WebElement SubcategoryUpdateAd;
	
	@FindBy(xpath= "/html/body/div[2]/section/div/div[3]/div/div/div/div/div/form/div[14]/div/input")
	private
	WebElement AdUpdateButton;
	
	
	@FindBy(id="description")
	WebElement DescriptionAdUpdate;
	
	@FindBy(id="title")
	private
	WebElement TitleAdUpdate;
	
	@FindBy(id="country")
	WebElement CountryAdUpdate;
	
	@FindBy(id="state")
	WebElement StateAdUpdate;
	
	@FindBy(id="city")
	WebElement CityAdUpdate;
	
	@FindBy(id="address")
	private
	WebElement AddressAdUpdate;
	
	@FindBy(id = "price")
	private
	WebElement PriceAdUpdate;
	
	@FindBy(xpath = "/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/table/tbody/tr[1]/td[8]/form/button/i")
	private
	WebElement DeleteAdButton;
	
	@FindBy(css = "html body div.page_wrap section div.page_section div.page_section div.wapperdiv "
			+"div.container div.row div.col-xs-12 div.right_customer_detail table.table tbody tr td")
	private
	WebElement TitleEntry;
	
	@FindBy(id= "status_dropdown")
	private
	WebElement StatusAdUpdate;
	
	@FindBy(xpath = "/html/body/div[2]/header/div[2]/div/div/div[4]/div[3]/ul/li[3]/a")
	WebElement PastAdsButton;
	
	@FindBy(xpath="/html/body/div[2]/section/div/div[1]/div[3]/div/div/div/div/div[2]/ul/li[2]/span")
	private
	WebElement pagination;
	
	@FindBy(css="html body div.page_wrap section div.page_section div.page_section div.wapperdiv div.container "
			+ "div.row div.col-xs-12 div.right_customer_detail"
			+ " div.search-pagination ul.pagination li.page-item a.page-link")
	private
			WebElement pagination2;
	
	@FindBy(xpath = "//table[@class='table']/tbody/tr")
	private
	WebElement CurrentAdsTable;
	
	@FindBy(xpath="/html/body/div[5]/div/div[2]/div[2]/button")
	private
	WebElement DeleteAdYes;
	
	@FindBy(xpath="/html/body/div[2]/section/div/div[1]/div[3]/div")
	private
	WebElement AdDeleted;
	
	
	@FindBy(css="html body div.page_wrap section div.page_section div.page_section div.wapperdiv"
			+ " div.container div.row div.col-xs-12 div.right_customer_detail table.table tbody tr td")
	private
	WebElement PostedDateEntry;
	
	public CurrentAdsPage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDescriptionAdUpdate() {
		return DescriptionAdUpdate;
	}
	
	public WebElement getCurrentAdsImage() {
		// TODO Auto-generated method stub
		return CurrentAdsImage;
	}

	public WebElement getCurrentAdsPostUsername() {
		// TODO Auto-generated method stub
		return CurrentAdsPostUsername;
	}

	public WebElement getPictureTableHeader() {
		return PictureTableHeader;
	}

	public void setPictureTableHeader(WebElement pictureTableHeader) {
		PictureTableHeader = pictureTableHeader;
	}

	public WebElement getCategoryTableHeader() {
		return CategoryTableHeader;
	}

	public void setCategoryTableHeader(WebElement categoryTableHeader) {
		CategoryTableHeader = categoryTableHeader;
	}

	public WebElement getSubcategoryTableHeader() {
		return SubcategoryTableHeader;
	}

	public void setSubcategoryTableHeader(WebElement subcategoryTableHeader) {
		SubcategoryTableHeader = subcategoryTableHeader;
	}

	public WebElement getTitleTableHeader() {
		return TitleTableHeader;
	}

	public void setTitleTableHeader(WebElement titleTableHeader) {
		TitleTableHeader = titleTableHeader;
	}

	public WebElement getStatusTableHeader() {
		return StatusTableHeader;
	}

	public void setStatusTableHeader(WebElement statusTableHeader) {
		StatusTableHeader = statusTableHeader;
	}

	public WebElement getPostedDateTableHeader() {
		return PostedDateTableHeader;
	}

	public void setPostedDateTableHeader(WebElement postedDateTableHeader) {
		PostedDateTableHeader = postedDateTableHeader;
	}

	public WebElement getActionsTableHeader() {
		return ActionsTableHeader;
	}

	public void setActionsTableHeader(WebElement actionsTableHeader) {
		ActionsTableHeader = actionsTableHeader;
	}

	public WebElement getStatusEntry() {
		return StatusEntry;
	}

	public void setStatusEntry(WebElement statusEntry) {
		StatusEntry = statusEntry;
	}

	public WebElement getEditButton() {
		return EditButton;
	}

	public void setEditButton(WebElement editButton) {
		EditButton = editButton;
	}

	public WebElement getCategoryUpdateAd() {
		return CategoryUpdateAd;
	}

	public void setCategoryUpdateAd(WebElement categoryUpdateAd) {
		CategoryUpdateAd = categoryUpdateAd;
	}

	public WebElement getSubcategoryUpdateAd() {
		return SubcategoryUpdateAd;
	}

	public void setSubcategoryUpdateAd(WebElement subcategoryUpdateAd) {
		SubcategoryUpdateAd = subcategoryUpdateAd;
	}

	public WebElement getAdUpdateButton() {
		return AdUpdateButton;
	}

	public void setAdUpdateButton(WebElement adUpdateButton) {
		AdUpdateButton = adUpdateButton;
	}

	public WebElement getTitleAdUpdate() {
		return TitleAdUpdate;
	}

	public void setTitleAdUpdate(WebElement titleAdUpdate) {
		TitleAdUpdate = titleAdUpdate;
	}

	public WebElement getAddressAdUpdate() {
		return AddressAdUpdate;
	}

	public void setAddressAdUpdate(WebElement addressAdUpdate) {
		AddressAdUpdate = addressAdUpdate;
	}

	public WebElement getPriceAdUpdate() {
		return PriceAdUpdate;
	}

	public void setPriceAdUpdate(WebElement priceAdUpdate) {
		PriceAdUpdate = priceAdUpdate;
	}

	public WebElement getDeleteAdButton() {
		return DeleteAdButton;
	}

	public void setDeleteAdButton(WebElement deleteAdButton) {
		DeleteAdButton = deleteAdButton;
	}

	public WebElement getTitleEntry() {
		return TitleEntry;
	}

	public void setTitleEntry(WebElement titleEntry) {
		TitleEntry = titleEntry;
	}

	public WebElement getStatusAdUpdate() {
		return StatusAdUpdate;
	}

	public void setStatusAdUpdate(WebElement statusAdUpdate) {
		StatusAdUpdate = statusAdUpdate;
	}

	public WebElement getRatingTableHeader() {
		return RatingTableHeader;
	}

	public void setRatingTableHeader(WebElement ratingTableHeader) {
		RatingTableHeader = ratingTableHeader;
	}

	public WebElement getPagination() {
		return pagination;
	}

	public void setPagination(WebElement pagination) {
		this.pagination = pagination;
	}

	public WebElement getCurrentAdsTable() {
		return CurrentAdsTable;
	}

	public void setCurrentAdsTable(WebElement currentAdsTable) {
		CurrentAdsTable = currentAdsTable;
	}

	public WebElement getPagination2() {
		return pagination2;
	}

	public void setPagination2(WebElement pagination2) {
		this.pagination2 = pagination2;
	}

	public WebElement getDeleteAdYes() {
		return DeleteAdYes;
	}

	public void setDeleteAdYes(WebElement deleteAdYes) {
		DeleteAdYes = deleteAdYes;
	}

	public WebElement getPostedDateEntry() {
		return PostedDateEntry;
	}

	public void setPostedDateEntry(WebElement postedDateEntry) {
		PostedDateEntry = postedDateEntry;
	}
	
	public void DeleteAd() {
		DeleteAdButton.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DeleteAdYes.click();
		
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public int TableRowCount() {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		int n=rows.size();
		System.out.println("number of rows on screen are" + n);
		return n;
	}

	public WebElement getAdDeleted() {
		return AdDeleted;
	}

	public void setAdDeleted(WebElement adDeleted) {
		AdDeleted = adDeleted;
	}
}
