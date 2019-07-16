package com.selenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeleniumApplication {

	public static void main(String[] args) {
		String projectLocation =System.getProperty("user.dir");
	
		System.setProperty("webdriver.chrome.driver", projectLocation+"/src/lib/chromedriver/chromedriver.exe");
	    //# download chrome Driver from here https://chromedriver.storage.googleapis.com/index.html?path=74.0.3729.6/

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		 
		System.out.println("Title of the Page: "+driver.getTitle());
	}

}
