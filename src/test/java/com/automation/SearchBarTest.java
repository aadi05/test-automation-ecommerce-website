package com.automation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBarTest {
  @Test
  public void testSearchBar() {
	  WebDriver driver = new ChromeDriver();
	  String websiteUrl = "http://automationpractice.com/index.php";
	  driver.manage().window().maximize();
	  driver.get(websiteUrl);
	  driver.findElement(By.id("search_query_top")).sendKeys("printed dress");
	  driver.findElement(By.className("button-search")).click();
	  try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  System.out.println("Search bar tested succesfully!");
	  driver.close();
  }
}
