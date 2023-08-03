package script;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPage.AddToCartPage;
import pomPage.SkilllaryDemoappPage;
import pomPage.SkilllaryLoginPage;

//1. Open the browser enter the URL of Skillary.com.
//click on gears.click on “skillary demo app” .
//Switch the control to new tab mouse over on course select selenium training double click on + button. 
//Click on add to cart switch the control to alert pop up and click on ok. 
public class TestCase1 extends BaseClass
{
	@Test
	public void scripts() throws Throwable
	{
		SkilllaryLoginPage s=new SkilllaryLoginPage(driver);
		Thread.sleep(3000);
		s.gearsbutton();
		Thread.sleep(3000);
		util.dropdown(null, null);
		s.skillrarydemoapp();
		SkilllaryDemoappPage sd=new SkilllaryDemoappPage(driver);
		util.mouseover(driver,sd.courseOption());
		sd.seleniumTraininglink();
		AddToCartPage adref=new AddToCartPage(driver);
				util.doubleclick(driver, adref.add_Icon());
				adref.Addbtn();
				util.alertpop(driver);
				
		
	}

}
