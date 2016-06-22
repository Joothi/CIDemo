package com.ci.dem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CIDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"/lib/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.nielsen.com/");
	System.out.print("Hai");
	
	}

}
