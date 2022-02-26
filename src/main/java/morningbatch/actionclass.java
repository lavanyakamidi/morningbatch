package morningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class actionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		WebElement username= driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement pwd= driver.findElement(By.xpath("//input[@name='txtPassword']"));
		WebElement button= driver.findElement(By.xpath("//input[@name='Submit']"));
		Actions a= new Actions(driver);
		a.sendKeys(username,"Admin").build().perform();
		a.sendKeys(pwd,"admin123").build().perform();
		a.click(button).build().perform();
		WebElement leave = driver.findElement(By.xpath("//b[text()='Leave']"));
		a.moveToElement(leave).click().build().perform();
		WebElement Entitlements = driver.findElement(By.xpath("//a[text()='Entitlements']"));
		a.moveToElement(Entitlements).click().build().perform();
		WebElement addEntitlements = driver.findElement(By.xpath("//a[text()='Add Entitlements']"));
		a.moveToElement(addEntitlements).click().build().perform();
		//a.moveToElement(leave).moveToElement(Entitlements).moveToElement(addEntitlements).click().build().perform();
		
		
		

		
		
	}

}
