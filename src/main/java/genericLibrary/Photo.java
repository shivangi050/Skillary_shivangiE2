package genericLibrary;

import java.io.File;
import java.sql.Date;
import org.openqa.selenium.TakesScreenshot; 

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class Photo 
{
public void getPhoto(WebDriver driver,String name)throws Throwable
{
	Date d=new Date(0);
	String currentdate=d.toString().replaceAll(":", "-");
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(IpathConstant.photopath+currentdate+name+".png");
	FileUtils.copyFile(src,dest);
	}
}
