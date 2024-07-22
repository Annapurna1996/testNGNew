package nopcommerce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	void testcase1() {
		System.out.println("testcase1");
		
	}
	
	@Test
	void testcase2() {
		System.out.println("testcase2");
		Assert.assertTrue(false);
		
	}

}
