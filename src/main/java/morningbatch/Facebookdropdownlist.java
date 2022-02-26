package morningbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdownlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_US&display=page");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("lavanya");
		driver.findElement(By.name("lastname")).sendKeys("kamidi");
		driver.findElement(By.name("reg_email__")).sendKeys("8238036278");
		driver.findElement(By.name("reg_passwd__")).sendKeys("lav123");
		 WebElement dropdown=driver.findElement(By.xpath("//select[@id='month']"));
	        Select s=new Select(dropdown);
	        s.selectByIndex(9);
	       // WebElement dropdown1=driver.findElement(By.xpath("//select[@id='day']"));
	       // Select b=new Select(dropdown1);
	        //b.selectByVisibleText("15");
	       // dropdown2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	       //select y=new Select(dropdown2);
	       // y.selectByValue("2008");
	       
	        List<WebElement> opt = s.getOptions();
	    	System.out.println(opt.size());
	    	/*Iterator<WebElement> it = opt.iterator();
	    	while(it.hasNext())
	    	{
	    	System.out.println(it.next().getText());	
	    	}
	    	*/
	    	for(WebElement each:opt)
	    	{
	    	System.out.println(each.getText());	
	    	}

		
	}

}
