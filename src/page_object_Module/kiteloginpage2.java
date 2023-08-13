package page_object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage2 
{
	//POM Class 2
	
		//Data member/varibles should be declared globally with access level private by using findBy annoation
		
		@FindBy(xpath="//input[@id='pin']")	private	WebElement	PIN;  //WebElement	PIN=driver.findElement(By.xpath("//input[@id='pin']"))
		@FindBy(xpath="//button[text()='Continue ']") private WebElement CtnBtn; //WebElement CtnBtn=driver.findElement(By.xpath("//button[text()='Continue ']"))
		

		//Initialize within a constructor with access level public using pagefactory class
		
		public	kiteloginpage2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Utilize within a method with access level public
		
				public void enterPIN() 
				{
					PIN.sendKeys("449192");
				}
				
				public void clickctnbtn() 
				{
					CtnBtn.click();
				}
		
		
		
		
	}


