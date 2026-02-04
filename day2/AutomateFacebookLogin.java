package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(" testleaf.2023@gmail.com");
		driver.findElement(By.id("passContainer")).sendKeys("Tuna@321");
		driver.findElement(By.className("login")).click();
		
		
	}

}
