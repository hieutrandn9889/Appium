package test;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class test_001 {
	AppiumDriver<WebElement> driver2;
	Dimension size;
	AndroidDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {

		// Set the APK path
		File appDir = new File(System.getProperty("user.dir") + "//apk");
		// Provide the APK name
		File app = new File(appDir, "1.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Set android deviceName desired capability.
		capabilities.setCapability("deviceName", "emulator-5554");
		// Set BROWSER_NAME desired capability to Android.
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		// Set android VERSION from device desired capability.
		capabilities.setCapability(CapabilityType.VERSION, "5.1.1");
		// Set android platformName desired capability to Android.
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		// Set android appPackage desired capability.
		capabilities.setCapability("appPackage", "vn.com.fsoft.seiko.and1");
		// Set android appActivity desired capability.
		capabilities.setCapability("appActivity", "vn.com.fsoft.seiko.and1.ui.activity.StartActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

	@Test(enabled = false)
	public void TC_001_Login() {
		WebElement Nut004 = driver.findElement(By.xpath("//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]//*[1]//*[1]//*[4]"));
		Nut004.click();

		WebElement understandButton = driver.findElement(By.id("tuto_understand"));
		understandButton.click();
		// clear comment
	}

	@Test(enabled = false)
	public void TC_002_Login() {

		WebElement Nut001 = driver.findElement(By.xpath("//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]//*[1]//*[1]//*[1]"));
		Nut001.click();
		

		WebElement Nut002 = driver.findElement(By.xpath("//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]//*[1]//*[1]//*[2]"));
		Nut002.click();

		WebElement Nut003 = driver.findElement(By.xpath("//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]//*[1]//*[1]//*[3]"));
		Nut003.click();

		WebElement Nut004 = driver.findElement(By.xpath("//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[3]//*[1]//*[1]//*[4]"));
		Nut004.click();

		WebElement understandButton = driver.findElement(By.id("tuto_understand"));
		understandButton.click();
	}

	@Test(enabled = false)
	public void TC_003() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(2000);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]")).isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();
				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(1000);
		numberInput2.sendKeys("55");

		// buttonOK
		clickWhenReady(By.id("button1"), 10);

		// press mark1
		clickWhenReady(By.xpath("//*[@class='android.view.View'][2]"), 10);

		WebElement numberInput1 = driver.findElement(By.id("numberinput"));
		numberInput1.clear();
		Thread.sleep(1000);
		numberInput1.sendKeys("54");

		// buttonOK
		clickWhenReady(By.id("button1"), 10);

		// press calcucation
		clickWhenReady(By.id("button_getresult"), 10);

		// save button
		clickWhenReady(By.id("save"), 10);

		// ok button
		clickWhenReady(By.id("ok"), 10);
	}

	// Testing Module_05////////////////////////////////////////

	@Test(enabled = true)
	public void TC_004_Module5_8() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]")).isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(500);
		numberInput2.sendKeys("999.99");
		// buttonOK
		clickWhenReady(By.id("button1"), 10);
		Thread.sleep(500);
		getScreenshot(driver, "test_004.png");
	}

	@Test(enabled = true)
	public void TC_005_Module5_9() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]"))
						.isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(500);
		numberInput2.sendKeys("0.01");
		// buttonOK
		clickWhenReady(By.id("button1"), 10);
		Thread.sleep(500);
		getScreenshot(driver, "test_005.png");
	}

	@Test(enabled = true)
	public void TC_006_Module5_10() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]"))
						.isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(500);
		numberInput2.sendKeys("1000.00");
		// buttonOK
		clickWhenReady(By.id("button1"), 10);
		Thread.sleep(500);
		getScreenshot(driver, "test_006.png");
	}

	@Test(enabled = true)
	public void TC_007_Module5_11() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]"))
						.isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(500);
		numberInput2.sendKeys("-1.00");
		// buttonOK
		clickWhenReady(By.id("button1"), 10);
		Thread.sleep(500);
		getScreenshot(driver, "test_007.png");
	}

	@Test(enabled = true)
	public void TC_008_Module5_12() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]"))
						.isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(500);
		numberInput2.sendKeys("010.00");
		// buttonOK
		clickWhenReady(By.id("button1"), 10);
		Thread.sleep(500);
		getScreenshot(driver, "test_08.png");
	}

	@Test(enabled = true)
	public void TC_009_Module5_13() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]"))
						.isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(500);
		numberInput2.sendKeys(".01");
		// buttonOK
		clickWhenReady(By.id("button1"), 10);
		Thread.sleep(500);
		getScreenshot(driver, "test_09.png");
	}

	@Test(enabled = true)
	public void TC_010_Module5_14() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]"))
						.isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(500);
		numberInput2.sendKeys("0.0");
		// buttonOK
		clickWhenReady(By.id("button1"), 10);
		Thread.sleep(500);
		getScreenshot(driver, "test_010.png");
	}

	@Test(enabled = true)
	public void TC_011_Module5_15() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]"))
						.isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(500);
		numberInput2.sendKeys("10");
		// button cancel
		clickWhenReady(By.id("button2"), 10);
		Thread.sleep(500);
		
		getScreenshot(driver, "test_011.png");
	}

	@Test(enabled = true)
	public void TC_012_Module5_16() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]"))
						.isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}
		// press camera
		clickWhenReady(By.id("action_gallery"), 10);

		// choose images
		clickWhenReady(By.className("android.widget.ImageView"), 10);

		// press mark2
		clickWhenReady(By.xpath("//*[@class='android.view.View'][3]"), 10);

		WebElement numberInput2 = driver.findElement(By.id("numberinput"));
		numberInput2.clear();
		Thread.sleep(500);
		numberInput2.sendKeys("10");
		// button back
		driver.navigate().back();
		Thread.sleep(500);
		
		// take screen shot
		getScreenshot(driver, "test_012.png");
	}

	@Test(enabled = false)
	public void TC_013() throws Exception {
		for (int i = 0; i < 4; i++) {
			Thread.sleep(500);
			try {
				if (driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab'][3]"))
						.isDisplayed()) {
					driver.findElement(By.id("tuto_understand")).click();

				}

			} catch (Exception e) {
				swipingHorizontal();
				System.out.println("e");
			}

		}

		for (int i = 0; i < 100; i++) {
			// press camera
			clickWhenReady(By.id("action_gallery"), 10);
			// choose images
			clickWhenReady(By.className("android.widget.ImageView"), 10);
			// button back
			driver.navigate().back();
			Thread.sleep(1000);
			System.out.println(i);
		}

	}

	// public void test1times() throws InterruptedException {
	//
	// // save button
	// for (int i = 0; i < 2; i++) {
	// clickWhenReady(By.id("save"), 10);
	// System.out.println(i);
	// }
	// }

	public void clickWhenReady(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}

	public void swipingHorizontal() throws InterruptedException {

		// Get the size of screen.
		size = driver.manage().window().getSize();
		System.out.println(size);

		// Find swipe start and end point from screen's.
		// Find startx point which is at right side of screen.
		int startx = (int) (size.width * 0.70);

		// Find endx point which is at left side of screen.
		int endx = (int) (size.width * 0.30);

		// Find vertical point where you wants to swipe. It is in middle of
		// screen height.
		int starty = size.height / 2;
		System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

		// Swipe from Right to Left.
		driver.swipe(startx, starty, endx, starty, 200);
		Thread.sleep(2000);

		// Swipe from Left to Right.
		// driver2.swipe(endx, starty, startx, starty, 3000);
		// Thread.sleep(2000);
	}

	public static void getScreenshot(AndroidDriver driver, String outputlocation ) throws IOException {
		System.out.println("Capturing the snapshot of the page ");
		File srcFiler=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFiler, new File(outputlocation));
	}

	@AfterMethod
	public void afterMethod() throws Exception {
		driver.quit();
	}

}
