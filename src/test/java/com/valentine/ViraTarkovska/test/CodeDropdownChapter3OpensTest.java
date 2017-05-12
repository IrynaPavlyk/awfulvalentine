package com.valentine.ViraTarkovska.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*import org.openqa.selenium.chrome.ChromeDriver;*/
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.valentine.tools.Browser;

public class CodeDropdownChapter3OpensTest {

	private WebDriver driver;

	@Test
	public void testCodeDropdownChapter3Opens() {
		/*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();*/
		driver = Browser.open();
		driver.get("http://awful-valentine.com/");

		//Hover
		Actions actions = new Actions(driver);
		WebElement mainMenuCode = driver.findElement(By.cssSelector("#top-menu>li:nth-child(2)"));
		actions.moveToElement(mainMenuCode);

		WebElement chapter3 = driver.findElement(By.cssSelector("#top-menu>li:nth-child(2) li:nth-child(3)"));
		actions.moveToElement(chapter3);
		actions.click().build().perform();
		//HoverEnd
		
		Assert.assertEquals(driver.getCurrentUrl(), "http://awful-valentine.com/code/chapter-3/",
				"Incorrect URL after click on 'Capter 3' button: ");

	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
