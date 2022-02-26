package morningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IHGdropdownlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));
        Select s=new Select(dropdown);
        s.selectByIndex(4);
        s.selectByValue("AS");
        s.selectByVisibleText("Antarctica");
        
        
        

	}

}
