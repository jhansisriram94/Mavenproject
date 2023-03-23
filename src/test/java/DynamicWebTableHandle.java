import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTableHandle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		String before_xpath="//*[@id=\"customers\"]/tbody/tr[";
		String After_xpath="]/td[1]";
		
		//Method 1::
		/*
		 * for (int i = 2; i <=7; i++) { String
		 * text=driver.findElement(By.xpath(before_xpath+i+After_xpath)).getText();
		 * System.out.println(text); if(text.contains("Ernst Handel")) {
		 * System.out.println("printing whatever the cell we want"); String
		 * text2=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+
		 * "]/td[1]")).getText(); System.out.println(text2); }
		 * 
		 * 
		 * 
		 * }
		 */
		
		//Method 2::
		
		String text=driver.findElement(By.xpath("//td[contains(text(),'Ernst Handel')]")).getText();
		System.out.println(text);

}
}
