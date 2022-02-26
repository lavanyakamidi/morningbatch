package morningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class removeaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Actions a=new Actions(driver);
		a.sendKeys(username,Keys.SHIFT).keyDown(Keys.SHIFT).sendKeys("lavanya").keyUp(Keys.SHIFT).sendKeys("kamidi").build().perform();
		a.click(username).keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

	}

}
