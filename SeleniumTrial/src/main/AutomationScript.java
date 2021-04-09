package main;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationScript {
	
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.id("aboutArrow")).click();
		driver.findElement(By.xpath("//a[text()='About']")).click();
		
		
		String expectedHeading = "Selenium is a suite of tools for automating web browsers.";
    	
    	String heading = driver.findElement(By.xpath("//section[@class='hero']//p")).getText();
    	System.out.println(heading);
    	if(expectedHeading.equals(heading))
          	{
    		System.out.println("The expected heading is same as actual heading --- "+heading);
    		
    		driver.navigate().back();
          	}
    	else {
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
          	
          	driver.navigate().back();
    	}
    	
	}

}
