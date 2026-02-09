package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/ "); 
		// To get username from Login field in FB page using locator ID and sendkeys to input the value
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		// To get password from Login field in FB page using locator name
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
		//driver.close();
	}

}
