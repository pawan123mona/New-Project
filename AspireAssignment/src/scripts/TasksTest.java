package scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import generic.BaseLib;
import generic.WaitStatementLib;
import pageObject.InventoryPage;
import pageObject.LoginPage;
import pageObject.ManufacturingPage;



public class TasksTest extends BaseLib
{
  

@Test
   public void createCustomerTest() throws InterruptedException
   {
		Thread.sleep(5000);
		//1. Login to web application
		LoginPage lp=new LoginPage(driver);
		   lp.login("username", "password");
		   
		   Thread.sleep(3000);
		   InventoryPage ip = new InventoryPage(driver);
		   //2. Navigated to `Inventory` feature
		   ip.clickOninventoryBx();
		   Thread.sleep(2000);
		   //3. From the top-menu bar, selected `Products -> Products` item
		   ip.clickOnproductsBx();
		   Thread.sleep(2000);
		   ip.clickOnproductsDropdwn();
		   Thread.sleep(3000);
		   //3. then create a new product
		   ip.clickOncreateBtn();
		   Thread.sleep(2000);
		   ip.clickOntextBx();
		   Thread.sleep(3000);
		   //4. Update the quantity of new product is more than 10
		   ip.clickOnupdateQuantity();
		   Thread.sleep(3000);
		   ip.clickOncreateBtn2();
		   Thread.sleep(3000);
		   ip.clickOnlocationDropdwn();
		   Thread.sleep(4000);
		   ip.clickOndropdwnText();
		   Thread.sleep(5000);
		   ip.clickOnupdatingQuantity();
		   Thread.sleep(3000);
		   ip.clickOnsaveBtn();
		   Thread.sleep(4000);
		   //5. From top-left page, click on `Application` icon
		   ip.clickOnapplicationBtn();
		   Thread.sleep(3000);
		   ManufacturingPage mp = new ManufacturingPage(driver);
		   //6. Navigate to `Manufacturing` feature
		   mp.clickOnmanufacturingBtn();
		   Thread.sleep(3000);
		   //6. create a new Manufacturing Order item for the created Product on step #3
		   mp.clickOncreateBtn();
		   Thread.sleep(3000);
		   mp.clickOnproductDropdwn();
		   Thread.sleep(10000);
		   mp.clickOnsearchedTxt();
		   Thread.sleep(3000);
		   mp.clickOnbillOfMaterialTxt();
		   Thread.sleep(3000);
		   mp.clickOncreateBillMaterial();
		   Thread.sleep(5000);
		   mp.clickOnsaveBtn();
		   Thread.sleep(3000);
		   mp.clickOnaddaLineBtn();
		   Thread.sleep(3000);
		   mp.clickOnproductName();
		   Thread.sleep(3000);
		   mp.clickOnsearchedTxt();
		   Thread.sleep(4000);
		   mp.clickOncreateBillMaterial();
		   Thread.sleep(5000);
		   ip.clickOnupdatingQuantity();
		   Thread.sleep(3000);
		   mp.clickOnconfirmBtn();
		   Thread.sleep(3000);
		   //7. Update the status of new Orders to “Done” successfully
		   mp.clickOnmarkasDoneBtn();
		   Thread.sleep(3000);
		   mp.clickOnapplyBtn();
		   Thread.sleep(3000);
		   //8. Validate the new Manufacturing Order is created with corrected information.
		   mp.clickOnsaveButton();
}
}
