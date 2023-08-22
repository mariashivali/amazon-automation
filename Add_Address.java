package address_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Add_Address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedrive","chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.ca/ap/signin?_encoding=UTF8&accountStatusPolicy=P1&"
		 		+ "openid.assoc_handle=caamazon&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2."
		 		+ "0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp"
		 		+ "%2Fcss%2Forder-history%3Fie%3DUTF8%26ref_%3Dya_d_c_yo&pageId=webcs-yourorder&showRmrMe=1");
		 driver.findElement(By.id("ap_email")).sendKeys("shivalimaria87@gmail.com");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("ap_password")).sendKeys("Canada1983");
			/*
			 * boolean result= driver.findElement(By.
			 * cssSelector("#authportal-main-section > div:nth-child(2) > div > " +
			 * "div:nth-child(2) >" + " div > form > div > div:nth-child(7) > " +
			 * "div > div > label > div > label > input[type=checkbox]")).isSelected();
			 * System.out.println(result);
			 */
		
		 driver.findElement(By.id("signInSubmit")).click();
		 Actions action= new Actions(driver);
		 action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		// driver.get("https://www.amazon.ca/gp/css/homepage.html?ref_=nav_AccountFlyout_ya");
		 //driver.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > "
		 	//	+ "div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")).click();
		 driver.findElement(By.cssSelector(".nav-text")).click();
		 driver.findElement(By.cssSelector("#a-page > div.a-container > div > "
		 		+ "div:nth-child(3) > div:nth-child(1) > a > div > div > div > "
		 		+ "div.a-column.a-span9.a-span-last > h2")).click();
		 
			/*
			 * driver.findElement(By.cssSelector(".a-box-inner a-padding-extra-large")).
			 * click(); driver.findElement(By.
			 * cssSelector(" #nav-al-your-account > a:nth-child(2) > span")).click();
			 * driver.findElement(By.
			 * cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > \r\n"
			 * + "	div > div.a-column.a-span9.a-span-last > div > span")).click();
			 */
	}
	
}
