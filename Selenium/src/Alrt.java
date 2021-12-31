import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alrt {
	public static void main(String[] args) {
		
		//Browser configuration
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
			
		//Launch the Browser
			WebDriver driver = new ChromeDriver();
			
		//Open Application
			driver.get("http://demo.automationtesting.in/Alerts.html#Textbox");
			
		//Maximize
			driver.manage().window().maximize();
			
		//Print the title of the Application
			String title = driver.getTitle();
			System.out.println(title);
			
		//Print the current url of the Application 
			String currenturl = driver.getCurrentUrl();
			System.out.println(currenturl);
			
			WebElement btnclick = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
			btnclick.click();
			
			Alert al = driver.switchTo().alert();
			String data = al.getText();
			
			al.sendKeys("San");
			al.accept();
			
			WebElement txtPrint = driver.findElement(By.xpath("(//p[@id='demo']"));
			String txtdata = txtPrint.getText();
			System.out.println(txtdata);
	}

}
