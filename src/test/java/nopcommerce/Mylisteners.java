package nopcommerce;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IRetryAnalyzer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Mylisteners extends SetUp implements IRetryAnalyzer,ITestListener {
  @Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	  tkScrn();
	}
	//how many times we want to execute failed test
	int count=0;
	int retryCount=3;
@Override
public boolean retry(ITestResult result) {
	// TODO Auto-generated method stub
	if(count<retryCount) {
		count++;
		return true;
	}
	return false;
}
public void tkScrn() {

	Date d1 = new Date();
	  long l = d1.getTime();
	  TakesScreenshot tk = (TakesScreenshot) driver;
	  File file =tk.getScreenshotAs( OutputType.FILE);
	  try {
		FileUtils.copyFile(file,new File("./screenshots/"+l+"myScrnshot.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}
