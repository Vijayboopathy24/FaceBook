package org.base;

import javax.swing.Action;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static Actions a;
	
	public static void launchBrowser() {
		
		driver = new ChromeDriver();
		
	}
	public static void launchUrl(String Url) {
		 
		driver.get(Url);

	}
	public static void btnClick(WebElement ref) {
		ref.click();
	}
	public static void maxWin() {
		driver.manage().window().maximize();

	}
	public static void minWin() {
		driver.manage().window().minimize();
	}
	public static void fillText(WebElement ref,String Value) {
		ref.sendKeys(Value);

	}
	public static void jsFillText(String Value ,WebElement ref) {
		 js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('value','"+Value+"')", ref);

	}
	public static void getValue(WebElement Ref) {
		 js = (JavascriptExecutor)driver;
		 js.executeScript("return arguments[0].getAttribute('Value')", Ref);

	}
	public static void scrollDown(WebElement Ref) {
		 js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Ref);
	}
	public static void ScrollUp(WebElement Ref) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", Ref);

		}
	public static void mouseOver(WebElement ref) {
		a.moveToElement(ref).perform();

	}
	
	@Parameters("broswerName")
	@Test
	public static void crossBrowser(String browser) {
		
		if(browser.contains("Chrome")) {
			driver = new ChromeDriver();
		}else if (browser.contains("Edge")) {
			driver = new EdgeDriver();
			
		}
		driver.get(browser);
	}
	
	 public static void closeBrowser() {
			driver.close();
			}
	 

}
