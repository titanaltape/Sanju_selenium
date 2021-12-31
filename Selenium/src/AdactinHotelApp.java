import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelApp {
	public static void main(String[] args) throws AWTException {
		
		//Browser configuration
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
		//Launch the Browser
			WebDriver driver = new ChromeDriver();
			
		//Open Application
			driver.get("https://adactinhotelapp.com");
			
		//Maximize
			driver.manage().window().maximize();
			
		//Print the title of the Application
			String title = driver.getTitle();
			System.out.println(title);
			
		//Print the current url of the Application 
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
			
			WebElement txtCondition = driver.findElement(By.xpath("//p[@style='text-align:center;']"));
			String data = txtCondition.getText();
			System.out.println(data);
			
			Robot robot = new Robot();
			
			for(int i=1; i<4; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
			}
			
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);

			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);

			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);

			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);

			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			
			for(int i=1; i<3; i++) {
				robot.keyPress(KeyEvent.VK_TAB);
				robot.keyRelease(KeyEvent.VK_TAB);
			}
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
	}
			

}
