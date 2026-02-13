package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	
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
	        //Click Leads by textbased Xpath
	        driver.findElement(By.xpath("//a[text()='Leads']")).click();
	        //Click Create Lead by textpath Xpath
	        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	        //Enter Company Name using Attribute based xpath 
	        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS_V5");
	        //Enter firstName using Attribute based Xpath
	        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vidhya_Editlead5");
	        //Enter last name using Attribute based xpath
	        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("V_EditLead5");
	        //Enter FirestName Local using Attribute based xpath
	        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("vid5");
	        //Enter department field using any locator
	        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT5");
	        //Enter Description field using any locator
	        driver.findElement(By.id("createLeadForm_description")).sendKeys("IT Services5");
	        //Enter email id using any locator
	        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vidhyav5.01@gmail.com");
	        //Select Newyork state using select by Visibletext
	        WebElement source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	        Select state = new Select(source);
	        state.selectByVisibleText("New York");
	        //Click Create Lead Button
	    	driver.findElement(By.className("smallSubmit")).click();
	    	//Click on edit Lead
	    	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	    	//clear the description text from the field
	    	driver.findElement(By.id("updateLeadForm_description")).clear();
	        //Update the text in important description field
	        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Update the field for testing");
	        //Click on Update Button
	        driver.findElement(By.xpath(" (//input[@name='submitButton'])[1]")).click();
	        //Get the title of the page
	        String title =driver.getTitle();
	        System.out.println(title);
	        //CLose the browser 
	        driver.close();
	        
	        
	        
	      

	}

}
