package test;

import java.util.logging.Logger;

import javax.naming.NamingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.webtask.Inistilization;
import com.wbl.webtask.TestBase;

public class WebLogin extends Inistilization {

	TestBase t;
	Inistilization i;

	@Before
	public void loginPage() {

		i = new Inistilization();
		BrowserInistilization();

	}

	@Test
	public void ValidCredientials() {
		t.send();
		t.loginButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

	@Test
	public void InValidCredientials2() {
		t.send();
		t.loginButton();
		Assert.assertNotEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");

	}

	@Test
	public void NullCredientials() {

		try {
			TestBase t = new TestBase(driver);
			t.send();
			t.loginButton();
			Assert.assertNotEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");

		} catch (Exception e) {

		}

	}

	@Test
	public void IntCharCreiantials() {
		t.send();
		t.loginButton();
		Assert.assertNotEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");

	}

	@Test
	public void Fractions() {
		t.send();
		t.loginButton();

		Assert.assertNotEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

	@Test
	public void NumberSPecialCaracters() {
		t.send();
		t.loginButton();
		Assert.assertNotEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

	@Test
	public void EmptyCredientials() {
		t.send();
		t.loginButton();

		Assert.assertNotEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

	@Test
	public void SpacedCredientials() {
		t.send();
		t.loginButton();

		Assert.assertNotEquals(driver.getCurrentUrl(), "https://ping.telebu.com/chat");
	}

}
