import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {
	public static void main(String[] args) {
	
	//Browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
	//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
	//Open Application
		driver.get("https://www.facebook.com/");
		
	//Maximize
		driver.manage().window().maximize();
		
	//Print the title of the Application
		String title = driver.getTitle();
		System.out.println(title);
		
	//Print the current url of the Application 
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
	//find the locator of username field -> verify id = email
		WebElement txtUserName = driver.findElement(By.id("email"));
	// insert
		txtUserName.sendKeys("UserName");
		
	//Find the Locator of the password -> verify id = pass
		WebElement txtPassword = driver.findElement(By.id("pass"));
	// insert password
		txtPassword.sendKeys("Password@123");
		
	//login
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='1']"));
		btnlogin.click();
		
		
	}

}
