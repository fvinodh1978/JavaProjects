package com.selenium.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
	
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

	public static void main(String[] args) throws InterruptedException {
		// Setting the firefox driver system Property
		//System.setProperty("webdriver.chrome.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("http://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		JavascriptExecutor js = (JavascriptExecutor)driver;	
		/*Simple Alert
		js.executeScript("alert('Welcome to Selenium')");
		Alert alert= driver.switchTo().alert();	
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(5000);
		//Confirm Alert
		js.executeScript("confirm('Welcome to Selenium')");
		Thread.sleep(5000);
		Alert alert= driver.switchTo().alert();			
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(5000);	*/
		//prompt Alert
		js.executeScript("prompt('Enter Credentials', 'Enter Y/N')");
		Thread.sleep(5000);
		if (isAlertPresent(driver)) {
			Alert alert= driver.switchTo().alert();			
			System.out.println(alert.getText());
			alert.sendKeys("Y");
			Thread.sleep(5000);		
			alert.accept();
		}
		Thread.sleep(5000);		
		driver.close();


	}

}
