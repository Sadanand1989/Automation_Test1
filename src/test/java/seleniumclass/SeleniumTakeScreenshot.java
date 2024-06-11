package seleniumclass;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import org.openqa.selenium.*;
public class SeleniumTakeScreenshot {


		 public static void main(String args[]) throws IOException {
		        WebDriver driver = new ChromeDriver();
		        driver.get("http://www.example.com");
		        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        Object FileUtils;
				((Object) FileUtils).copyFile(scrFile, new File("./image.png"));
		        driver.quit();
		    }
		
		  
	}

	
