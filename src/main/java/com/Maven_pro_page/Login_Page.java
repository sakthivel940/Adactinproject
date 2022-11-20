package com.Maven_pro_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	private @FindBy(xpath = "//input[@id='username']") WebElement username;

	private @FindBy(xpath = "//input[@id='password']") WebElement password;

	private @FindBy(xpath = "//input[@id='login']") WebElement login_btn;

	private @FindBy(xpath = "//a[.='New User Register Here']") WebElement new_user_register_btn;

	private @FindBy(xpath = "//a[.='Forgot Password?']") WebElement forget_pass_btn;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public WebElement getNew_user_register_btn() {
		return new_user_register_btn;
	}

	public WebElement getForget_pass_btn() {
		return forget_pass_btn;
	}

}
