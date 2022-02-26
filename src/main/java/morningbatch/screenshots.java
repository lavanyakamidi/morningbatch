package morningbatch;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {
	static ChromeDriver driver;
	 static int i;

	 static screenshots s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		s=new screenshots();
		s.snap();
	
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		
		s.snap();
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		s.snap();
		
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		s.snap();
		
		
	}
	public void snap() {
		Random r=new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
				
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(".//images//pic"+i+".png");
		try {
			FileUtils.copyFile(src,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	

}
