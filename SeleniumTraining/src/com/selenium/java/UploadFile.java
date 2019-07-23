package com.selenium.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadFile {
	public static void main(String[] args) throws TimeoutException, InterruptedException, AWTException {
		// Setting the firefox driver system Property
		System.setProperty("webdriver.chrome.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		driver.get("http://elearning.upskills.in");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		System.out.println (driver.findElement(By.tagName("title")).getText());
		WebElement username=driver.findElement(By.id("login"));
		if (username.isEnabled()) {
			username.sendKeys("admin");
		}
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.id("form-login_submitAuth")).click();
		driver.findElement(By.xpath("//*[@class='block-items-admin']/ul/li[4]/a")).click();
		//Code to upload a file
		driver.findElement(By.name("import_file")).sendKeys("C:\\Official\\MyProjects\\JavaProjects\\Workspace\\data.csv");
		driver.findElement(By.id("user_import_submit")).click();
		
	}

}
