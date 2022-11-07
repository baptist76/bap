package seleniumintro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Contactform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\driver1\\chromedriver.exe");//path call
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mycontactform.com");
		//driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Sample Forms']")).click();
		driver.findElement(By.name("email_to[]")).click();
		driver.findElement(By.name("subject")).click();
		driver.findElement(By.name("subject")).sendKeys("hellow");
		driver.findElement(By.name("subject")).click();
		driver.findElement(By.name("email")).sendKeys("bappy");
		driver.findElement(By.name("q1")).click();
		driver.findElement(By.name("q1")).sendKeys("bappy");
	    driver.findElement(By.xpath("//textarea[@name='q2']")).sendKeys("selenium");
		 driver.findElement(By.xpath("//*[@name='q3']")).click();
		 driver.findElement(By.xpath("//*[@name='q4'and@value='Third Option']")).click(); 
		 driver.findElement(By.xpath("//*[@name='q5'and@value='Yes']")).click(); 
		//*[@name='checkbox6[]'and@value='Third Check Box']
		 driver.findElement(By.xpath("//*[@name='checkbox6[]'and@value='Third Check Box']")).click(); 
		 driver.findElement(By.xpath("//*[@name='q7']")).click(); 
		 driver.findElement(By.xpath("//*[@name='q7']")).sendKeys("07");
		 driver.findElement(By.xpath("//*[@name=\"q8\"]")).click(); 
		 
	
	
	
	}  
}