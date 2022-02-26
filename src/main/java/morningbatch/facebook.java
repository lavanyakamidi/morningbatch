package morningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver",".//drivers//geckodriver.exe");
        //FirefoxDriver driver=new FirefoxDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.name("email")).sendKeys("lavanya");
        driver.findElement(By.id("pass")).sendKeys("lavanya");
        driver.findElement(By.name("login")).click();
        driver.findElement(By.linkText("Forgot password?")).click();
        
        
        
        
        
	}

}
