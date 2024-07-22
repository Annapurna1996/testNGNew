package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SetUp {
	public static WebDriver driver;
  
  @BeforeMethod
  public void setUp() {
	   driver = new ChromeDriver();
  }
}
