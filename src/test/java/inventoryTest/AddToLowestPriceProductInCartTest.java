package inventoryTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.CartPage;
import objectRepository.InventoryItemPage;
import objectRepository.InventoryPage;

public class AddToLowestPriceProductInCartTest extends BaseClass{

	//@Test
	@Test(groups = {"RegressionSuite","SmokeSuite"})
		public void tc_001_AddLowestPriceProductToCartTest() throws IOException
		{

			// Read the Test Data from Excel file
			String SORTOPTION = fUtil.readDataFromExcelFile("Products", 4, 2);
			String PRODUCTNAME = fUtil.readDataFromExcelFile("Products", 4, 3);

			// Click on a Product
			InventoryPage ip = new InventoryPage(driver);
			ip.clickOnLowestPriceProduct(driver,SORTOPTION,PRODUCTNAME);

			// Add Product to Cart
			InventoryItemPage iip = new InventoryItemPage(driver);
			iip.clickOnAddcartBtn();

			// Navigate to Cart
			ip.clickOnCartContainerBtn();

			// Validate for the product in Cart
			CartPage cp = new CartPage(driver);
			String productInCart = cp.captureItemName();
			Assert.assertTrue(productInCart.equals(PRODUCTNAME));
			System.out.println(productInCart);

			
		}
}
