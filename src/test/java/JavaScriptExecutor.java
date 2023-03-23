import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("jha12@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		WebElement loginbtn=driver.findElement(By.name("login"));
		
		flash(loginbtn, driver);
	}

	
	
	public static void flash(WebElement element ,WebDriver driver)
	{
		JavaScriptExecutor js=(JavaScriptExecutor)driver;//Javascriptexecutor is a class have to create object
		String bgvcolor=element.getCssValue("backgroundColor");
		changecolor("rgb(0,200,0)", element, driver);//1
		changecolor(bgvcolor, element, driver);//2
	}

	
	public static void changecolor(String color,WebElement element,WebDriver driver)
	{
		JavaScriptExecutor js=(JavaScriptExecutor)driver;
		//js.executeScript("arguments[0].style.backgroundColor ='"+color+"'",element);
		
		try {
			Thread.sleep(20);
			
		} catch (Exception e) {
			
		}
		
	}
}

