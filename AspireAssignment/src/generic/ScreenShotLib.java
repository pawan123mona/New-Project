package generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShotLib {
    public void getScreenShot(WebDriver driver,String fileName)
    {
    	EventFiringWebDriver efw=new EventFiringWebDriver(driver);
    	File srcFile = efw.getScreenshotAs(OutputType.FILE);
		File decFile=new File(".\\screenshots\\"+fileName+".png");
		try {
			FileUtils.copyFile(srcFile, decFile);
		} catch (IOException e) {

			e.printStackTrace();
		}
    }
}
