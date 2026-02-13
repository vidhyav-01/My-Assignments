package week2.day2;

//to comment lines CTRL + /
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Enter username by Attribute based Xpath
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("democsr2");
        //Enter password by Attribute based Xpath
        driver.findElement(By.xpath("//input [@id='password']")).sendKeys("crmsfa");
        //Click Login by Attribute based Xpath
        driver.findElement(By.xpath("//input [@value='Login']")).click();
        //Click CRMSFA by Partial Bases Xpath
        driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
        //Click Leads by text based Xpath
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        //Click Create Lead By text Based Xpath
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        //Enter Company Name by attribute based Xpath
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf_X");
        //Enter FirstName by attribute based Xpath
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vidhya");
        //Enter LastName by attribute based Xpath
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("V");
        //Click CreateLead Button By 
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
//        driver.close();

	}

}
