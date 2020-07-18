package com.automation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {
  @Test
  public void testRegistration() {
	  WebDriver driver = new ChromeDriver();
	  String websiteUrl = "http://automationpractice.com/index.php";
	  driver.manage().window().maximize();
	  driver.get(websiteUrl);
	  driver.findElement(By.className("login")).click();
	  try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  try {
		  driver.findElement(By.id("email_create")).sendKeys("demoemail7475@gmail.com");
		  driver.findElement(By.id("SubmitCreate")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.id("id_gender1")).click();
	  }catch(Exception e) {
		  System.out.println("Please use another email in test for account creation!");
		  driver.findElement(By.id("email_create")).clear();
		  driver.findElement(By.id("email_create")).sendKeys("demoemail7476@gmail.com");
		  driver.findElement(By.id("SubmitCreate")).click();
		  try {
			Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	  }
	  
	  //Fill registration form.
	  driver.findElement(By.id("id_gender1")).click();
	  driver.findElement(By.id("customer_firstname")).sendKeys("Aditya");
	  driver.findElement(By.id("customer_lastname")).sendKeys("Bhogate");
	  driver.findElement(By.id("passwd")).sendKeys("abcpassword");
	  Select day = new Select(driver.findElement(By.id("days")));
	  day.selectByIndex(16);
	  Select month = new Select(driver.findElement(By.id("months")));
	  month.selectByIndex(8);
	  Select year = new Select(driver.findElement(By.id("years")));
	  year.selectByIndex(23);
	  driver.findElement(By.id("company")).sendKeys("BNP Paribas");
	  driver.findElement(By.id("address1")).sendKeys("Infinity, Building No.4, 601,BNP Paribas");
	  driver.findElement(By.id("city")).sendKeys("Mumbai");
	  Select state = new Select(driver.findElement(By.id("id_state")));
	  state.selectByIndex(5);
	  driver.findElement(By.id("postcode")).sendKeys("40009");
	  driver.findElement(By.id("phone_mobile")).sendKeys("9382837328");
	  driver.findElement(By.id("submitAccount")).click();
	  try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  System.out.println("Registered succesfully!");
	  
	  driver.close();
	  
  }
}
