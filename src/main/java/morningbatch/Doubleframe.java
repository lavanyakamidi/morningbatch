package morningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.support.ui.Select;

public class Doubleframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		WebElement textfield = driver.findElement(By.xpath("//b[text()='Topic :']/following::input"));
		textfield.sendKeys("framesexamples");
		driver.switchTo().frame("frame3");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='animals']"));
		Select a=new Select(dropdown);
		a.selectByValue("babycat");
		//checking git pull testing
		//checking for git commit 
		
		
				
		
		
		
		
		

	}

}
