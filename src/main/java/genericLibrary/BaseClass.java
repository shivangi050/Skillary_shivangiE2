package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
public WebDriver driver;
public WebDriverUtilities util=new WebDriverUtilities();
PropertyFile refPf=new PropertyFile();
@BeforeMethod
public void openapp() throws Throwable
{ 
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(refPf.getPropertyData("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
@AfterMethod
public void closeApp(ITestResult ref) throws Throwable
{  int status=ref.getStatus();
String name=ref.getName();
if(status==2)
{
	Photo p=new Photo();
	p.getPhoto(driver, name);
}
	driver.quit();
}

}
