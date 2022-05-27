//package com.example.demo;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//public class LoginKMBL {
//
//	 static String baseUrl = "https://www.javatpoint.com/";
//	static String  driverPath = "C:\\Users\\Administrator\\Downloads\\chromedriver.exe";
//
//	public static WebDriver driver;
//
//
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("before test");
//	}
//
//	@AfterTest
//	public void afterTest() {
//		driver.quit();
//		System.out.println("after test");
//	}
//	
//	public static void main (String arg[]) {
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		// Create driver object for CHROME browser
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get(baseUrl);
//		// get the current URL of the page
//		String URL = driver.getCurrentUrl();
//		System.out.print(URL);
//		// get the title of the page
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//}
