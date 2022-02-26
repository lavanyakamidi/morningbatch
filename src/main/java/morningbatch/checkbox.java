package morningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='gender']")).isEnabled();
        driver.findElement(By.xpath("//input[@name='gender']")).isDisplayed();
        driver.findElement(By.xpath("//input[@name='gender']")).isSelected();
        
        
        System.out.println(driver.findElement(By.xpath("//input[@name='gender']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//input[@name='gender']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//input[@name='gender']")).isSelected());

     
      
        driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']")).isEnabled();
        driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']")).isDisplayed();
      driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']")).isSelected();
      
      System.out.println(driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']")).isEnabled());
      System.out.println(driver.findElement(By.xpath("//input[@name='gender']")).isDisplayed());
      System.out.println(driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']")).isSelected());

   

	}

}