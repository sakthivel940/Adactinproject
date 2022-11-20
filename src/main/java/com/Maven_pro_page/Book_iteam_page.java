package com.Maven_pro_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_iteam_page {

	public static WebDriver driver;

	private @FindBy(xpath = "//input[@type='checkbox']") WebElement search_hotel_btn;
	private @FindBy(xpath = "//input[@id='logout']") WebElement logout_btn;

	public WebElement getSearch_hotel_btn() {
		return search_hotel_btn;
	}

	public WebElement getCheck_box() {
		return check_box;
	}

	public WebElement getlogout_btn() {
		
		return logout_btn;
	}
	private @FindBy(xpath = "//input[@id='order_id_text']") WebElement check_box;

	public Book_iteam_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
