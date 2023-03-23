import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlUnitDriverConcept {
	
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://www.facebook.com/");
		String text=driver.getTitle();
		System.out.println(text);
		driver.findElement(By.id("email")).sendKeys("jha12@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		driver.findElement(By.name("login")).click();
	   String text1=driver.getTitle();
	   System.out.println(text1);
	   
	   //htmlunitdriver is not available in selenium 3.x version
	   //htmlunitdriver - to use this concept we have to download htmlunitdriver JAR file
	   
	   //ADVANTAGS::
	   //1.testing is happening bheind the scenes-no browser is launched
	   //2.very fast-execution of test cases -very fast -performance of the script
	   //3.not suitable for actions class-user actions-mousemovemnet,doubleclick,drag and drop
	   //4.Ghost driver-headless browser
	   //htmlunitdriver-java
	   //phantom js --javascript
	   
	   //jar 
	   //https://github.com/SeleniumHQ/htmlunit-driver/releases
	}

}
