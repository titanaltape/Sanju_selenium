import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
public static void main(String[] args) {
		
		//Browser configuration
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
		//Launch the Browser
			WebDriver driver = new ChromeDriver();
			
		//Open Application
			driver.get("http://greenstech.in/selenium-course-content.html");
			
		//Maximize
			driver.manage().window().maximize();
			
		//Print the title of the Application
			String title = driver.getTitle();
			System.out.println(title);
			
		//Print the current url of the Application 
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
			
			WebElement txtOverview = driver.findElement(By.xpath("//span [@title='Overview']"));
			txtOverview.click();
			String data = txtOverview.getText();
			System.out.println(data);

			}
}
