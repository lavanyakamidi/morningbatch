package morningbatch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ihgmulti {
	public static String parent,linkedin,facebook,twitter;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("firstName")).sendKeys("lavanya");
		driver.findElement(By.id("lastName")).sendKeys("kamidi");
		parent=driver.getWindowHandle();
		System.out.println("parent handle : "+parent);
		driver.findElement(By.className("pEight")).click();
		Set<String> all = driver.getWindowHandles();
		Iterator<String> i = all.iterator();
		while(i.hasNext())
		{
			linkedin=i.next();
			System.out.println("before :"+i.next());
			if(!parent.equalsIgnoreCase(linkedin))
			{
				System.out.println("In If : "+i.next());
			driver.switchTo().window(linkedin);
			}
			
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//img[@alt='Facebook']")).click();
		all = driver.getWindowHandles();
		i = all.iterator();				
		while(i.hasNext())
		{
			facebook=i.next();
			if(!parent.equalsIgnoreCase(facebook))
			{
			driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(linkedin);
		driver.findElement(By.xpath("//img[@alt='Twitter']")).click();
		all = driver.getWindowHandles();
		i = all.iterator();	
		while(i.hasNext())
		{
			twitter=i.next();
			if(!parent.equalsIgnoreCase(twitter))
			{
			driver.switchTo().window(twitter);
			}
			
		}
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
		
				
		


	}

}
