package nopcommerce;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Mylisteners.class)
@Test(retryAnalyzer=Mylisteners.class )


public class Rtests extends SetUp {
	//I want to execute multiple times,failed test cases

	//@Test(retryAnalyzer=Mylisteners.class )
	  public void test1() {
			driver.get("https://www.facebook.com/login/");
			Assert.assertTrue(true);
			//assertTrue(false);
			//takeScreen()
			System.out.println("Hello World");
		}
		@Test
		public void test2() {
			driver.get("https://google.com");
			Assert.assertTrue(false);
			System.out.println("hello java");
		}
		@Test
		public void test3() {
		driver.get("https://amazon.in");
			Assert.assertTrue(false); 
			System.out.println("Hello amazon");
		}

	
  }
  

