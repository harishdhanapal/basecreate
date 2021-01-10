package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Return;

public class BaseFile {

	public static WebDriver d;
	public static Select s;
	public static Actions a;
	public static File f;
	public static Robot r;
	public static JavascriptExecutor js;
	
	
	
	public static void launchBrowser() {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver","A:\\eclipse saved files\\Base\\driver\\msedgedriver.exe");

  d= new EdgeDriver();
  
  

	}
	
	public static void url(String url) {
		// TODO Auto-generated method stub
d.get(url);
	}
	
	public static void timeDelay() {
		// TODO Auto-generated method stub
d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	public static void dropDownSelectByIndex(WebElement e,int i) {
		// TODO Auto-generated method stub
		s=new Select(e);
		s.selectByIndex(i);
		

	}
	
	public static void dropDownSelectByValue(WebElement e,String s1) {
	s=new Select(e);
     s.selectByValue(s1);
		
	}
	
	public static void dropDownSelectByVisibleText(WebElement e,String s1) {
		// TODO Auto-generated method stub
s=new Select(e);
		s.selectByVisibleText(s1);
		
		
	}
	
	public static void sendKeys(WebElement w, String s) {
		// TODO Auto-generated method stub

		w.sendKeys(s);
		
	}
	
	public static void mouseClick(WebElement w) {
		// TODO Auto-generated method stub
 a=new Actions(d);
		
 a.click(w).perform();
		
	}
	
	public static void rightClick() {
		// TODO Auto-generated method stub

a.contextClick().perform();

	}
	
	public static void mouseMove(WebElement w) {
		// TODO Auto-generated method stub

a.moveToElement(w).perform();
	}
	
	public static void getText(WebElement w) {
		// TODO Auto-generated method stub

		String text = w.getText();
System.out.println(text);		

	}
	
	public static void maximize() {
		// TODO Auto-generated method stub
d.manage().window().maximize();
		
		
	}
	
	public static void robot() throws AWTException {
		// TODO Auto-generated method stub
 r=new Robot();
	}
	
	
	public static String file(int r,int c) throws IOException {
		// TODO Auto-generated method stub

	File	f=new File("A:\\eclipse saved files\\Base\\excel\\f2.xlsx");
	
	FileInputStream i=new FileInputStream(f);
	
	Workbook w=new XSSFWorkbook(i);
	
	Sheet sheet = w.getSheet("Sheet1");
	
	Row row = sheet.getRow(r);
	
	Cell cell = row.getCell(c);
	
	int cellType = cell.getCellType();
	String value;
	if (cellType==1) {
		
		 value = cell.getStringCellValue();
		
	} else if (DateUtil.isCellDateFormatted(cell)) {
		
		Date d = cell.getDateCellValue();
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
		 value = s.format(d);
		
		
	}else {
		
		double dd = cell.getNumericCellValue();
		 long l=(long)dd;
		  value  = String.valueOf(l);
		
		
	}

		
	
	
	
	return value;
	
	}

	public static void fileout(int i,int i2,String s1) throws IOException {
		
		File e=new File("A:\\eclipse saved files\\Base\\excel\\pinephone.xlsx");

		Workbook w=new XSSFWorkbook();

		Sheet s = w.createSheet("poko");
			
		Row r = s.createRow(i);
			Cell c = r.createCell(i2);
			
			c.setCellValue(s1);
			
			FileOutputStream o=new FileOutputStream(e);
			
			w.write(o);
			
			System.out.println("****");
	
		
	}
	
	
	
	public static void script(WebElement s) {
		// TODO Auto-generated method stub

		 js=(JavascriptExecutor)d;
		
		js.executeScript("arguments[0].setAttribute('value','harishdhanapal')", s);
		
		
		
	}
	
	public static String Return(WebElement w) {
		// TODO Auto-generated method stub

		Object e = js.executeScript("return arguments[0].getAttribute('value')", w);
		
		String s=(String)e;
		
	return s;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
