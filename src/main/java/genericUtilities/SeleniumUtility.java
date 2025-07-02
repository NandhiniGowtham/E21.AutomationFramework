package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class consists of generic methods related to Selenium
 * @author Nandhini 
 *
 */
public class SeleniumUtility {
	/**
	 * This method will maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	/**
	 * This method will minimize the window
	 * @param driver
	 */
	public void minimizeWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	/**
	 * This method will full-screen the window
	 * @param driver
	 */
	public void fullScreenWindow(WebDriver driver)
	{
		driver.manage().window().fullscreen();
	}
	
	/**
	 * This method will add implicitly wait for 10 seconds
	 * @param driver
	 */
	public void addImplicitlyWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
    
	/**
	 * This method will wait for 10 seconds for element to be Visible
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will wait for 10 seconds for element to be Clickable
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * This method will handle drop-down by Index
	 * @param eleement
	 * @param index
	 */
	public void handleDropdown(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	/**
	 * This method will handle Drop down by visible text
	 * @param element
	 * @param visibleText
	 */
	public void handleDropdown(WebElement element, String visibleText)
	{
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}
	
	/**
	 * This method will handle drop down by Value
	 * @param value
	 * @param element
	 */
	public void handleDropdown(String value, WebElement element)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * This method will perform mouse hovering action on web element
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	//Drag and drop , DoubleClick, context click , click and hold, release
	
	/**
	 * This method will perform drag and drop action on web element
	 * @param driver
	 * @param source element
	 * @param target element
	 */
	public void dragAndDropAction(WebDriver driver, WebElement srcEle, WebElement tarele)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(srcEle,tarele).perform();
	}
	
	/**
	 * This method will perform double click action on web element
	 * @param driver
	 * @param element
	 */
	public void doubleClickAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This method will perform right click action on web element
	 * @param driver
	 * @param element
	 */
	public void rightClickAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This method will perform click and Hold action on web element
	 * @param driver
	 * @param element
	 */
	public void clickAndHoldAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
	}
	
	/**
	 * This method will perform release action on web element
	 * @param driver
	 * @param element
	 */
	public void releaseAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.release(element).perform();
	}
	
	/**
	 * This method will perform Scroll action on web element
	 * @param driver
	 * @param element
	 */
	public void ScrollAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	/**
	 * This method will switch to Frame based on index
	 * @param driver
	 * @param frameIndex
	 */
	public void switchToFrame(WebDriver driver, int frameIndex)
	{
		driver.switchTo().frame(frameIndex);
	}
	
	/**
	 * This method will switch to Frame based on Name or ID
	 * @param driver
	 * @param Name or ID
	 */
	public void switchToFrame(WebDriver driver, String frameNameorID)
	{
		driver.switchTo().frame(frameNameorID);
	}
	
	/**
	 * This method will switch to Frame based on WebElement
	 * @param driver
	 * @param WebElement
	 */
	public void switchToFrame(WebDriver driver, WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}
	
	/**
	 * This method will switch the control to immediate parent frame
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	/**
	 * This method will switch the control to main Page
	 * @param driver
	 */
	public void switchToDeafultContent(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method will switch to window
	 * @param driver
	 * @param windowID
	 */
	public void switchToWindow(WebDriver driver, String windowID)
	{
		driver.switchTo().window(windowID);
	}
	
	/**
	 * This method will accept alert pop-up
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	

	/**
	 * This method will dismiss alert pop-up
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	

	/**
	 * This method will capture text from alert pop-up and return to caller
	 * @param driver
	 * @return alert text
	 */
	public String getAlertText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	

	/**
	 * This method will enter data into alert pop-up
	 * @param driver
	 * @param Data
	 */
	public void EnterAlertData(WebDriver driver, String data)
	{
		driver.switchTo().alert().sendKeys(data);
	}
	
	/**
	 * This method will scroll down by 500 units
	 * @param driver
	 */
	public void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);", "");
	}
	
	
	/**
	 * This method will capture screenshot and return the absolute path to
	 * caller
	 * @param driver
	 * @param screenshotName
	 * @return Path
	 * @throws IOException
	 */
	public String captureScreenShot(WebDriver driver, String screenshotName) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\Rajeshkumar V\\Pictures\\Saved Pictures"+screenshotName+".png");
		FileHandler.copy(src, dst);
		
		return  dst.getAbsolutePath(); //For extent Reports 
		
	}
	public void closetheWindow(WebDriver driver) {
		driver.close();
		
	}

}
