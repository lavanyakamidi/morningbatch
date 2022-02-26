package morningbatch;

import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		//driver.findElement(By.id("custom")).click();
	  WebElement multidrop=driver.findElement(By.xpath("//select[@id='second']"));
	       Select s=new Select(multidrop);
	        s.selectByIndex(2);
	        s.selectByValue("donut");
	        s.deselectAll();
	        List<WebElement> opt = s.getOptions();
	    	System.out.println(opt.size());
	    	for(WebElement each:opt)
	    	{
	    	System.out.println(each.getText());	
	    	}

	        
	        
	      	}

}
