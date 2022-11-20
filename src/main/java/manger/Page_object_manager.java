package manger;

import org.openqa.selenium.WebDriver;

import com.Maven_pro_page.Book_iteam_page;
import com.Maven_pro_page.Booking_page;
import com.Maven_pro_page.Confirmatin_page;
import com.Maven_pro_page.Hotel_Web_tablepage;
import com.Maven_pro_page.Login_Page;
import com.Maven_pro_page.Search_hotel;

public class Page_object_manager {
	public static WebDriver driver;
	private Book_iteam_page book_page;
	private Booking_page booking_page;
	private Confirmatin_page confirm_page;
	private Hotel_Web_tablepage hotel_web_table;
	private Login_Page login_page;
	private Search_hotel search_hotel;
	public Book_iteam_page getBook_page() {
		if (book_page == null) {
			book_page = new Book_iteam_page(driver);
		}
		return book_page;
	}
	public Booking_page getBooking_page() {
		if (booking_page == null) {
			booking_page = new Booking_page(driver);
		}
		return booking_page;
	}
	public Confirmatin_page getConfirm_page() {
		if (confirm_page == null) {
			confirm_page = new Confirmatin_page(driver);
		}
		return confirm_page;
	}
	public Hotel_Web_tablepage getHotel_web_table() {
		if (hotel_web_table == null) {
			hotel_web_table = new Hotel_Web_tablepage(driver);
		}
		return hotel_web_table;
	}
	public Login_Page getLogin_page() {
		if (login_page == null) {
			login_page = new Login_Page(driver);
		}
		return login_page;
	}
	public Search_hotel getSearch_hotel() {
		if (search_hotel == null) {
			search_hotel = new Search_hotel(driver);
		}
		return search_hotel;
	}

	public Page_object_manager(WebDriver driver) {
		this.driver = driver;
	}

}
