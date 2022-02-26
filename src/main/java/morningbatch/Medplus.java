package morningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Medplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("myText")).sendKeys("lavanya");
		//driver.findElement(By.id("linkadd")).click();
		driver.findElement(By.className("home-tril-email-btn")).click();
		
		
		
		
		
		

	}

}
