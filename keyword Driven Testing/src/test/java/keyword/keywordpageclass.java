package keyword;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class keywordpageclass {
	WebDriver driver;
	String URL;
	public keywordpageclass(String url){
		URL = url;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

	}
	
	public void openbrowser() throws InterruptedException 
	{
//		driver= new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		//driver.manage().wait(2000);
		//driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	
	
	public void navigate() throws InterruptedException 
	{
		driver.get(URL);
		
	}
     
	public void searchfullname() throws InterruptedException {
		driver.findElement(By.xpath("(//*[@type=\"text\"])[1]")).sendKeys("Shikha Ray");
	
	}
	
	public void searchrediffid() {
		driver.findElement(By.xpath("(//*[@type=\"text\"])[2]")).sendKeys("admin123");
	}
	
	public void enterpassword() throws InterruptedException {
		driver.findElement(By.xpath("(//*[contains(@name,'passwd')])[1]")).sendKeys("Admin@123");
        
	}
	
	public void retypepassword() throws InterruptedException {
		driver.findElement(By.xpath("(//*[contains(@name,'passwd')])[2]")).sendKeys("Admin@123");
		 	
	}
	public void enteremail() {
		driver.findElement(By.xpath("(//*[contains(@name,'altemail')])[1]")).sendKeys("admin234@mail.com");
	}
	
	public void entermobileno() {
		driver.findElement(By.xpath("(//*[contains(@name,'mobno')])[1]")).sendKeys("9429045876");
	}
	
	public void enterdob() throws InterruptedException {
		WebElement dropdown=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select select = new Select(dropdown);
		select.selectByValue("06");
		
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select dobm = new Select(month);
		dobm.selectByValue("12");
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select doby = new Select(year);
		doby.selectByValue("2020");
		
		List<WebElement> values = driver.findElements(By.tagName("option"));
	    System.out.println("Total count is: " +values.size());
	    System.out.println(values.get(10).getText());
	    
	}
	
    public void entergender() throws InterruptedException {
    	driver.findElement(By.xpath("(//*[contains(@name,'gender')])[2]")).click();
    	//driver.findElement(By.xpath("//input[@value=\"f\"]")).click();
    		
    }
    
    
    public void entercountry() {
    	WebElement country=driver.findElement(By.xpath("(//*[contains(@name,'country')])[2]"));
		Select select = new Select(country);
		select.selectByValue("4");
    }

   
    public void clickcreatemyaccount() throws InterruptedException {
   	   driver.findElement(By.id("Register")).click();
   	   Thread.sleep(2000);
    }
    
    
     public void closebrowser() {
    	 
    	Alert alert =driver.switchTo().alert();
    	String alertMessage= driver.switchTo().alert().getText(); // capture alert message

    	System.out.println(alertMessage);
    	alert.accept();
    	
    	driver.close();
    }
    
    
    
    
    
    
    
    
    
    }