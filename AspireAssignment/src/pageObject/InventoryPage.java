package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage 
{
   @FindBy(xpath="//div[text()='Inventory']")
   private WebElement inventoryBx;
   @FindBy(xpath="(//a[@class='dropdown-toggle o-no-caret o_menu_header_lvl_1'])[2]")
   private WebElement productsBx;
   @FindBy(xpath="(//span[text()='Products'])[1]")
   private WebElement productsDropdwn;
   @FindBy(xpath="//button[@class='btn btn-primary o-kanban-button-new']")
   private WebElement createBtn;
   @FindBy(xpath="//input[@placeholder='Product Name']")
   private WebElement textBx;
   @FindBy(xpath="//span[text()='Update Quantity']")
   private WebElement updateQuantity;
   @FindBy(xpath="//button[@class='btn btn-primary o_list_button_add']")
   private WebElement createBtn2;
   @FindBy(xpath="//input[@class='o_field_float o_field_number o_field_widget o_input']")
   private WebElement updatingQuantity;
   @FindBy(xpath="(//input[@class='o_input ui-autocomplete-input'])[1]")
   private WebElement locationDropdwn;
   @FindBy(xpath="//a[text()='Virtual Locations/HN']")
   private WebElement dropdwnText;
   @FindBy(xpath="//button[@class='btn btn-primary o_list_button_save']")
   private WebElement saveBtn;
   @FindBy(xpath="//a[@class='fa o_menu_toggle fa-th']")
   private WebElement applicationBtn;
   
   public InventoryPage(WebDriver driver)
   {
 	  PageFactory.initElements(driver, this);
 	
   }
   public void clickOninventoryBx()
   {
	   inventoryBx.click();
   }
   
   public void clickOnproductsBx()
   {
	   productsBx.click();
   }
   
   public void clickOnproductsDropdwn()
   {
	   productsDropdwn.click();
   }
   
   public void clickOncreateBtn()
   {
	   createBtn.click();
   }
   
   public void clickOntextBx()
   {
	   textBx.sendKeys("New Product");
   }
   
   public void clickOnupdateQuantity()
   {
	   updateQuantity.click();
   }
   
   public void clickOncreateBtn2()
   {
	   createBtn2.click();
   }
   
   public void clickOnupdatingQuantity()
   {
	   updatingQuantity.clear();
	   updatingQuantity.sendKeys("15");
   }
   
   public void clickOnlocationDropdwn()
   {
	   locationDropdwn.click();
   }
   
   public void clickOndropdwnText()
   {
	   dropdwnText.click();
   }
   
   public void clickOnsaveBtn()
   {
	   saveBtn.click();
   }
   
   public void clickOnapplicationBtn()
   {
	   applicationBtn.click();
   }
   
}
