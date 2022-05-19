package datadriven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.io.FileHandler;
//
//
//import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.Screenshot;

public class screenshot {

	
public static WebDriver driver;
//Taking screenshot of only visible part of page in browser
public static void Screenshot1() throws IOException
{
    TakesScreenshot scrShot =((TakesScreenshot)driver);
    File Src=scrShot.getScreenshotAs(OutputType.FILE);
    File Dest=new File("./target/OrangeHRM.png");
    FileUtils.copyFile(Src, Dest);
}

//Taking screenshot for particular webelement
public static void Screenshot2() throws IOException {
WebElement Logo= driver.findElement(By.xpath("//a[@aria-label='Subway.com home page']//span[@class='sw-universal-logo__regular']//img[@alt='Subway']"));
File Src1=Logo.getScreenshotAs(OutputType.FILE);
File Dest1=new File("./screenshots/subwaylogo.png");
FileUtils.copyFile(Src1, Dest1);

}


public static void main(String[] args) throws InterruptedException, IOException {
   WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.get("https://swqe.test.subway.com/en-us/contactus/guestcare");
   Screenshot2();
   System.out.println("Taken screenshot");
   driver.quit();
}}
