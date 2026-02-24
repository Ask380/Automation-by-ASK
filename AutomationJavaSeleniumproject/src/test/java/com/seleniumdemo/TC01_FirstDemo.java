package com.seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_FirstDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		System.out.println("page Title:::  "+ driver.getTitle());
		driver.quit();

	}

}
