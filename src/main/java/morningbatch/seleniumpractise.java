package morningbatch;

import java.awt.Label;

import javax.swing.text.AttributeSet;
import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumpractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstname")).sendKeys("lavanya");
		driver.findElement(By.id("email")).sendKeys("l@gmail.com");
		driver.findElement(By.name("address")).sendKeys("royal lane");
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='city']"));
		Select a=new Select(dropdown);
		a.selectByIndex(2);
		 WebElement dropdown1=driver.findElement(By.xpath("//select[@name='state']"));
	        Select s=new Select(dropdown1);
	        s.selectByIndex(1);
	        driver.findElement(By.id("zip")).sendKeys("12345");
	        driver.findElement(By.id("expyear")).sendKeys("2024");
	        driver.findElement(By.id("cvv")).sendKeys("123");
	        driver.findElement(By.name("cardname")).sendKeys("lavanya kamidi");
	        driver.findElement(By.name("cardnumber")).sendKeys("1233456");
	        driver.findElement(By.name("expmonth")).sendKeys("december");
	        WebElement dropdown2= driver.findElement(By.xpath("//select[@name='Hobbies']"));
	       Select b=new Select(dropdown2);
	       b.selectByIndex(2);
	       
	       
	       
	        
	        
	        

	        
	        

	        

		

		
		
		

	}

}
