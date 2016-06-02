package com.vikas.main;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vikas.home.Home;
import com.vikas.joinnow.JoinNow;
import com.vikas.page2.Page2;

public class Main {
	static WebDriver driver;
	static Home home; 
	static Page2 page2;
	static JoinNow joinNow;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		driver=new FirefoxDriver();
		home=new Home();
		page2=new Page2();
		joinNow=new JoinNow();
		
		driver.get("http://www.srilankan.com/");
		home.pageverificaton(driver);
		home.VerificationExpolrebtnDropdow(driver);
		Thread.sleep(2000);
		page2.verficationPage2(driver);
		Thread.sleep(2000);
		page2.verificationLanguage(driver);
		System.out.println("end2");
		page2.login(driver);
		Thread.sleep(10000);
		
		
		String base = driver.getWindowHandle();
		  Set<String> set = driver.getWindowHandles();

		  set.remove(base);
		  assert set.size() == 1;
		  driver.switchTo().window((String) set.toArray()[0]);
		  joinNow.verificationjoinNowPage(driver);
		  joinNow.verificationradiobtn(driver);
	}

}
