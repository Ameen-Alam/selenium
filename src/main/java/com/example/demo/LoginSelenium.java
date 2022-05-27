package com.example.demo;



import java.util.HashMap;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class LoginSelenium {
	static public Logger logger = Logger.getLogger("MyLog");
	static public FileHandler fh;
	static public int a = 1;
	static String win01_name = "";
	static String win02_name = "";
	//static String time="";
	
	public LoginSelenium() {
		//ChromeDriver driver = null;
		try {
			
			
			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
			
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromePrefs);
			Thread.sleep(2000);
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setJavascriptEnabled(true);
			WebDriver  driver=new ChromeDriver(cap);
			driver.get("http://119.160.107.15:31004/apps/onlinebanking/#/AuthenticationMA/frmLogin");
			Thread.sleep(1000); // Let the user actually see something!
			
		//	driver.findElement(By.id("frmLogin_loginComponent_tbxUserName")).sendKeys("dbpolbuser");
			driver.findElement(By.tagName("input")).sendKeys("dbpolbuser");
			Thread.sleep(1000); // Let the user actually see something!
			//driver.findElement(By.tagName("input")).sendKeys("Kony@1234");
			driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div/div[1]/div[1]/div[1]/div[1]/div[5]/input")).sendKeys("Kony@1234");
			
			Thread.sleep(1000);
			driver.findElement(By.tagName("button")).click();
			Thread.sleep(1000);
			
			
			
			

			//driver.close();
		//	driver.quit();
			
			logger.info("Step:11 Stop process complete T24LoginSelenium \n");
		
			
		} catch (Exception e) {System.out.println("Error....." + e.getMessage());}
		
	}// end T24LoginSelenium
	
	
	public static void main(String arg[]) {

		new LoginSelenium();
		
		
	}// end main method main
}
