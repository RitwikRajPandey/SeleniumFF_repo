package listeners;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



import WebElements.TakeScreenshot;
//import zmq.ZError.IOException;
	
	public class ListenerImplementation extends BaseClass implements ITestListener{

		@Override
		public void onTestFailure(ITestResult result) {
			Reporter.log("Test Script Filed",true);
			TakesScreenshot ts=(TakesScreenshot) driver;
			File temp=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshot/listerens");
			try
			{
				FileHandler.copy(temp, dest);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
						
		
	}

