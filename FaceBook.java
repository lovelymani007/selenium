package week2.day3;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("9924492");
		driver.findElement(By.id("pass")).sendKeys("mava65");
		driver.findElement(By.name("login")).click();
	    
	}
	
}
