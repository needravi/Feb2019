package javaPractise;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public WebDriver driver;
	
	@BeforeMethod
	void openBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	}
	
	@AfterMethod
	
	void closeBrowser() {
		driver.close();
	}
	
	@Test
	void bs() throws Exception {
				
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();		

//		Actions act = new Actions(driver);
		
//		Select s1 = new Select("");
//		s1.selectByIndex(2); 
		
//		Robot r1 = new Robot();
//		r1.keyPress(KeyEvent.VK_CONTROL);
		
		WebElement rings = driver.findElement(By.xpath("//a[text()='Rings ']"));
		Thread.sleep(2000);
//		act.moveToElement(rings).build().perform();
		
//		Select s1 = new Select(rings);
//		s1.selectByIndex(2);
//		s1.selectByValue("ts");
//		s1.deselectByVisibleText("hd");
//		
		
		
		List<WebElement> text = driver.findElements(By.xpath("//div[@class='col-inner']"));
		System.out.println(text.size());
		for (WebElement t1 : text) {
			
		Reporter.log(t1.getText(), true);
									
	 	}
		/*String t = driver.findElement(By.xpath("//a[text()='Solitaire']")).getText();
		Reporter.log(t,true);
		
		for(int i = 0; i< t.length()-1;i++) 
		{
			driver.findElements(By.xpath(""));
		}
	*/	
	}
	
}
