package testNGLearn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	@Test (groups = "Smoke")
	public void Test()  
	{
		System.out.println("Akm***");
	}
	@Test
	public void z() {
		System.out.println("print z method");
	}
	@Test
	public void x() {
		System.out.println("print x method");
	}
	@BeforeMethod
	public void login() {
		System.out.println("login");
		
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout");
		
	}
}
