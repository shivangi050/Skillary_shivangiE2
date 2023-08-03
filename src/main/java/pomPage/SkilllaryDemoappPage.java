package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkilllaryDemoappPage
{
//declaration
	@FindBy(xpath="//select[@name='addresstype']")
	private WebElement selectDropDown;
	@FindBy(xpath="//a[@id='course']")
	private WebElement coursebtn;
	@FindBy(linkText="Selenium Training")
	private WebElement seleniumtraininglink;

	
	//initialization
	public SkilllaryDemoappPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectDrop_down()
	{
		selectDropDown.click();
	}
	public WebElement courseOption()
	{
		return coursebtn;
	}
	public void seleniumTraininglink()
	{
		seleniumtraininglink.click();
	}
	
}
