package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {

	public Homepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		@FindBy(xpath = "//ul[@class='list-inline']//li[@class='dropdown']")
		WebElement myaccount;
	
		@FindBy(xpath = "//a[normalize-space()='Register']")
		WebElement register;
	
	
	public void accountclick() {
		
		myaccount.click();
		
	}
		
		public void registerclick() {
			
			register.click();
		}

}
