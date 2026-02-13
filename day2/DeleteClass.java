package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Enter username by Attribute based Xpath
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr2");
        //Enter password by Attribute based Xpath
        driver.findElement(By.xpath("//input [@id='password']")).sendKeys("crmsfa");
        //Click Login by Attribute based Xpath
        driver.findElement(By.xpath("//input [@value='Login']")).click();
        //Click CRMSFA by Partial Bases Xpath
        driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
        //Click Leads by textbased Xpath
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        WebElement phoneTab = driver.findElement(By.xpath("//span[text()='Phone']"));
        phoneTab.click();
        driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("00");
        driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("123");
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        //wait to load the page
	    Thread.sleep(3000);
	    //using relative xpath
        WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
        String leadID = firstLead.getText();
        firstLead.click();
        Thread.sleep(5000);
        System.out.println("Captured Lead ID: " + leadID);
       //To delete the first resulting lead ID
        driver.findElement(By.xpath("//a[text()='Delete']")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(5000);
        //Verify the presence of deletion as No records to display
        WebElement message=driver.findElement(By.xpath("//div[text()='No records to display']"));
        message.getText();
        driver.close();
       
       
      
	}
	
	

}
