package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ExcelModel extends BaseFile {

	
//	private static final String  = null;
//
//	public static void main(String[] args) throws IOException, AWTException {
//		
//		launchBrowser();
//		url("http://adactinhotelapp.com/");
//		timeDelay();
//		
//		WebElement f1 = d.findElement(By.id("username"));
//		
//		script(f1);
//		
//		WebElement f = d.findElement(By.id("password"));
//		sendKeys(f, file(1, 1));
//		
//		WebElement f2 = d.findElement(By.id("login"));
//		
//		mouseClick(f2);
//		
//		WebElement f3 = d.findElement(By.id("location"));
//		dropDownSelectByIndex(f3,7 );
//		
//		WebElement f4 = d.findElement(By.id("hotels"));
//		dropDownSelectByValue(f4,"Hotel Sunshine");
//		
//		WebElement f5 = d.findElement(By.id("room_type"));
//		dropDownSelectByVisibleText(f5,"Double");
//		
//		WebElement f6 = d.findElement(By.id("room_nos"));
//		dropDownSelectByIndex(f6,6);
//		
//		
//		
//		
//		
//		WebElement f7 = d.findElement(By.id("datepick_in"));
//		mouseClick(f7);
//		robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
//		
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		
//		
//		sendKeys(f7, file(1, 2));
//	
//		WebElement f8 = d.findElement(By.id("datepick_out"));
//		mouseClick(f8);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_A);
//		
//		r.keyPress(KeyEvent.VK_BACK_SPACE);
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//		
//		
//		
//		sendKeys(f8, file(1, 3));
//		
//		WebElement f9 = d.findElement(By.id("adult_room"));
//		dropDownSelectByValue(f9,"3" );
//		
//		WebElement f10 = d.findElement(By.id("child_room"));
//		dropDownSelectByVisibleText(f10,"2 - Two");
//		
//		d.findElement(By.id("Submit")).click();
//		
//		d.findElement(By.id("radiobutton_0")).click();
//		d.findElement(By.id("continue")).click();
//		
//		WebElement f11 = d.findElement(By.id("first_name"));
//		sendKeys(f11, file(1, 4));
//		
//		WebElement f12 = d.findElement(By.id("last_name"));
//		sendKeys(f12,file(1, 5));
//		
//		WebElement f13 = d.findElement(By.id("address"));
//		sendKeys(f13,file(1, 6));
//		
//		WebElement f14 = d.findElement(By.id("cc_num"));
//		sendKeys(f14,file(3, 0));
//		
//		WebElement f15 = d.findElement(By.id("cc_cvv"));
//		sendKeys(f15, file(3, 1));
//		
//		
//		
//		
//		WebElement f16 = d.findElement(By.id("cc_type"));
//		dropDownSelectByIndex(f16,2 );
//		
//		WebElement f17 = d.findElement(By.id("cc_exp_month"));
//		dropDownSelectByVisibleText(f17,"April");
//		
//		WebElement f18 = d.findElement(By.id("cc_exp_year"));
//		dropDownSelectByValue(f18,"2022");
//		
//		d.findElement(By.id("book_now")).click();
//		d.findElement(By.id("my_itinerary")).click();
//		
//		WebElement f19 = d.findElement(By.id("order_id_387906"));
//		
//		
//  String s = Return(f19);
//		
//  System.out.println(s);
//		
//		fileout(10, 10, s);
//		
//		createExcel(2, 2, "dada");
//		
//		
//		
		
	
//	public static void main(String[] args) throws IOException, AWTException {
//		
//		launchBrowser();
//		url("http://www.adactin.com/HotelApp/");
//		timeDelay();
//		Test t=new Test();
//		String f = file(1, 0);
		
//		WebElement username = t.getUsername();
//		sendKeys(username,f );
//		
//		String f2 = file(1, 1);
//		WebElement password = t.getPassword();
//		sendKeys(password, f2);
//		
//		t.getLogbtn().click();
//		
//		dropDownSelectByIndex(t.location, 4);
//		dropDownSelectByValue(t.hotel,"Hotel Cornice");
//		dropDownSelectByVisibleText(t.roomtype,"Super Deluxe");
//		
//		dropDownSelectByIndex(t.numofroom, 10);
//		
//		Robot r=new Robot();
//		
//		mouseClick(t.checkin);
//		
//r.keyPress(KeyEvent.VK_CONTROL);
//r.keyPress(KeyEvent.VK_A);
//r.keyRelease(KeyEvent.VK_CONTROL);
//r.keyRelease(KeyEvent.VK_A);
//		
//	r.keyPress(KeyEvent.VK_BACK_SPACE);	
//	r.keyRelease(KeyEvent.VK_BACK_SPACE);	
//		
//		
//	String f3 = file(1, 2);
//	
//	sendKeys(t.checkin, f3);
//	
//	mouseClick(t.checkout);
//	
//	r.keyPress(KeyEvent.VK_CONTROL);
//	r.keyPress(KeyEvent.VK_A);
//	r.keyRelease(KeyEvent.VK_CONTROL);
//	r.keyRelease(KeyEvent.VK_A);
//			
//		r.keyPress(KeyEvent.VK_BACK_SPACE);	
//		r.keyRelease(KeyEvent.VK_BACK_SPACE);
//	
//		String f4 = file(1, 3);
//	sendKeys(t.checkout,f4 );
//		
//	
//	dropDownSelectByIndex(t.adperroom, 3);
//		dropDownSelectByVisibleText(t.childperroom, "4 - Four");
//		
//		t.searchbtn.click();
//		
//		t.radiobtn.click();
//		t.contbtn.click();
//		
//		Pojo p=new Pojo();
//		
//		String f5 = file(1, 4);
//		sendKeys(p.firstname, f5);
//		
//		String f6 = file(1, 5);
//		sendKeys(p.lastname, f6);
//		
//		String f7 = file(1, 6);
//		sendKeys(p.address, f7);
//		
//		String f8 = file(3, 0);
//		sendKeys(p.credit, f8);
//		
//		dropDownSelectByIndex(p.cardtype, 3);
//		
//		dropDownSelectByValue(p.expmonth, "2");
//		
//		dropDownSelectByVisibleText(p.expyear,"2022");
//		String f9 = file(3, 1);
//		sendKeys(p.cvv,f9 );
//		p.bookbtn.click();
//		
//		p.myi.click();
//		
//	}
	
	
	
	
}
