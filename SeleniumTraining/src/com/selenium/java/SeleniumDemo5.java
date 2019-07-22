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

public class SeleniumDemo5 {

	public SeleniumDemo5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TimeoutException, InterruptedException {
		// Setting the firefox driver system Property
		System.setProperty("webdriver.chrome.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("txtUsername"));
		if (username.isEnabled()) {
			username.sendKeys("Admin");
		}
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Actions actions = new Actions(driver);
		//actions.moveToElement(driver.findElement(By.id("btnLogin"))).build().perform();
		//actions.sendKeys(driver.findElement(By.id("btnLogin")), (Keys.ENTER)).perform();
		//driver.quit();
		
		Action movetoElement = actions.moveToElement(driver.findElement(By.id("btnLogin"))).build();
		movetoElement.perform();
		
		Action clickElement = actions.sendKeys(driver.findElement(By.id("btnLogin")), Keys.ENTER).build();
		clickElement.perform();
		
		Action tabEvent = actions.sendKeys(Keys.TAB).build();
		tabEvent.perform();	
		tabEvent.perform();	
		tabEvent.perform();	
		
		Action clickEvent = actions.sendKeys(Keys.ENTER).build();
		Action clickEvent1 = actions.sendKeys(Keys.RETURN).build();
		clickEvent.perform();
		Thread.sleep(5000);
		System.out.println("Clicking Welcome");
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		System.out.println("Clicking Logout");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.quit();
	}

}
