package com.wbl.webtask;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestBase extends Inistilization {
	public static WebDriver driver;

    @FindBy(xpath="//input[@type='number']") private WebElement  number;
    @FindBy(xpath="//button[@class='btn btn-primary mb-5 float-right mr-5 mt-2']")
	private WebElement login;

public TestBase(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void send() {
	number.sendKeys(RandomPassword(10));
}

public void loginButton() {
	login.click();
}

	public static String RandomPassword(int len) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
          +"lmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}

	
}

