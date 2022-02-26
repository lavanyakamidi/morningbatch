package morningbatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		//WebElement doubleclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		Actions a=new Actions(driver);
		//a.doubleClick(doubleclick).click().build().perform();
		WebElement rightclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		a.contextClick(rightclick).build().perform();
		WebElement cut = driver.findElement(By.xpath("//span[text()='Cut']"));
		a.moveToElement(rightclick).click().build().perform();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		

	}

}
