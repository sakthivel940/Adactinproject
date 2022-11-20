package com.Maven_pro_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_page {
	public static WebDriver driver;

	public Booking_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddres_enter() {
		return addres_enter;
	}

	public WebElement getCard_num() {
		return card_num;
	}

	public WebElement getCard_type() {
		return card_type;
	}

	public WebElement getCard_expmonth_drdwn() {
		return card_expmonth_drdwn;
	}

	public WebElement getCard_expyear_drdwn() {
		return card_expyear_drdwn;
	}

	public WebElement getCcv_num() {
		return ccv_num;
	}

	public WebElement getBooking_btn() {
		return booking_btn;
	}

	private @FindBy(xpath = "//input[@id='first_name']") WebElement first_name;
	private @FindBy(xpath = "//input[@id='last_name']") WebElement last_name;
	private @FindBy(xpath = "//textarea[@id='address']") WebElement addres_enter;
	private @FindBy(xpath = "//input[@id='cc_num']") WebElement card_num;
	private @FindBy(xpath = "//select[@id='cc_type']") WebElement card_type;
	private @FindBy(xpath = "//select[@id='cc_exp_month']") WebElement card_expmonth_drdwn;
	private @FindBy(xpath = "//select[@id='cc_exp_year']") WebElement card_expyear_drdwn;
	private @FindBy(xpath = "//input[@id='cc_cvv']") WebElement ccv_num;
	private @FindBy(xpath = "//input[@id='book_now']") WebElement booking_btn;

}
