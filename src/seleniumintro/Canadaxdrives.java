package seleniumintro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canadaxdrives {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\driver1\\chromedriver.exe");//path call
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.canadadrives.ca");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='hidden sm:inline-block hover:text-blue-400'and text()='Select a different province or territory.']")).click();
		//driver.findElement(By.xpath("//*[@class='hidden sm:inline-block hover:text-blue-400'and text()='Select a different province or territory.']")).click();
	    driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/nav/div/div/div[3]/div/div[2]/div[2]/div[1]/div/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div[1]/div/div[3]/a[1]/div/div")).click();
		driver.findElement(By.xpath("//*[@id='app']/div/main/div/div[1]/section/div/div/div[1]/div/div[2]/div[2]/button/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"fitem-1-0\"]/div/div/div/label/div/span")).click();
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"fitem-1-1\"]/div/div/div/label/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"fitem-1-2\"]/div/div/div/label/div/span")).click();
		//driver.findElement(By.xpath("//*[@class='mr-2 grey--text user-icon svg-inline--fa fa-circle-user']")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/section/div/div/div[2]/div[1]/div[5]/div[1]/div/button")).click();
		Thread.sleep(3000);
		JavascriptExecutor a=(JavascriptExecutor)driver;
		a.executeScript("window.scrollBy(0,400)","");
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/section/div/div/div[2]/div[1]/div[5]/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id='create-account-first-name']")).sendKeys("Nivesh");
		driver.findElement(By.xpath("//*[@id='create-account-last-name']")).sendKeys("Baptist");//*[@id='create-account-email']
		driver.findElement(By.xpath("//*[@id='create-account-email']")).sendKeys("niveshbaptist76@gmail.com");
		driver.findElement(By.xpath("//*[@id='create-account-password']")).sendKeys("baptist@7438");
		driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click();		
		Thread.sleep(1000);
		a.executeScript("window.scrollBy(0,-400)","");
     	driver.findElement(By.xpath("//*[@href='#']")).click();
	     driver.findElement(By.xpath("//*[@id='username']")).sendKeys("niveshbaptist76@gmail.com");
	     driver.findElement(By.xpath("//*[@id='sign-in-password']")).sendKeys("baptist@7438");
	     driver.findElement(By.xpath("//*[@id='sign-in-button']")).click();
	    Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/section/div/div/div[2]/div[1]/div[5]/div[1]/div/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/section/div/div/div[2]/div[1]/div[5]/div[2]/div/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/section/div/div/div[2]/div[1]/div[5]/div[3]/div/button")).click();
	
	  //*[@id="app"]/div/header/div[3]/div/div/button[2].
	
	
	
	}
	

}
