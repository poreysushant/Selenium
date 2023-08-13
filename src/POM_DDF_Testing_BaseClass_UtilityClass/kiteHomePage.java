package POM_DDF_Testing_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage 
{
	//POM Class 3

		//Data member/varibles should be declared globally with access level private by using findBy annoation
			@FindBy(xpath="//span[text()='GP8097']") private WebElement	UserID;//WebElement	UserID=driver.findElement(By.xpath("//span[text()='GP8097']"));
															
			@FindBy(xpath="//a[text()=' Logout']") private WebElement Logoutbtn;
			
			
			
			
			//Initialize within a constructor with access level public using pagefactory class
			
			public kiteHomePage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
		
			//Utilize within a method with access level public
			
		     public String getkiteHomePageUserID()
		    {
		    	 String UserIDValue=UserID.getText();      //GP8097
		    	 return UserIDValue;                       //GP8097
			
			}
			
			
			public void clickuserID() 
			{
				UserID.click();
			}
			
			public void clicklogoutbtn() 
			{
				Logoutbtn.click();
			}
			

}
