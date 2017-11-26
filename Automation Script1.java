package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\CHROME DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Login to Trello
		driver.get("https://trello.com");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/a[1]")).click();
		driver.findElement(By.id("user")).sendKeys("prasath.1502@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("tester123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(4000);
		// Create New Board
		driver.findElement(By.cssSelector(".board-tile.mod-add>span")).click();
		driver.findElement(By.cssSelector("#boardNewTitle")).sendKeys("board1");
		driver.findElement(By.cssSelector(".primary.wide.js-submit")).click();
		Thread.sleep(4000);
		// Create List 1 in Board
		driver.findElement(By.cssSelector(".list-name-input")).sendKeys("To Do");
		driver.findElement(By.cssSelector(".primary.mod-list-add-button.js-save-edit")).click();
		Thread.sleep(4000);
		// Create List 2 in Board
		driver.findElement(By.cssSelector(".list-name-input")).sendKeys("Doing");
		driver.findElement(By.cssSelector(".primary.mod-list-add-button.js-save-edit")).click();
		Thread.sleep(4000);
		// Create List 3 in Board
		driver.findElement(By.cssSelector(".list-name-input")).sendKeys("Done");
		driver.findElement(By.cssSelector(".primary.mod-list-add-button.js-save-edit")).click();
		Thread.sleep(4000);
		// Adding a Card to List 1 
		driver.findElement(By.xpath(".//*[@id='board']/div[1]/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='board']/div[1]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Requirement walkthrough");
		driver.findElement(By.xpath(".//*[@id='board']/div[1]/div/div[2]/div/div[2]/div[1]/input")).click();
		
	    // Adding a Card to List 2
		driver.findElement(By.xpath(".//*[@id='board']/div[2]/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='board']/div[2]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Test Execution");
		driver.findElement(By.xpath(".//*[@id='board']/div[2]/div/div[2]/div/div[2]/div[1]/input")).click();
		
		// Adding a Card to List 3
		driver.findElement(By.xpath(".//*[@id='board']/div[3]/div/a")).click();
		driver.findElement(By.xpath(".//*[@id='board']/div[3]/div/div[2]/div/div[1]/div/textarea")).sendKeys("Signoff");
		driver.findElement(By.xpath(".//*[@id='board']/div[3]/div/div[2]/div/div[2]/div[1]/input")).click();
	
		Thread.sleep(4000);
		//Close browser
		driver.close();
		
		
		
	}

}
