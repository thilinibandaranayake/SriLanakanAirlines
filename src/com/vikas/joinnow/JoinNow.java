package com.vikas.joinnow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class JoinNow {
	public void verificationjoinNowPage(WebDriver webDriver){
		Assert.assertEquals("https://www.flysmiles.com/home/register",webDriver.getCurrentUrl());
		Assert.assertEquals("Join Now",webDriver.getTitle());
	}
	public void verificationradiobtn(WebDriver webDriver){
		WebElement no=(WebElement)webDriver.findElement(By.id("rdmemno"));
		Assert.assertEquals(true, no.isSelected());
		WebElement ul=(WebElement)webDriver.findElement(By.id("txtusernamerg"));
		Assert.assertEquals(false, ul.isEnabled());
	}
	}
