package com.Maven_pro_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {

	public static WebDriver driver;

	private @FindBy(xpath = "//select[@id='location']") WebElement location_dr_dwn;
	private @FindBy(xpath = "//select[@id='hotels']") WebElement hotal_name_drdwn;
	private @FindBy(xpath = "//select[@id='room_type']") WebElement room_type_drdwn;
	private @FindBy(xpath = "//select[@id='room_nos']") WebElement num_of_room;
	private @FindBy(xpath = "//input[@id='datepick_in']") WebElement check_in_date;
	private @FindBy(xpath = "//input[@id='datepick_out']") WebElement check_out_date;
	private @FindBy(xpath = "//select[@id='adult_room']") WebElement adult_per_room;
	private @FindBy(xpath = "//select[@id='child_room']") WebElement child_per_adult;
	private @FindBy(xpath = "//input[@id='Submit']") WebElement search_btn;

	public Search_hotel(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLocation_dr_dwn() {
		return location_dr_dwn;
	}

	public WebElement getHotal_name_drdwn() {
		return hotal_name_drdwn;
	}

	public WebElement getRoom_type_drdwn() {
		return room_type_drdwn;
	}

	public WebElement getNum_of_room() {
		return num_of_room;
	}

	public WebElement getCheck_in_date() {
		return check_in_date;
	}

	public WebElement getCheck_out_date() {
		return check_out_date;
	}

	public WebElement getAdult_per_room() {
		return adult_per_room;
	}

	public WebElement getChild_per_adult() {
		return child_per_adult;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

}
