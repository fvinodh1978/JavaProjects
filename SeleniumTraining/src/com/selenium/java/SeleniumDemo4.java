package com.selenium.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo4 {

	public SeleniumDemo4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TimeoutException, InterruptedException {
		// Setting the firefox driver system Property
		System.setProperty("webdriver.chrome.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		Actions actions = new Actions(driver);
		
		for(WebElement link:links) {
			//Thread.sleep(3000);
			System.out.println("Clicking : "+link.getText());			
			actions.moveToElement(link).click().build().perform();
			//movetoElement.perform();

			//Action clickElement = actions.sendKeys(link, Keys.ENTER).build();
			//clickElement.perform();
			driver.navigate().back();
		}
	}
}
