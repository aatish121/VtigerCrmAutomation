package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Lead 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("appnavigator")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions action= new Actions(driver);
        action.moveToElement((WebElement) ele).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()=' Leads']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("Aatish");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("Dhawale");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_phone")).sendKeys("7774845763");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("Google");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys("7020667294");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("Emp");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_fax")).sendKeys("c");
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath("//select[@name='leadsource']"));
        Select s2 = new Select(ele2);
        s2.selectByValue("Employee");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_email")).sendKeys("adhawale78@gmail.com");
        Thread.sleep(2000);
        WebElement ele3 = driver.findElement(By.xpath("//select[@name='industry']"));
        Select s3 = new Select(ele3);
        s3.selectByValue("Engineering");
        driver.findElement(By.id("Leads_editView_fieldName_website")).sendKeys("https://about.google/");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_annualrevenue")).sendKeys("20000");
        Thread.sleep(2000);
        WebElement ele4 = driver.findElement(By.xpath("//select[@name='leadstatus']"));
        Select s4 = new Select(ele4);
        s4.selectByValue("Qualified");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_noofemployees")).sendKeys("222");
        Thread.sleep(2000);
        WebElement ele5 = driver.findElement(By.xpath("//select[@name='rating']"));
        Select s5 = new Select(ele5);
        s5.selectByValue("Acquired");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_secondaryemail")).sendKeys("adhawale78@gmail.com");
        Thread.sleep(2000);
        WebElement ele6 = driver.findElement(By.xpath("//select[@name='assigned_user_id']"));
        Select s6 = new Select(ele6);
        s6.selectByValue("3");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_lane")).sendKeys("Suncity");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_pobox")).sendKeys("90099");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_code")).sendKeys("987987");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_city")).sendKeys("Pune");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_country")).sendKeys("India");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_state")).sendKeys("Maharashtra");
        Thread.sleep(2000);
        driver.findElement(By.id("Leads_editView_fieldName_description")).sendKeys("I am Emp og hitachi since 2 years, Its always great to work with hitachi and am willing to countinue my work with Hitachi.");
        Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class='dropdown']")).click();
       Thread.sleep(2000);
        driver.findElement(By.linkText("Sign Out")).click();
	}

}
