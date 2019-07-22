package com.selenium.java;

import java.util.List;
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

public class SeleniumDemo3 {

	public SeleniumDemo3() {
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
		driver.findElement(By.id("btnLogin")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement e:links) {
			String link = e.getText();
			System.out.println(link);
		}
		System.out.println("Clicking Welcome");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(10000);
		System.out.println("Clicking Logout");
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		driver.quit();
		
	}

}
