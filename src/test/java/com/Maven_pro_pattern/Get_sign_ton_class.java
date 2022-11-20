package com.Maven_pro_pattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Get_sign_ton_class {

	public Properties p;

	public Get_sign_ton_class() throws IOException {

		File fie = new File("D:\\new project in java\\Maven_pro\\Data.properties");
		FileInputStream finput = new FileInputStream(fie);
		p = new Properties();
		p.load(finput);

	}

	public String get_username() {

		String value = p.getProperty("username");

		return value;
	}

	public String get_password() {

		String value = p.getProperty("password");

		return value;
	}

	public String get_hotel_name() {

		String value = p.getProperty("hotel");

		return value;
	}

	public String get_roomtype() {

		String value = p.getProperty("roomtype");

		return value;
	}

	public String get_location() {

		String value = p.getProperty("location");

		return value;
	}

	public String get_no_of_room() {

		String value = p.getProperty("no_of_room");

		return value;
	}

	public String get_chekin_date() {

		String value = p.getProperty("check_in_date");

		return value;
	}

	public String get_checkout_date() {

		String value = p.getProperty("check_out_date");

		return value;
	}

	public String get_adult_count() {

		String value = p.getProperty("adult");

		return value;
	}
	
	public String get_child_count() {

		String value = p.getProperty("child");

		return value;
	}
	
	
	

	public String get_first_name() {

		String value = p.getProperty("firstname");

		return value;
	}

	public String get_lastname() {

		String value = p.getProperty("lastname");

		return value;
	}

	public String get_cartdnum() {

		String value = p.getProperty("cardnum");

		return value;
	}

	public String get_cvv_num() {

		String value = p.getProperty("cvvnum");

		return value;
	}

	public String get_address() {

		String value = p.getProperty("address");

		return value;
	}
	
	public String get_card_type() {

		String value = p.getProperty("cardtype");

		return value;
	}
	public String get_card_exp_month() {

		String value = p.getProperty("exp_card_month");

		return value;
	}public String get_card_expyear() {

		String value = p.getProperty("exp_card_year");

		return value;
	}
}
