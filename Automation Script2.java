package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	// Login to Trello website
		driver.get("https://trello.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.id("user")).sendKeys("prasath.1502@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("tester123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(4000);
		
	// Select a board
		driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div/div/div[1]/ul/li[1]/a/span[2]")).click();
		Thread.sleep(4000);
		
	// Select and action a card in List - To do 
	
		driver.findElement(By.xpath(".//*[@id='board']/div[1]/div/div[2]/a/div[3]/span")).click();
				
		// Adding a Description
		//driver.findElement(By.partialLinkText("Edit")).click();	                             
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[1]/div[7]/div/div[3]/textarea")).sendKeys("Walkthrough for Phase 1");
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[1]/div[7]/div/div[3]/div/input")).click();
		
		// Adding a Comment 
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[6]/div[2]/form/div[1]/div/textarea")).sendKeys("Planned for 2018");
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[6]/div[2]/form/div[2]/input")).click();

		/// Adding a color label
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[6]/div[1]/div/a[2]")).click();
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div/div/div/ul/li[1]/span")).click();
		driver.findElement(By.xpath("html/body/div[4]/div/div/a")).click();
		


	// Select and action a card in List - Doing
			
		driver.findElement(By.xpath(".//*[@id='board']/div[2]/div/div[2]/a/div[3]/span")).click();
					
		// Adding a Description 
		//driver.findElement(By.partialLinkText("Edit")).click();	
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[1]/div[7]/div/div[3]/textarea")).sendKeys("Test Execution");
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[1]/div[7]/div/div[3]/div/input")).click();
			
		// Adding a Comment 
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[6]/div[2]/form/div[1]/div/textarea")).sendKeys("Planned completion Q4 2017");
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[6]/div[2]/form/div[2]/input")).click();
			
		// Adding a color label 
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[6]/div[1]/div/a[2]")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div/div/div/ul/li[2]/span")).click();
		driver.findElement(By.xpath("html/body/div[4]/div/div/a")).click();
		
	
	// Select and action a card in List - Done
					
		driver.findElement(By.xpath(".//*[@id='board']/div[3]/div/div[2]/a/div[3]/span")).click();
		
			
		// Adding a Description
		//driver.findElement(By.partialLinkText("Edit")).click();	
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[1]/div[7]/div/div[3]/textarea")).sendKeys("Signoff Cycle 1");
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[1]/div[7]/div/div[3]/div/input")).click();
			
		// Adding a Comment 
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[6]/div[2]/form/div[1]/div/textarea")).sendKeys("Signoff by UAT Team");
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[5]/div[6]/div[2]/form/div[2]/input")).click();
			
		// Adding a color label 
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[6]/div[1]/div/a[2]")).click();
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("html/body/div[5]/div/div[2]/div/div/div/ul/li[1]/span")).click();	
	

		
		driver.close();

	}

}
