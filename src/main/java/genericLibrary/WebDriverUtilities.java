package genericLibrary;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	//handling dropdown elements
public void dropdown(WebElement ele,String text) 
{Select s=new Select(ele);
s.selectByVisibleText(text);
	}
//mouseover action
public void mouseover(WebDriver driver,WebElement ele)
{
	Actions a=new Actions(driver);
			a.moveToElement(ele).perform();
}
//rightclick
public void rightclick(WebDriver driver,WebElement ele)
{
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
}
//double click
public void doubleclick(WebDriver driver,WebElement ele)
{
	Actions a=new Actions(driver);
	a.doubleClick(ele).perform();
}
//drag and drop
public void dragndrop(WebDriver driver,WebElement src,WebElement dest)
{
	Actions a=new Actions(driver);
	a.dragAndDrop(src,dest).perform();
}
//shifting control to frame
public void shiftframe(WebDriver driver)
{
	driver.switchTo().frame(0);
}
//shifting control to base page-from frame
public void shifttopagefrmframe(WebDriver driver)
{
	driver.switchTo().defaultContent();
}
//handling pop up-accept
public void alertpop(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
//handling pop up-reject
public void alertpopReject(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}
//shifting control to child webpage
public void childwebpage(WebDriver driver)
{
	Set<String> s =driver.getWindowHandles();
	for(String ob:s)
	{
driver.switchTo().window(ob);
	}
}

	
}




