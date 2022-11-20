package com.Maven_pro_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Web_tablepage {
	public static WebDriver driver;

	public Hotel_Web_tablepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadi_box() {
		return radi_box;
	}

	public WebElement getConti_btn() {
		return conti_btn;
	}

	private @FindBy(xpath = "//input[@id='radiobutton_0']") WebElement radi_box;

	private @FindBy(xpath = "//input[@id='continue']") WebElement conti_btn;

}
