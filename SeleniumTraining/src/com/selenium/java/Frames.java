package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
	public static boolean isAlertPresent(WebDriver driver){
	    boolean foundAlert = false;
	    WebDriverWait wait = new WebDriverWait(driver, 0 /*timeout in seconds*/);
	    try {
	        wait.until(ExpectedConditions.alertIsPresent());
	        foundAlert = true;
	    } catch (TimeoutException eTO) {
	        foundAlert = false;
	    }
	    return foundAlert;
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		//List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		//Get all the iframes in a page using xpath
		List<WebElement> frames=driver.findElements(By.xpath("//iframe"));
		System.out.println("Number of Frames = " + frames.size());
		for (int i=0; i<frames.size();i++) {
			System.out.println(frames.get(i).getAttribute("name"));
		}
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		driver.switchTo().frame("iframe1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='navigation']/ul/li[2]/ul/li[1]/a/span/span")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe2");
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='sidebar']/aside/ul/li[1]/a")).click();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);

        
	}
}
