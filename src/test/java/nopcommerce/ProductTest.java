package nopcommerce;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductTest {
	//private static final boolean False = false;
	//private static final boolean True = false;
	static WebDriver driver;
	Productpage pp;
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
	}
	@Test(priority=1)
	public void clicklogin() {
		//a/span[text()='Log in']
		
		//driver.findElement(By.xpath("//a/span[text()='Log in']")).click();
		 //Productpage pp = new Productpage(driver);
		 pp = new Productpage(driver);
		 pp.ClickLogin();
		
	}
	@Test(priority=2)
	public void clickCatalog() {
		pp = new Productpage(driver);
		pp.ClickOnCatalog();
		
	}
	@Test(priority=3)
	public void product() {
       pp = new Productpage(driver);
		pp.product();
	}
	@Test(priority=4)
	public void clickProArrow() {
	 pp = new Productpage(driver);
		pp.ProdClick();
		
	}
	@Test(priority=5)
	public void EnterName() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Productpage pp = new Productpage(driver);
		pp.EnterName();
	}
	@Test(priority=6)
	public void AddPRoduct() {
		 pp = new Productpage(driver);
		pp.AddProduct();
		
	}
	@Test(priority=7)
	public void AddNewProduct() {
		pp = new Productpage(driver);
		pp.AddNewProduct();
	}
	@Test(priority=8)
	public void Save() {
     pp = new Productpage(driver);
		pp.ClickSave();
		//String text =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText();
		//System.out.println("Text is: "+text);
		//pp.getText();
		//assertEquals(true,text.contains("product has been added successfully"), "Failed to contain text........");
		//System.out.println("Sucessfully verified");
		
		
	}
	@Test(priority=9)
	public void GetText() {
		   pp = new Productpage(driver);
		   pp.popUp();
		  // String actualtext;
			//String excepted = "The new product has been added successfully";
		// Assert.assertEquals(true,pp.popUp(), "Failed to contain text........");
//			//System.out.println("Sucessfully verified");
			
		   System.out.println();
		  assertTrue(pp.popUp(),"Failed to display popup");
		  System.out.println("pop up displayed");
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	

}
