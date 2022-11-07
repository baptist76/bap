package seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\driver1\\chromedriver.exe");//path call
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("baptist");
		driver.findElement(By.id("pass")).click();
		driver.findElement(By.id("pass")).sendKeys("7438");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("")).click();		
		
		
		
	
	
	
	
	
	
	
	
	
	
	}

}
