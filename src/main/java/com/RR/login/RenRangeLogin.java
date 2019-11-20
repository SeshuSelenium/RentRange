package com.RR.login;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RenRangeLogin {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\RentRange\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);

		driver.get("https://uat.rentrange.com/sdpui/admin/login");

		driver.findElement(By.xpath(
				"//*[@class='form-control m-input ng-untouched ng-pristine ng-invalid' and @formcontrolname='userName']"))
				.sendKeys("udaya.kiranss@altisource.com");

		driver.findElement(By.xpath(
				"//*[@class='form-control m-input ng-untouched ng-pristine ng-invalid' and @formcontrolname='loginPassword']"))
				.sendKeys("password");
		driver.findElement(By.id("sdp-admin-auth-btn")).click();
		driver.findElement(By.xpath("//*[text()='Pricing Schedules']")).click();
		Thread.sleep(10000);// button[@class='btn btn-success m-loader--right']

//		List<WebElement> row = driver
//				.findElement(By.xpath("//*[@class='ag-body-viewport-wrapper ag-layout-normal']/child::div/div/div"));
//		System.out.println(row.size());
		ArrayList<String> names = new ArrayList<String>();
		String name = driver.findElement(By.xpath("//*[@class='ag-body-viewport-wrapper ag-layout-normal']/child::div/div/div[1]/div[1]")).getText();
		String name1 = driver.findElement(By.xpath("//*[@class='ag-body-viewport-wrapper ag-layout-normal']/child::div/div/div[2]/div[1]")).getText();
		String name2= driver.findElement(By.xpath("//*[@class='ag-body-viewport-wrapper ag-layout-normal']/child::div/div/div[3]/div[1]")).getText();
		String name3 = driver.findElement(By.xpath("//*[@class='ag-body-viewport-wrapper ag-layout-normal']/child::div/div/div[4]/div[1]")).getText();
		String name4 = driver.findElement(By.xpath("//*[@class='ag-body-viewport-wrapper ag-layout-normal']/child::div/div/div[5]/div[1]")).getText();
		String name5 = driver.findElement(By.xpath("//*[@class='ag-body-viewport-wrapper ag-layout-normal']/child::div/div/div[6]/div[1]")).getText();
		String name6 = driver.findElement(By.xpath("//*[@class='ag-body-viewport-wrapper ag-layout-normal']/child::div/div/div[7]/div[1]")).getText();
		names.add(name);
		names.add(name1);
		names.add(name2);
		names.add(name3);
		names.add(name4);
		names.add(name5);
		names.add(name6);
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		ArrayList<String> username = new ArrayList<String>();
	//	for (int i = 1; i < 24; i++) {
		List<WebElement> user =driver.findElements(By.xpath("/html/body/div[2]/m-container/div/app-admin-page/sdp-admin-pricing/div/div/div/div/sdp-volume-tab/loader-comp/div/ag-grid-angular/div/div[1]/div/div[3]/div[2]/div/div/div[1]"));
		System.out.println(user.get(0).getText());
		
	//	}
		List<WebElement> co = driver.findElements(By.xpath("/html/body/div[2]/m-container/div/app-admin-page/sdp-admin-pricing/div/div/div/div/sdp-volume-tab/loader-comp/div/ag-grid-angular/div/div[1]/div/div[3]/div[2]/div/div/div[1]\r\n" + 
				""));
		System.out.println(co.get(0).getText());
		
		for (int i = 0; i < username.size(); i++) {
			System.out.println(username.get(i));
		}
		driver.findElement(By.xpath("//*[text()='releasepatce']")).click();
		List<WebElement> ss = driver.findElement(By.xpath("//*[text()='releasepatce']"));
		System.out.println(ss.get(0).getText());
		
	}
}
