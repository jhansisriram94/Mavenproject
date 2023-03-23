import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("testing");
		System.out.println("Jhansi");

}
}
