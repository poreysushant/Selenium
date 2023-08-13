package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage_vishal 
{
	//POM Class3
	
		////Data member/variales should be declared globally with access level private by using @findBy annoation
		
		@FindBy(xpath="//span[text()='OPK971']")private WebElement UserID; //WebElement UserID=driver.findElement(By.xpath("//span[text()='OPK971']")
		
		//Initialize within a constructor with access level public using pagefactory class
		
				public kiteHomePage_vishal(WebDriver driver)
				{
					PageFactory.initElements(driver, this);
				}
			
				//Utilize within a method with access level public
				
				public void verifyUserID(String ExpectedUserID) 
				{
				
					
					     String  ActualUserID=UserID.getText();
					
					
					     if(ExpectedUserID.equals(ActualUserID))
					     {
					    	 System.out.println("Pass");
					     }
					     else 
					     {
					    	 System.out.println("fail"); 
					     }
					     
					
					
				}

}
