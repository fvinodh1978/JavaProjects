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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo2 {

	public SeleniumDemo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws TimeoutException, InterruptedException {
		// Setting the firefox driver system Property
		System.setProperty("webdriver.chrome.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		FirefoxDriver driver1 = new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement username=driver.findElement(By.name("userName"));
		username.sendKeys("sunil");
		
		if(username.isDisplayed())
        {
            //Getattritube when ever we pass value to the edit field
            String UN = username.getAttribute("value");
            String UN1= username.getAttribute("name");
            System.out.println(UN1);
            // gettext --> label, dropdown, links
            //Getattribute --> Edit box where we pass value and if any element attribute is dynamic in nature
            String text =driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
            System.out.println(text);
            System.out.println(UN);
        }
		
		driver.findElement(By.name("password")).sendKeys("sunil");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		if (driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']")).isSelected()){
			driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		}
		
		WebElement passengers=driver.findElement(By.xpath("//*[@name='passCount']"));
		Select sel = new Select(passengers);
		List<WebElement> numPassengers=sel.getOptions();
		for (int i=0; i< numPassengers.size(); i++) {
			System.out.println(numPassengers.get(i).getText());
		}
		driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
		//Selecting a dropdown item based on index
		//sel.selectByIndex(3);
		
		//Selecting a dropdown item based on Text
		sel.selectByValue("4");
		int a=driver.findElements(By.id("search")).le
		Thread.sleep(5000);
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("FirstName1");
		driver.findElement(By.name("passLast0")).sendKeys("LastName1");
		driver.findElement(By.name("passFirst1")).sendKeys("FirstName2");
		driver.findElement(By.name("passLast1")).sendKeys("LastName2");
		driver.findElement(By.name("passFirst2")).sendKeys("FirstName3");
		driver.findElement(By.name("passLast2")).sendKeys("LastName3");
		driver.findElement(By.name("passFirst3")).sendKeys("FirstName4");
		driver.findElement(By.name("passLast3")).sendKeys("LastName4");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567890");
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@name='ticketLess']"));
		for (WebElement e :checkboxes) {
			e.click();
		}
		driver.findElement(By.name("buyFlights")).click();
		driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
		driver.close();
	}
}
