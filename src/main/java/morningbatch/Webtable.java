package morningbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement table = driver.findElement(By.xpath("//table[@id='webtable']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
	
		System.out.println(rows.size());
		for(int i=0;i<rows.size();i++) 
		{
			System.out.println(rows.get(i).getText());
			List<WebElement> cells=rows.get(i).findElements(By.tagName("td"));
			for(int j=0;j<cells.size();j++)
			{
				//System.out.println(cells.get(j).getText());
				if(cells.get(j).getText()=="Google")
{
	System.out.println(cells.get(j).getText());
}
}
			
			
		}

	}

}


