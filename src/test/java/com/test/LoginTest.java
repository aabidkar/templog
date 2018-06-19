package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class LoginTest {
	public static WebDriver driver;
	public static Logger log = Logger.getLogger(LoginTest.class);

	@BeforeSuite
	public void setup() {
		log.info("Starting browser");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		log.info("lanucnhing URL.");
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("Setup is done");
		log.error("Please check the attched");
		log.fatal("fatal error msg");

	}

	@Test
	public void login() {
		System.out.println("Test");
		log.info("Executing is Strted");
		String actualText = "Google";
		String expectedText = driver.getTitle();
		log.debug("Please check the default");
		Assert.assertEquals(actualText, expectedText);

	}

	@AfterSuite
	public void close() {
		driver.quit();
		log.info("All browsers are closed.");
	}

}
