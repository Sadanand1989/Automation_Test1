package seleniumclass;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class Facebook {
	    
	    WebDriver driver = new ChromeDriver ();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.facebook.com");

	   
	    

	    @Test(priority = 1)
	    public void verifyTitle() {
	        String expectedTitle = "Facebook";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch");
	    }

	  

	    @Test(priority = 2)
	    public void verifyLoginButton() {
	        boolean isLoginButtonPresent = driver.findElement(By.id("loginButton")).isDisplayed();
	        Assert.assertTrue(isLoginButtonPresent, "Login button not found");

	        // Test login button functionality
	    }

	    @Test(priority = 3)
	    public void verifyCreateNewAccountButton() {
	        boolean isCreateNewAccountButtonPresent = driver.findElement(By.id("createAccountButton")).isDisplayed();
	        Assert.assertTrue(isCreateNewAccountButtonPresent, "Create New Account button not found");

	        // Test create new account button functionality
	    }

	  
	}

}
