package morningbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/'");
		js.executeScript("document.getElementById('txtUsername').value='Admin';");
		js.executeScript("document.getElementById('txtPassword').value='admin123';");
		js.executeScript("document.getElementById('btnLogin').click();");
		String url="";
		url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		String title="";
		title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		js.executeScript("window.scrollBy(0,700)");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,-300)");
		
		
		
		
		

	}

}
