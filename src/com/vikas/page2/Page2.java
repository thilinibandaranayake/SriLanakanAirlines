package com.vikas.page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Page2 {
	public void verficationPage2(WebDriver webDriver){
		
		
		Assert.assertEquals("http://www.srilankan.com/en_uk/th",webDriver.getCurrentUrl());
		Assert.assertEquals("SriLankan Airlines| Flights to Colombo| Official Site",webDriver.getTitle());
		
	}
	public void verificationLanguage(WebDriver webDriver){
		WebElement language=(WebElement)webDriver.findElement(By.xpath(".//*[@id='languageSelect_titletext']/span"));
		Assert.assertEquals("English", language.getText());
	}

	public void login(WebDriver webDriver){
		WebElement log=(WebElement)webDriver.findElement(By.xpath(".//*[@id='logIn']"));
		log.click();
		WebElement joinnow=(WebElement)webDriver.findElement(By.xpath(".//*[@id='divFlySmiles']/div/label/a"));
		joinnow.click();
		System.out.println("end1");
	}
}
