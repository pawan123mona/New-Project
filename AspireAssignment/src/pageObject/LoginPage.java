package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage 
{
  @FindBy(xpath="//input[@type='text']")
  private WebElement unTxtBx;
  @FindBy(xpath="//input[@type='password']")
  private WebElement pwdTxtBx;
  @FindBy(xpath="//button[@type='submit']")
  private  WebElement loginBtn;
  
  public LoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	
  }
  public void login(String username, String password)
  {
	  unTxtBx.sendKeys("user@aspireapp.com");
	  pwdTxtBx.sendKeys("@sp1r3app");
	  loginBtn.click();
  }
}
