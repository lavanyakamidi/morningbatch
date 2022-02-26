package morningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class OrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\AutomationProjects\\morningbatch\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("email")).sendKeys("lavanya");
		driver.findElement(By.id("pass")).sendKeys("lavanya123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgot password?")).click();
		
		
		//driver.findElement(By.linkText("Forgot password?")).click();
		

	
		
		

	}

}
