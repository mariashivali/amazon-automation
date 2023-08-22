package address_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Address_Folder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedrive","chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
			
		driver.get("https://www.amazon.ca/ap/signin?openid.pape."
				+ "max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgcx%"
				+ "2FBack-to-School%2Fgfhz%2Fevents%2F%3FcategoryId%3Dxcm-backtoschool%"
				+ "26_encoding%3DUTF8%26pd_rd_w%3DlcZaV%26content-id%3Damzn1.sym.577df8b8-86c0-4e60-"
				+ "b606-8e5d1679243a%26pf_rd_p%3D577df8b8-86c0-4e60-b606-8e5d1679243a%26pf_rd_r%3DNJECBK78F0FY7Y2KSYSA%26pd_rd_wg%3D8KrVu%26pd_rd_r%3D26abb1d4-4597-4477-96a9-87359f878379%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier"
				+ "_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("shivalimaria87@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Canada1983");
		driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div > div:nth-child(2)"
				+ " > div > form > div > div:nth-child(7) > div > div > label > div > label > "
				+ "input[type=checkbox]")).click();
		driver.findElement(By.id("signInSubmit")).click();
		driver.navigate().to("https://www.amazon.ca/gp/css/homepage.html?ref_=nav_AccountFlyout_ya");
		driver.navigate().to("https://www.amazon.ca/gp/css/homepage.html?ref_=nav_youraccount_btn");
		 driver.findElement(By.cssSelector("#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1)"
		 		+ " > a > div > div > div > div.a-column.a-span9.a-span-last > h2")).click();
		
	driver.findElement(By.cssSelector("\r\n"
			+ "		 #ya-myab-address-add-link > div > div")).click();
	
	
	
		 
	
	}
	
	

	
	

	
	
	
}
