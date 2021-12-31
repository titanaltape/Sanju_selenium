import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		
	//Browser configuration
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
	//Launch the Browser
		WebDriver driver = new ChromeDriver();
		
	//Open Application
		driver.get("https://www.swiggy.com/");
		
	//Maximize
		driver.manage().window().maximize();
		
	//Print the title of the Application
		String title = driver.getTitle();
		System.out.println(title);
		
	//Print the current url of the Application 
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
	//find the locator of location field -> verify id = text
		WebElement location = driver.findElement(By.id("text"));
			// insert
		location.sendKeys("Thoraipakkam");
	}

}
