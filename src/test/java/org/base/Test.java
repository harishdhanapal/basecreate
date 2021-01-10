package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Test extends BaseFile   {

	public Test() {
	
		
		PageFactory.initElements(d, this);
		
		
	}
	
	
	@FindBy(id="username")
	private WebElement username;
	
	
	@FindBy (id="password")
	private WebElement password;
	
	@FindBy (id="login")
	private WebElement logbtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}

	
	
	@FindBy (id="location")
	WebElement location;

	@FindBy (xpath="//select[@name='hotels']")
	WebElement hotel;
	
	@FindBy (id="room_type")
	WebElement roomtype;
	
	@FindBy (id="room_nos")
	WebElement numofroom;
	
	@FindBy (id="datepick_in")
	WebElement checkin;
	
	@FindBy (id="datepick_out")
	WebElement checkout;
	
	@FindBy (id="adult_room")
	WebElement adperroom;
	
	@FindBy (id="child_room")
	WebElement childperroom;
	
	@FindBy (id="Submit")
	WebElement searchbtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumofroom() {
		return numofroom;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdperroom() {
		return adperroom;
	}

	public WebElement getChildperroom() {
		return childperroom;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	@FindBy (id="radiobutton_0")
	WebElement radiobtn;
	
	@FindBy (id="continue")
	WebElement contbtn;

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContbtn() {
		return contbtn;
	}
	
	
	
	
	
	
	
	
	
}
