package org.utilities;

	 

	 import java.awt.AWTException;
	 import java.awt.Desktop.Action;
	 import java.awt.Robot;
	 import java.awt.event.KeyEvent;
	 import java.io.File;
	 import java.io.IOException;
	 import java.security.Key;
	 import java.util.Set;

	 import javax.xml.datatype.Duration;

	 import org.apache.commons.io.FileUtils;
	 import org.openqa.selenium.Alert;
	 import org.openqa.selenium.JavascriptExecutor;
	 import org.openqa.selenium.Keys;
	 import org.openqa.selenium.OutputType;
	 import org.openqa.selenium.TakesScreenshot;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	 import org.openqa.selenium.support.ui.FluentWait;
	 import org.openqa.selenium.support.ui.Select;
	 import org.openqa.selenium.support.ui.WebDriverWait;

	 import io.github.bonigarcia.wdm.WebDriverManager;

	 public class BaseClass {
	 	public static WebDriver driver;
	 	public static Actions a;
	 	public static Robot r;
	 	public static Alert aa;
	 	public static JavascriptExecutor js;
	 	public static TakesScreenshot t;
	 	public static Select s;
	 //Webdriver	
	 public static void launchBrowser() {
	 	WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
	 }
	 public static void launchUrl(String url) {
	 	driver.get(url);

	 }
	 public static void maximize() {
	 	driver.manage().window().maximize();

	 }
	 public static void toTitle() {
	 	String title = driver.getTitle();
	 	System.out.println(title);
	 	
	 }
	 public static void toCurrentUrl() {
	 	String currentUrl = driver.getCurrentUrl();
	 	System.out.println(currentUrl);	

	 }
	 public static void Sendkeys(WebElement element,String data) {
	 	element.sendKeys(data);

	 }
	 public static void toClick(WebElement element ) {
	 	element.click();

	 }
	 public static void toQuit() {
	 	driver.quit();

	 }
	 public static String toGetAttribute(WebElement element,String AttributeValue) {
	 	String attribute=element.getAttribute(AttributeValue);
	 return attribute;

	 }
	 public static String toGetText(WebElement element) {
	 	String text2 = element.getText();
	 	return text2;


	 }
	 //actions
	 public static void toMove(WebElement element) {
	 	 a=new Actions(driver);
	 	 a.moveToElement(element).perform();

	 }
	 public static void toDrag(WebElement src,WebElement dest) {
	 	a=new Actions(driver);
	 	a.dragAndDrop(src, dest).perform();
	 }
	 public static void toKeyUp(WebElement element,String s) {
	 	a=new Actions(driver);
	 	a.keyUp(element,Keys.SHIFT).perform();

	 }
	 public static void toKeyDown(WebElement element,String s) {
	 	a=new Actions(driver);
	 	a.keyDown(element,Keys.SHIFT).perform();

	 }
	 public static void toDoubleClick(WebElement element) {
	 	a=new Actions(driver);
	 	a.doubleClick(element).perform();
	 }
	 public static void toContextClick(WebElement element) {
	 	a=new Actions(driver);
	 	a.contextClick(element).perform();

	 }
	 //Robot
	 public static void toRobot(int i) throws AWTException {
	 	 r=new Robot();
	 	 r.keyPress(i);
	 	 r.keyRelease(i);
	 	 
	 }
	 //Alert
	 public static void toAlertAccept() {
	 	 aa = driver.switchTo().alert();
	 	aa.accept();
	 	
	 	}
	 public static void toAlertDismiss() {
	 	 aa = driver.switchTo().alert();
	      aa.dismiss();
	 }
	 public static void toAlertSendKeys(String s) {
	 	aa = driver.switchTo().alert();
	 	aa.sendKeys(s);

	 }
	 public static String toAlertGetText(String s) {
	  aa = driver.switchTo().alert();
	 String text = aa.getText();
	 return text;

	 }
	 //javascript
	 public static void toJavaScript(String s,WebElement element) {
	 	 js=(JavascriptExecutor)driver;
	 	 js.executeScript(s, element);

	 }

	 //takescreenshot
	 public static void toScreenShot(String name) throws IOException {
	 	 t=(TakesScreenshot)driver;
	 	 File src = t.getScreenshotAs(OutputType.FILE);
	 	 File dst=new File("C:\\Users\\siva sankar\\eclipse-workspace\\Cucumber\\screensort\\"+name+".jpg");
	 	 FileUtils.copyFile(src, dst);
	 	
	 }
	 //frames
	 public static void toFrameSwitchIntex(int i) {
	 	driver.switchTo().frame(i);
	 }
	 public static void toFrameSwitchString(String s) {
	 	driver.switchTo().frame(s);
	 }
	 public static void toFrameSwitchWebElement(WebElement element) {
	 	driver.switchTo().frame(element);

	 }
	 public static void toFrameSwitchParentFrame() {
	 	driver.switchTo().parentFrame();
	 }
	 public static void toFrameSwitchDefaultContent() {
	 	driver.switchTo().defaultContent();

	 }
	 //windowhandling
	 public static void toWindowSwitch(String s) {
	 	driver.switchTo().window(s);

	 }
	 public static String toWindowHandle(String s) {
	 	String ss = driver.getWindowHandle();
	 	return ss;
	 }
	 public static Set<String> toWindowHandles(Set<String> s) {
	 	Set<String> handles = driver.getWindowHandles();
	 	return handles;
	 }
	   //DropDown
	 public static void toDropDowmSelectByValue(WebElement element,String ss) {
	 	s=new Select(element);
	 	s.deselectByValue(ss);
	 }
	 public static void toDropDownSelectIndex(int i) {
	 	s.selectByIndex(i);

	 }
	 public static void toDropDownSelectVisibleText(String ss) {
	 	s.selectByVisibleText(ss);
	 	System.out.println("hi yogesh");

	 }
	 //waits
	// public static void toWebDriverWait() {
	 	//WebDriver w=new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	 //}
	 public static void toFluentWait() {
	 	FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver).withTimeout(java.time.Duration.ofSeconds(10)).pollingEvery(java.time.Duration.ofSeconds(1)).ignoring(Throwable.class); 
	 }
//	 public static void toImplecityWait() {
	// 	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	// }


	 
	 

}





	 


