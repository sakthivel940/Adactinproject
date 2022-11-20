package com.Maven_pro;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.Maven_pro_pattern.Others_singleton_class;
import manger.Page_object_manager;

public class Test_class {
	public static WebDriver driver;
	public static Page_object_manager obj;

	@Test
	private void browser_launch() {
		driver = Base_class.browse_selct("chrome");
		obj = new Page_object_manager(driver);
	}

	@Test(dependsOnMethods = "browser_launch", description = "url susscefully lauched")
	private void url() {
		Base_class.get_url("https://adactinhotelapp.com/");
		Base_class.get_maximum();
	}

	@Test(priority = 1, dependsOnMethods = "url")
	private void login() throws IOException {
		Base_class.send_keys(obj.getLogin_page().getUsername(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_username());
		Base_class.send_keys(obj.getLogin_page().getPassword(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_password());
		Base_class.click_meth(obj.getLogin_page().getLogin_btn());
	}

	@Test(priority = 2)
	private void search_hotel() throws IOException {
		Base_class.dr_down(obj.getSearch_hotel().getLocation_dr_dwn(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_location());
		Base_class.dr_down(obj.getSearch_hotel().getHotal_name_drdwn(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_hotel_name());
		Base_class.dr_down(obj.getSearch_hotel().getRoom_type_drdwn(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_roomtype());
		Base_class.dr_down(obj.getSearch_hotel().getNum_of_room(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_no_of_room());
		Base_class.send_keys(obj.getSearch_hotel().getCheck_in_date(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_chekin_date());
		Base_class.send_keys(obj.getSearch_hotel().getCheck_out_date(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_checkout_date());
		Base_class.dr_down(obj.getSearch_hotel().getAdult_per_room(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_adult_count());
		Base_class.dr_down(obj.getSearch_hotel().getChild_per_adult(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_child_count());
		Base_class.click_meth(obj.getSearch_hotel().getSearch_btn());
	}

	@Test(dependsOnMethods = "search_hotel")
	private void select_conti() {
		Base_class.click_meth(obj.getHotel_web_table().getRadi_box());
		Base_class.click_meth(obj.getHotel_web_table().getConti_btn());
	}

	@Test(priority = 3)
	private void booking_process() throws IOException {
		Base_class.send_keys(obj.getBooking_page().getFirst_name(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_first_name());
		Base_class.send_keys(obj.getBooking_page().getLast_name(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_lastname());
		Base_class.send_keys(obj.getBooking_page().getAddres_enter(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_address());
	}

	@Test(dependsOnMethods = "booking_process")
	private void enter_bank_details() throws IOException {
		Base_class.send_keys(obj.getBooking_page().getCard_num(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_cartdnum());
		Base_class.dr_down(obj.getBooking_page().getCard_type(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_card_type());
		Base_class.dr_down(obj.getBooking_page().getCard_expmonth_drdwn(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_card_exp_month());
		Base_class.dr_down(obj.getBooking_page().getCard_expyear_drdwn(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_card_expyear());
		Base_class.send_keys(obj.getBooking_page().getCcv_num(),
				Others_singleton_class.get_sing_obj().get_property_obj().get_cvv_num());
		String getattribute = Base_class.getattribute(obj.getBooking_page().getCard_num(), "value");
		Pattern p = Pattern.compile("[0-9]{16}");
		Matcher m = p.matcher(getattribute);
		if (m.find()) {
			Base_class.click_meth(obj.getBooking_page().getBooking_btn());
		}
	}

	@Test(priority = 4)
	private void confirn_book() {
		Base_class.implicit_time_wait(2000);
		Base_class.click_meth(obj.getConfirm_page().getMy_iltinery_list());
		Base_class.click_meth(obj.getBook_page().getCheck_box());
		Base_class.click_meth(obj.getBook_page().getlogout_btn());
	}

}
