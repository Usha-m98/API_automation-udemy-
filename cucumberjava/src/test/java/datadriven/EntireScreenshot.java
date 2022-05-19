package datadriven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class EntireScreenshot {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
		   driver.get("http://demo.guru99.com/v4/");
		   Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		   ImageIO.write(screenshot.getImage(), "PNG", new File("./screenshots/guru.png"));
		   System.out.println("Taken screenshot");
		   driver.quit();

	}

}
