package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseFile{

	public Pojo() {
	
		PageFactory.initElements(d, this);
		
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy (id="first_name")
	WebElement firstname;
	
	@FindBy (id="last_name")
	WebElement lastname;
	
	@FindBy (id="address")
	WebElement address;
	
	@FindBy (id="cc_num")
	WebElement credit;
	
	@FindBy (id="cc_type")
	WebElement cardtype;
	
	@FindBy (id="cc_exp_month")
	WebElement expmonth;
	
	@FindBy (id="cc_exp_year")
	WebElement expyear;
	
	@FindBy (id="cc_cvv")
	WebElement cvv;
	
	@FindBy (id="book_now")
	WebElement bookbtn;
	
	@FindBy (id="my_itinerary")
	WebElement myi;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getMyi() {
		return myi;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}
	
	
}
