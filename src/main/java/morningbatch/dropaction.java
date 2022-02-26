package morningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement Accept = driver.findElement(By.xpath("//a[text()='Accept']"));
		a.moveToElement(Accept).click().build().perform();
		
		//WebElement source= driver.findElement(By.xpath("//div[@id='acceptable']"));
	    WebElement source= driver.findElement(By.xpath("//div[@id='notAcceptable']"));
		WebElement dest= driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source,dest).build().perform();
		//a.dragAndDrop(source1, dest).build().perform();



	}

}
