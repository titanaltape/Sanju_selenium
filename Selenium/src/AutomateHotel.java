import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomateHotel {
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
		//Username id
			WebElement txtUserName = driver.findElement(By.id("username"));
			txtUserName.sendKeys("Titanaltape");
		//Password
			WebElement txtPassword = driver.findElement(By.id("password"));
			txtPassword.sendKeys("qwerty12345");
		//login
			WebElement btnlogin = driver.findElement(By.xpath("//input[@name='login']"));
			btnlogin.click();
			
		//page2
		//Location
			WebElement dDnLocation = driver.findElement(By.id("location"));
			Select select = new Select(dDnLocation);
			select.selectByIndex(1);
		//hotel
			WebElement dDnHotel = driver.findElement(By.id("hotels"));
			Select select1 = new Select(dDnHotel);
			select.selectByIndex(1);
		//room
			WebElement dDnRoomType = driver.findElement(By.id("room_type"));
			Select select2 = new Select(dDnRoomType);
			select.selectByIndex(1);
		//Number of room
			WebElement dDnNoOfRoom = driver.findElement(By.id("search_combobox"));
			Select select3 = new Select(dDnNoOfRoom);
			select.selectByIndex(1);
	}
}
