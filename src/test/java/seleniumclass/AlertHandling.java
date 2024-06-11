package seleniumclass;
import java.time.Duration;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("confirmbutton")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alertText");
		String expText = "Do you confirm action?";
		if (alertText.equals(expText))
		{
			System.out.println("alert text verified");
		}
			else {
				System.out.println("Validation Failed");
			}
		}

	}


