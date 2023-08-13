package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteloginpage1 
{
	//POM Class1
	

		//Data member/variables should be declared globally with access level private by using @findBy annoation
			@FindBy(xpath="//input[@id='userid']")	private	WebElement	UN; //WebElement UN=driver.findElement(By.xpath("//input[@id='userid']"))
			@FindBy(xpath="//input[@id='password']") private WebElement	PSW;//WebElement PSW=driver.findElement(By.xpath("//input[@id='password']"))
			@FindBy(xpath="//button[text()='Login ']") private  WebElement loginbtn; //WebElement loginbtn=driver.findElement(By.xpath("//button[text()='Login ']"))
		
		
		//Initialize within a constructor with access level public using pagefactory class
			
			public kiteloginpage1(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			
		
			//Utilize within a method with access level public
			
			public void enterUserID(String userID) //GP8097
			{
				UN.sendKeys(userID);
			}
			
			public void enterpassword(String Password) //Swami@0110
			{
				PSW.sendKeys(Password);
			}
			
			public void clickloginbtn() 
			{
				
				loginbtn.click();
			}
			
			
			
}
