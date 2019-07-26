import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Sample {
	@BeforeClass

		public static void openapp()
		{
				System.out.println("Before class");
			
		}
	@AfterClass
		public static void closeapp()
		{
			System.out.println("After Class");
		}
	
	@Before
	public void createacount()
	{
		
		System.out.println("Before");
		
	}
	
	@After
	public void closeaccount()
	{
		System.out.println("this is navin after")
		System.out.println("After");
	}
	
	
	@BeforeAll
	public void setup()
	{
		
		System.out.println("Before all");
	}
	
	@AfterAll
	public void teardown()
	{
		
		System.out.println("After all");
	}
	
	@Test //this annotation test method go internaly and call Main Method (It works like main method so no need to implement main method)
	public void test1()
	{
		System.out.println("maine method");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	
}
