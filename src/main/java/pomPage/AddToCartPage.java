package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage 
{
	//declaration
	
		@FindBy(id="add")
		private WebElement addIcon;
		@FindBy(linkText=" Add to Cart")
		private WebElement addtocartbtn;

		
		//initialization
		public AddToCartPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public WebElement add_Icon()
		{
			return addIcon;
		}
		
		public WebElement Addbtn()
		{
			return addtocartbtn;
		}

}
