package com.Maven_pro_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmatin_page {
	public static WebDriver driver;
	private @FindBy(xpath = "//input[@id='my_itinerary']")WebElement my_iltinery_list;
	
	public WebElement getMy_iltinery_list() {
		return my_iltinery_list;
	}

	public Confirmatin_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
