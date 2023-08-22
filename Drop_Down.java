package order_module;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Drop_Down {
public static void main(String[] args) {
		System.setProperty("webdriver.chromedrive","chromedriver.exe");
				 WebDriver driver= new ChromeDriver();
				 driver.get("https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca"
				 		+ "%2F%3Ftag%3Dhydcaabkg-20%26hvadid%3D317597040173%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D7196655668176246764%"
				 		+ "26hvpone%3D%26hvptwo%3D%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9001503%"
				 		+ "26hvtargid%3Dkwd-360364904397%26ref%3Dnav_custrec_signin%26hydadcr%3D11828_10790061&openid.identity=http%"
				 		+ "3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid"
				 		+ ".mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2"
				 		+ "Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
				 driver.findElement(By.id("ap_email")).sendKeys("shivalimaria87@gmail.com");
				 driver.findElement(By.id("continue")).click();
				 driver.findElement(By.id("ap_password")).sendKeys("Canada1983");
				 driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > "
				 		+ "div > div:nth-child(2) > div >"
				 		+ " form > div > div:nth-child(7) > div > div > label > div >"
				 		+ " label > input[type=checkbox]")).click();
					
					  boolean result = driver.findElement(By.
					  cssSelector("#authportal-main-section > div:nth-child(2) >" +
					  " div > div:nth-child(2) > div > form > div > div:nth-child(7) >" +
					  " div > div > label > div > label > input[type=checkbox]")).isSelected();
					  System.out.println(result);
					 
				  driver.findElement(By.id("signInSubmit")).click();
				 driver.get("https://www.amazon.ca/gp/css/homepage.html?ref_=nav_AccountFlyout_ya");
				 Actions action= new Actions(driver);
				 action.moveToElement(driver.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(2) >"
				 		+ " div:nth-child(1) > a >"
				 		+ " div > div > div > div.a-column.a-span9.a-span-last > h2"))).build().perform();
				 driver.navigate().to("https://www.amazon.ca/gp/your-account/order-history?ref_=ya_d_c_yo");
	}
}
				 
				 		 
				 
	


