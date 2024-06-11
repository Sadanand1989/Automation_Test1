package seleniumclass;

import org.testng.annotations.*;

public class TestClass {
	@Test
public void test() {
	System.out.println("Hello");
}
	@BeforeTest
	public void Testbefore() {
		System.out.println("Hello Before");
	}
	@AfterTest
	public void Testafter() {
		System.out.println("Hello after");
	}
}
