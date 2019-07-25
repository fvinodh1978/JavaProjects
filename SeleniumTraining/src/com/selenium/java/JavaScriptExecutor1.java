package com.selenium.java;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutor1 {

	public JavaScriptExecutor1() {
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
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);		
		String domain = js.executeScript("return document.domain").toString();
		System.out.println(domain);				

		js.executeScript("history.go(0)");
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		
		WebElement user = (WebElement) js.executeScript("return document.getElementById('txtUsername')");
		System.out.println(user.getAttribute("value"));
		
		WebElement password = (WebElement) js.executeScript("return document.getElementById('txtPassword')");
		password.sendKeys("admin123");
		
		WebElement submit = (WebElement) js.executeScript("return document.getElementById('btnLogin')");
		submit.click();
		Thread.sleep(3000);
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
		js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
		Thread.sleep(3000);
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//js.executeScript("window.scrollTo(0,0)");
		//js.executeScript("window.scrollTo(0,-600)");
		Thread.sleep(3000);
		//js.executeScript("window.scrollTo(0,screenTop)");
		//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		//Scroll to a particular Element
		Thread.sleep(3000);
		//js.executeScript("document.getElementById('ohrmList_chkSelectRecord_4').scrollIntoView()");
		//Get the inner HTML identified by an id
		//System.out.println(js.executeScript("return document.getElementById('resultTable').innerHTML"));
		//System.out.println(js.executeScript("return document.getElementById('resultTable').innerText"));
		Thread.sleep(3000);
		//Go Back by 1 screen
		js.executeScript("window.history.back()");
		js.executeScript("window.history.back()");
		Thread.sleep(3000);
		js.executeScript("window.history.forward()");
		//Alert
		js.executeScript("alert('Welcome to Selenium')");
		Thread.sleep(5000);
		js.executeScript("confirm('Enter the Credentials')");
		Thread.sleep(5000);
		js.executeScript("prompt('Enter the Credentials', 'Enter Y/N')");
		//driver.close();
	}
}
