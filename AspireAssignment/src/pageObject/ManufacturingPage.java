package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManufacturingPage 
{
   @FindBy(xpath="//div[text()='Manufacturing']")
   private WebElement manufacturingBtn;
   @FindBy(xpath="//button[@class='btn btn-primary o_list_button_add']")
   private WebElement createBtn;
   @FindBy(xpath="(//input[@class='o_input ui-autocomplete-input'])[1]")
   private WebElement productDropdwn;
   @FindBy(xpath="//a[text()='New Product']")
   private WebElement searchedTxt;
   @FindBy(xpath="(//input[@class='o_input ui-autocomplete-input'])[3]")
   private WebElement billOfMaterialTxt;
   @FindBy(xpath="//span[text()='Create']")
   private WebElement createBillMaterial;
   @FindBy(xpath="//span[text()='Save']")
   private WebElement saveBtn;
   @FindBy(xpath="//a[text()='Add a line']")
   private WebElement addaLineBtn;
   @FindBy(xpath="(//input[@class='o_input ui-autocomplete-input'])[6]")
   private WebElement productName;
   @FindBy(xpath="//span[text()='Confirm']")
   private WebElement confirmBtn;
   @FindBy(xpath="//span[text()='Mark as Done']")
   private WebElement markasDoneBtn;
   @FindBy(xpath="//span[text()='Apply']")
   private WebElement applyBtn;
   @FindBy(xpath="//button[@class='btn btn-primary o_form_button_save']")
   private WebElement saveButton;


public ManufacturingPage(WebDriver driver)
{
	  PageFactory.initElements(driver, this);
	
}
public void clickOnmanufacturingBtn()
{
	manufacturingBtn.click();
}

public void clickOncreateBtn()
{
	createBtn.click();
}

public void clickOnproductDropdwn()
{
	productDropdwn.click();
	productDropdwn.sendKeys("New Product");
}

public void clickOnsearchedTxt()
{
	searchedTxt.click();
	
}

public void clickOnbillOfMaterialTxt()
{
	billOfMaterialTxt.sendKeys("Test bill");
	
}

public void clickOncreateBillMaterial()
{
	createBillMaterial.sendKeys("Test bill");
	
}

public void clickOnsaveBtn()
{
	saveBtn.click();
	
}

public void clickOnaddaLineBtn()
{
	addaLineBtn.click();
	
}

public void clickOnproductName()
{
	productName.sendKeys("New Product");
	
}

public void clickOnconfirmBtn()
{
	confirmBtn.click();
	
}

public void clickOnmarkasDoneBtn()
{
	markasDoneBtn.click();
	
}

public void clickOnapplyBtn()
{
	applyBtn.click();
	
}

public void clickOnsaveButton()
{
	saveButton.click();
	
}


}


