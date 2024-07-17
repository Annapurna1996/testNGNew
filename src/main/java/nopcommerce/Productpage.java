package nopcommerce;



import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class Productpage {
	
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Log in']")
	WebElement login;
	//driver.findElement(By.xpath("//a/span[text()='Log in']")).click();
	public void ClickLogin() {
		login.click();
	}
	@FindBy(xpath="//p[normalize-space()='Catalog']")
	WebElement Catalog;
	
	public void ClickOnCatalog() {
		Catalog.click();
	}
		
	@FindBy(xpath="//p[normalize-space()='Products']")	
	  WebElement pro;
	
	
	public void product() {
		pro.click();
	}
	@FindBy(xpath="//i[@class='far fa-angle-up']")
	WebElement prod;
	public void ProdClick() {
		prod.click();
	}
	@FindBy(xpath="//input[@id='SearchProductName']")
	WebElement proName;
	
	public void EnterName() {
		 proName.sendKeys("Portable sound speakers");
		
	}
	@FindBy(xpath="//a[@class='btn btn-primary']")
	WebElement addprdc;
	public void AddProduct() {
		addprdc.click();
	}
	@FindBy(xpath="//input[@id='Name']")
	WebElement EnterProduct;
	public void AddNewProduct() {
		EnterProduct.sendKeys("SS");
		
	}
	@FindBy(xpath="//button[@name='save']")
	WebElement save;
	public void ClickSave(){
		save.click();
	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissable']")
	WebElement text;
	public boolean popUp(){
	String actualtext = text.getText();
		System.out.println(actualtext);
	  boolean b=	actualtext.contains("product has been added successfully");
		
////		if(str.contains("product has been added successfully")) {
////			System.out.println("Successfully created");
////		}
////		else {
////			System.out.println("Failed to create");
////		}
//		//assertEquals(true,str.contains("product has been added successfully"), "Failed to contain text........");
//		//System.out.println("Sucessfully verified");
		boolean verifyPopup = text.isDisplayed();
		return verifyPopup;
	}

}
