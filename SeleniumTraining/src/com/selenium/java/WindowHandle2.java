package com.selenium.java;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Official\\MyProjects\\ExternalLibraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com");
		//driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		WebElement menu= driver.findElement(By.xpath("//*[@class='navigation']/ul/li[7]/a/span/span"));
		Actions actions = new Actions(driver);
		Action movecursor;
		Action clickMenu;
		movecursor= actions.moveToElement(menu).build();
		movecursor.perform();
		Thread.sleep(5000);
		WebElement menuItem= driver.findElement(By.xpath("//*[@class='navigation']/ul/li[7]/ul/li[3]/a/span/span"));
		
		movecursor= actions.moveToElement(menuItem).build();
		movecursor.perform();
		
		clickMenu= actions.click().build();
		clickMenu.perform();
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@id='cookie_action_close_header']")).click();

		for (int i=0; i<3;i++) {
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//*[@class='wpb_text_column wpb_content_element ']/div/p[3]/button")).click();
		}
		
		ArrayList<String> childwindow = new ArrayList<>(driver.getWindowHandles());
		System.out.println("childwindow -->" + childwindow );
		String lastwindow="";
		//switch between my child window
		for(int i=1;i<childwindow.size();i++)
		{
		    driver.switchTo().window(childwindow.get(1));
		    //driver.manage().window().maximize();
		    driver.navigate().to("https://www.google.com");
		    //it will identify my last window handle
		    lastwindow = childwindow.get(i).toString();
		}

		driver.switchTo().window(childwindow.get(0));
		driver.navigate().to("http://newtours.demoaut.com/");
		String titleparent = driver.getTitle();
		System.out.println(titleparent);
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(lastwindow);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		//driver.quit();
	}
}
