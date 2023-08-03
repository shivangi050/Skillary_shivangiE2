package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkilllaryLoginPage
{ //declaration
@FindBy(xpath="//input[@name='q']")
private WebElement  searchTF;
@FindBy(xpath="//input[@type='submit']")
private WebElement searchIcon;
@FindBy(xpath="//a[text()=' GEARS '] ")
private WebElement gearsdropdown;
@FindBy(xpath="//a[text()=' SkillRary Demo APP'][2]")
private WebElement skillraryDemoapp;

//intialization
public SkilllaryLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//utilization
public void gearsbutton()
{gearsdropdown.click();
}
public void skillrarydemoapp()
{
	skillraryDemoapp.click();
}
public void search(String name)
{
	searchTF.sendKeys(name);
}
public void searchbutton()
{
	searchIcon.click();
}



}
