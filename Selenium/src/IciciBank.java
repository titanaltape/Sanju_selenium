import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) {
		
		//Browser configuration
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
		//Launch the Browser
			WebDriver driver = new ChromeDriver();
			
		//Open Application
			driver.get("https://infinity.icicibank.com/corp/Login.jsp");
			
		//Maximize
			driver.manage().window().maximize();
			
		//Print the title of the Application
			String title = driver.getTitle();
			System.out.println(title);
			
		//Print the current url of the Application 
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
			
		//find the locator of username field -> verify id = text
			WebElement txtUserName = driver.findElement(By.id("text"));
		// insert
			txtUserName.sendKeys("text");
			
		//Find the Locator of the password -> verify id = password
			WebElement txtPassword = driver.findElement(By.id("password"));
		// insert password
			txtPassword.sendKeys("Password@123");
	}
}
