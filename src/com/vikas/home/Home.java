package com.vikas.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class Home {
public void pageverificaton(WebDriver webDriver){
		
		//webDriver.get("http://www.srilankan.com/");
		Assert.assertEquals("http://www.srilankan.com/",webDriver.getCurrentUrl());
		Assert.assertEquals("Select Your Country",webDriver.getTitle());
		
		WebElement button=(WebElement)webDriver.findElement(By.id("btnExplore"));
		Assert.assertEquals(true,button.isDisplayed());
		
	}
	public void VerificationExpolrebtnDropdow(WebDriver webDriver) throws Exception{
		WebElement dropdownvalue=(WebElement)webDriver.findElement(By.id("countryDropDown_title"));
		Assert.assertEquals(true, dropdownvalue.isDisplayed());
		Assert.assertEquals("Sri Lanka", dropdownvalue.getText());
		WebElement dropdown=(WebElement)webDriver.findElement(By.xpath(".//*[@id='countryDropDown_msdd']/div[1]/span[2]"));
		dropdown.click();
		dropdownvalue.sendKeys("Thailand");
		WebElement dropdowncountry=(WebElement)webDriver.findElement(By.xpath(".//*[@id='countryDropDown_child']/ul/li[18]/span"));
		dropdowncountry.click();
		
		Thread.sleep(2000);
		
		WebElement explorebtn=(WebElement)webDriver.findElement(By.id("btnExplore"));
		Assert.assertEquals(true, explorebtn.isDisplayed());
		explorebtn.click();
		
	}

}
