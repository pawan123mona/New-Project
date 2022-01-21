package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib 
{
   public WebDriver driver;
   @BeforeMethod
   @Parameters("browser")
   public void preCondition(String browserName)
   {
       if(browserName.equalsIgnoreCase("Chrome"))
       {
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pawan\\workspace\\AspireAssignment\\exeFiles\\chromedriver.exe");
          driver=new ChromeDriver();
          Reporter.log("Chrome launched", true);
          
       }
       
	   driver.manage().window().maximize();
	   WaitStatementLib.implicitWaitForSecond(driver, 15);
	   driver.get(GetPropertyValues.getPropertyValue(".\\config.properties", "testURL"));
}
   @AfterMethod
   public void postCondition(ITestResult result)
   {
	   if(result.isSuccess())
	   {
		   Reporter.log("Script passed", true);
		   
	   }
	   else
	   {
		   String fileName = result.getMethod().getMethodName();
		   ScreenShotLib sLib=new ScreenShotLib();
		sLib.getScreenShot(driver, fileName);
		Reporter.log("Screenshot has been taken", true);
	   }
	   driver.close();
	   Reporter.log("Browser closed", true);
   }
}


