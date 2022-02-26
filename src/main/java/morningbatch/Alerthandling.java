package morningbatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	   WebElement alert=driver.findElement(By.xpath("//input[@name='alert']"));
	   alert.click();
	   Alert a=driver.switchTo().alert();
	   a.accept();
	   Thread.sleep(3000);
	   WebElement confirmation=driver.findElement(By.xpath("//input[@name='confirmation']"));
	   confirmation.click();
	   a.accept();
	   Thread.sleep(3000);
	   WebElement prompt=driver.findElement(By.xpath("//input[@name='prompt']"));
	   prompt.click();
	   a.sendKeys("lavanya");
	   a.accept();
	   
	   
	   
	   
	   
		

	}

}
