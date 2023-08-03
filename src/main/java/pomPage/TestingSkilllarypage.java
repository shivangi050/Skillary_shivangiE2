package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingSkilllarypage 
{@FindBy(xpath="//img[@id='Selenium Training']")
private WebElement seleniumTraining;
@FindBy(xpath="//div[@id='cartArea']")
private WebElement cartarea;
@FindBy(xpath="//i[@class='fa fa-bars']")
private WebElement facebook;


//initialization
public TestingSkilllarypage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//utilzation

public void facebook()
{
facebook.click();
}
public WebElement getSeleniumTraining() {
	return seleniumTraining;
}

public WebElement getCartarea() {
	return cartarea;
}


}
