package seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intro1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\driver1\\chromedriver.exe");//path call
		//type 1
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");//to launch url
//driver.manage().window().maximize();   //to maximise browser screen
//driver.close();// close all background
		driver.get("https://www.mycontactform.com");
		//driver.manage().window().maximize();
		  
		 
		
		
		
		
		
		
	}

	private static void .lick() {
		// TODO Auto-generated method stub
		
	}

}
