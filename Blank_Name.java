package create_module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blank_Name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedrive","chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.amazon.ca/ap/register?openid.pape.max_auth_age=0&openid."
		 		+ "return_to=https%3A%2F%2Fwww.amazon.ca%2F%3F_encoding%3DUTF8%26adgrpid%3D1362295139704029%26hvadid%3D85143601008002%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D5081%26hvnetw%3Do%26hvqmt%3De%26hvtargid%3Dkwd-85143614969283%253Aloc-32%26hydadcr%3D11829_10253939%26ref%3Dpd_sl_6a4q247no1_e%26tag%3Dhydcaabkm-20%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid."
		 		+ "net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs."
		 		+ "openid.net%2Fauth%2F2.0");
		 driver.findElement(By.id("ap_customer_name")).sendKeys("");
		 Thread.sleep(2000);
		 driver.findElement(By.id("continue")).click();
	}

}

