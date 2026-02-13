package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//enter the uName
		driver.findElement(By.id("username")).sendKeys("democsr2");
        //enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on crmsfa
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click on leads
		driver.findElement(By.linkText("Leads")).click();
		//Click on create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafV");
		//Enter FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidhya");
		//Enter LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Varadarajan");
		//Locate the SourceDD
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//instantiate the select  class
		Select sel=new Select(sourceDD);
		//SelectBy index method
		sel.selectByIndex(4);
		//Locate marketing campaign
		WebElement sourceDD1= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		//instantiate the select  class
		Select sel1=new Select(sourceDD1);
		//Select ByvisibleText
		sel1.selectByVisibleText("Automobile");
		//Locate the Ownership
		WebElement sourceDD2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//instantiate the select select class
		Select sel2=new Select(sourceDD2);
		sel2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		//get the title of page
		String title = driver.getTitle();
		System.out.println(title);
		//close the browser
		driver.close();
	}

}
