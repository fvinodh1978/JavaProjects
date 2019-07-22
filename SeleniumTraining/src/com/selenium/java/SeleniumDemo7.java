package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo7 {

	public SeleniumDemo7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TimeoutException, InterruptedException, AWTException {
		// Setting the firefox driver system Property
		System.setProperty("webdriver.chrome.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("http://realestate.upskills.in/wp-admin/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("user_login"));
		//WebElement username=driver.findElement(By.xpath("//*[text()='Username:']"));
		username.sendKeys("admin");
		
		WebElement password=driver.findElement(By.id("user_pass"));
		password.sendKeys("adminuser@12345");
		
		//WebElement password=driver.findElement(By.id("user_pass"));
		//password.sendKeys("adminuser@12345");	

		String parentWindow = driver.getWindowHandle();
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		
		//XPath with text() Locator
		//WebElement howdy=driver.findElement(By.xpath("//a[text()='Howdy, ']"));
		
		//XPath with contains(text()) Locator
		WebElement link=driver.findElement(By.xpath("//a[contains(text(), 'Howdy')]"));
			
		//Action movetoElement = actions.moveToElement(link).build();
		//movetoElement.perform();
		
		Action movetoElement = actions.contextClick(link).build();
		movetoElement.perform();
		
		String homeURL=driver.getCurrentUrl();
		System.out.println(homeURL);
		
		Point point = link.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(20000);

		
		Set<String> handles =  driver.getWindowHandles();
		for(String windowHandle  : handles){
			if(!windowHandle.equals(parentWindow)){
				driver.switchTo().window(windowHandle);
			}
		}
		   
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		if(homeURL.equals(currentURL)) {
			System.out.println("Both Same");
		}else {
			System.out.println("Both Not Same");
		}
		
	}

}
