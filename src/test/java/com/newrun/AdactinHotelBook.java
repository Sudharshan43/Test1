package com.newrun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotelBook {

	WebDriver driver;

	@Given("^user is open Adactin Page$")
	public void user_is_open_Adactin_Page() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://adactinhotelapp.com/");

	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Exception {
		driver.findElement(By.id("username")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
	}

	@When("^user should click the login button$")
	public void user_should_click_the_login_button() throws Exception {
		driver.findElement(By.id("login")).click();

	}

	@Then("^user select the location and enter Check In date and Check Out date and click Search$")
	public void user_select_the_location_and_enter_Check_In_date_and_Check_Out_date_and_click_Search()
			throws Exception {

		driver.findElement(By.id("location")).sendKeys("Paris");
		driver.findElement(By.id("datepick_in")).sendKeys("01/02/2022");
		driver.findElement(By.id("datepick_out")).sendKeys("02/02/2022");
		driver.findElement(By.id("Submit")).click();
	}

	@Then("^user select the hotel and click continue$")
	public void user_select_the_hotel_and_click_continue() throws Exception {
		driver.findElement(By.id("radiobutton_1")).click();
		driver.findElement(By.id("continue")).click();
	}

	@Then("^type the the name and address and book the Hotel$")
	public void type_the_the_name_and_address_and_book_the_Hotel() throws Exception {
		driver.findElement(By.id("first_name")).sendKeys("Prem");
		driver.findElement(By.id("last_name")).sendKeys("Kumar");
		driver.findElement(By.id("address")).sendKeys("TamilNadu,India");
		driver.findElement(By.id("cc_num")).sendKeys("4545454564646464");
		driver.findElement(By.id("cc_type")).sendKeys("VISA");
		driver.findElement(By.id("cc_exp_month")).sendKeys("May");
		driver.findElement(By.id("cc_exp_year")).sendKeys("2025");
		driver.findElement(By.id("cc_cvv")).sendKeys("007");

	}

	@Then("^user check get order id or not$")
	public void user_check_get_order_id_or_not() throws Exception {
		driver.findElement(By.id("book_now")).click();
		String text = driver.findElement(By.id("order_no")).getText();
		System.out.println(text);
		driver.quit();

	}

}
