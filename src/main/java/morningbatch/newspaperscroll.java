package morningbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class newspaperscroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location = 'https://www.star-telegram.com/'");
		driver.manage().window().maximize();
		String url="";
		url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		String title="";
		title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		js.executeScript("window.scrollBy(0,3000)");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,-100)");
		js.executeScript("window.scrollBy(10,0)");
		
		

	}

}
