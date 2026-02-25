package com.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC03_Textbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//*[@placeholder=\"First Name\"]")).sendKeys("testing");
		driver.findElement(By.xpath("//*[@placeholder=\"Last Name\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*//*[@id=\"eid\"]/input")).sendKeys("ask@123.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"Skills\"]")).click();
		Thread.sleep(2000);
        driver.quit();
	}

}
