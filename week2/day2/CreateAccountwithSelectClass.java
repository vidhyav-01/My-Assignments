package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountwithSelectClass {

	public static void main(String[] args) {
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
        //Click Account tab by text based xpath
        driver.findElement(By.xpath("//a[text()='Accounts']")).click();
        //Click Create account using Text based xpath
        driver.findElement(By.xpath("//a[text()='Create Account']")).click();
        //Enter AccountName
        driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("VidhyaV_W3");
        //Enter description
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Automation course");
        //Select dropdown SOftware from Industry Type using select by visible text
        WebElement source = driver.findElement(By.xpath("//select[@name='industryEnumId']"));
        Select dropdown = new Select(source);
        dropdown.selectByVisibleText("Computer Software");
        //Select dropdown S-corporation from Ownership dropdown using select by visible text
        WebElement source1 = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
        Select dropdown1 = new Select(source1);
        dropdown1.selectByVisibleText("S-Corporation");
        
        //Select dropdown Employee from  source dropdown using select by index
        WebElement source3 = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
        Select dropdown3 = new Select(source3);
        dropdown3.selectByIndex(6);
        //Select dropdown US and Texas from  country,State and province using select by Value and visible text
        WebElement source4 = driver.findElement(By.xpath("//select[@id='generalCountryGeoId']"));
        Select dropdown4 = new Select(source4);
        dropdown4.selectByVisibleText("United States");
        
        WebElement source5 = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
        Select dropdown5 = new Select(source5);
        dropdown5.selectByValue("TX");
        //Click create account using attribute based Xpath
        driver.findElement(By.xpath("//input[@value='Create Account']")).click();
        //To print the title
        String Title = driver.getTitle();
        System.out.println(Title);
        //To close the browser
        driver.close();
        
        
      //input[@value='Create Account']
        
        
	}

}
