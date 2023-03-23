import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Obectrepositry {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		/*
		 * WebDriverManager.edgedriver().setup(); WebDriver driver=new EdgeDriver();
		 * driver.get("https://www.facebook.com/");
		 */
		
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\cavin\\Documents\\Jhosna\\Practiceprograms1\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		
		String url=prop.getProperty("url");
		System.out.println(url);
		
		String browser=prop.getProperty("browser");
		
		System.out.println(browser);
		
		if(browser.equals("edge")) {
			
		
		WebDriverManager.edgedriver().setup();
		
		 driver=new EdgeDriver();
		// driver.get(url);
		}else if(browser.equals("gecko"))
		{
			WebDriverManager.firefoxdriver().setup();
			
			 driver=new FirefoxDriver();
		}else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			 driver=new ChromeDriver();
		}
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("email_path"))).sendKeys("Email");
		driver.findElement(By.xpath(prop.getProperty("pass_path"))).sendKeys("pass");
		driver.findElement(By.xpath(prop.getProperty("btn_path"))).click();
	}

}
