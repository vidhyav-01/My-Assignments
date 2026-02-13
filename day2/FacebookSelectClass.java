package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/ "); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("(//input[@name='firstname'])[1]")).sendKeys("vv");
		driver.findElement(By.xpath("(//input[@name='lastname'])[1]")).sendKeys("vasu");
		driver.findElement(By.xpath("(//input[@name='reg_email__'])")).sendKeys("123456789");
		driver.findElement(By.xpath("(//input[@name='reg_passwd__'])")).sendKeys("Welcome@123$");
		//Date
		WebElement Day= driver.findElement(By.name("birthday_day"));
		Select selDay=new Select(Day);
		selDay.selectByValue("28");
		//Month
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select selMonth=new Select(Month);
		selMonth.selectByVisibleText("Jan");
		//year
		WebElement Year= driver.findElement(By.name("birthday_year"));
		Select selYear=new Select(Year);
		selYear.selectByValue("1930");
		//Gender
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		
		
		
	}

}
