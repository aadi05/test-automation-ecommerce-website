package com.automation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void testLogin() {
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
	  driver.findElement(By.id("email")).sendKeys("abcemail3@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("abcpassword");
	  driver.findElement(By.id("SubmitLogin")).click();
	  try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  System.out.println("Login succesfull!");
	  driver.close();
  }
}
