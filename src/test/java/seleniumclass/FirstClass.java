package seleniumclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.google.com");
 Thread.sleep(2000);
 driver.manage().window().maximize();
 Thread.sleep(2000);
 driver.navigate().to("https://www.facebook.com");
 String str= driver.getTitle();
 if (str.equals("Facebook -log in or sign up"))
 {
	 System.out.println("Pass");
 
 }
 else {
	 
  System.out.println("Fail");
 }
	}

	}

