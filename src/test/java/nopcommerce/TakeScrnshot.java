package nopcommerce;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScrnshot {
	WebDriver driver;
  @Test
  public void test1() throws IOException {
	   driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/?tag=googmantxtmob170-21&ascsubtag=_k_CjwKCAjw1920BhA3EiwAJT3lSZ3uJO2G6oPjksTXDEPJUr1dn2F2uLI-lAxaO1w8E8Ib69w_9K15OhoCZq8QAvD_BwE_k_");
	  driver.manage().window().maximize();
//	  TakesScreenshot tk = (TakesScreenshot) driver;
//	  File file =tk.getScreenshotAs( OutputType.FILE);
//	  FileUtils.copyFile(file,new File("./screenshots/myScrnshot.png"));
	  tkScrnshot();
	  driver.findElement(By.xpath("//a[text()='Best Sellers' and @class='nav-a  ']")).click();
	  tkScrnshot();
	  driver.close();
	  
  }
  
  public void tkScrnshot() throws IOException{
	  Date d1 = new Date();
	  long l = d1.getTime();
	  TakesScreenshot tk = (TakesScreenshot) driver;
	  File file =tk.getScreenshotAs( OutputType.FILE);
	  FileUtils.copyFile(file,new File("./screenshots/"+l+"myScrnshot.png"));
	  
  }
  
  
}
