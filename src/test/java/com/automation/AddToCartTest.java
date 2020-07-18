package com.automation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartTest{
  @Test
  public void testAddToCart() {
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
	  driver.findElement(By.cssSelector("a[title='Home']")).click();
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  driver.findElement(By.xpath("//ul[@id='homefeatured']//li[3]//*//h5//a[@href='http://automationpractice.com/index.php?id_product=3&controller=product']")).click();
	  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  driver.findElement(By.xpath("//button[@name='Submit']")).click();
	  try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  System.out.println("product added to cart!");
	  driver.close();
	  
  }
}
