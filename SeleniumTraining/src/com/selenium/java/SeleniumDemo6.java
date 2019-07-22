package com.selenium.java;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo6 {

	public SeleniumDemo6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TimeoutException, InterruptedException {
		// Setting the firefox driver system Property
		System.setProperty("webdriver.chrome.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("http://retail.upskills.in/admin/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin@123");	
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		WebElement catalog = driver.findElement(By.id("menu-catalog"));
		
		Action movetoElement = actions.moveToElement(catalog).build();
		movetoElement.perform();
		
		Action clickCatalog = actions.sendKeys(catalog, Keys.ENTER).build();
		clickCatalog.perform();

	}

}
