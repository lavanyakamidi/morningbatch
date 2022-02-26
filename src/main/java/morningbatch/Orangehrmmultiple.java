package morningbatch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmmultiple {
	public static String parent,linkedin,facebook,twitter;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		String parent=driver.getWindowHandle();
	   driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
	   Set<String> all = driver.getWindowHandles();
	   Iterator<String> i = all.iterator();
	   String facebook="";
	   while(i.hasNext())
	   {
		 facebook=i.next();
		 if(!parent.equalsIgnoreCase(facebook))
		 {
			 driver.switchTo().window(facebook);
			 //facebook=i.next();
		 }
		 
	   }
		   
	   System.out.println(driver.getCurrentUrl());
	   driver.switchTo().window(parent);
	   
	   driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
	   all =driver.getWindowHandles();
	   i=all.iterator();
	   String twitter;
	   while(i.hasNext()) {
		   twitter=i.next();
		   if(twitter!=parent) {
			   if(twitter!=facebook) {
				   driver.switchTo().window(twitter);
					 //twitter=i.next();
				   
			   }
		   }
	   }
	   
	   System.out.println(driver.getCurrentUrl());
	   driver.switchTo().window(parent);
	   
	   
	   
	   
	   
		
	   
	   
		
		
		
		

	}


	private static void twitter() {
		// TODO Auto-generated method stub
		
	}

}
