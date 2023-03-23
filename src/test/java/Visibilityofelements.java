import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Visibilityofelements {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		//isdisplayed- its applicable for all the elements if the element is present it will return true otherwise it will give fail
		boolean button=driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
		System.out.println(button);
		
		//Isenabled- for buttons --if we select the checkbox it will highlight the button (enabled) otherwise disabled 
		//isdisplayed,isenabled,isselected- return type is boolean 
		
		boolean enablebutton=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(enablebutton);
		
		//isselected-it is applicable for checkbox,radiobutton,dropdown
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		boolean selected=driver.findElement(By.xpath("(//input[@name='sex'])[1]")).isSelected();
		System.out.println(selected);//true
		
		//Deselecte the element
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		boolean deselected=driver.findElement(By.xpath("(//input[@name='sex'])[1]")).isSelected();
		System.out.println(deselected);//true
		
		
		
		
		
	}

}
