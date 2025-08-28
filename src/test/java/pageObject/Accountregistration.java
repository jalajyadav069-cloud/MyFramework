package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accountregistration extends Basepage {

	public Accountregistration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='input-firstname']")

	WebElement fname;

	@FindBy(xpath = "//input[@id='input-lastname']")

	WebElement lname;

	@FindBy(xpath = "//input[@id='input-email']")

	WebElement email;

	@FindBy(xpath = "//input[@id='input-telephone']")

	WebElement tele;

	@FindBy(xpath = "//input[@id='input-password']")

	WebElement passw;

	@FindBy(xpath = "//input[@id='input-confirm']")

	WebElement cpassw;

	@FindBy(xpath = "//input[@name='agree']")

	WebElement condt;

	@FindBy(xpath = "//input[@value='Continue']")

	WebElement conti;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")

	WebElement confmsg;

	public void firstname(String firname) {

		fname.sendKeys(firname);

	}

	public void lastname(String lasname) {

		lname.sendKeys(lasname);

	}

	public void emailid(String gmail) {

		email.sendKeys(gmail);

	}

	public void telephone(String numb) {

		tele.sendKeys(numb);

	}

	public void password(String passwoo) {

		passw.sendKeys(passwoo);

	}

	public void cpassword(String cpasswoo) {

		cpassw.sendKeys(cpasswoo);

	}

	public void agree() {

		condt.click();
	}

	public void contbutt() {

		conti.click();
	}

	public String confirmationmsg() {
		
		try {
			return (confmsg.getText());
			
			
		}
		catch(Exception e) {
			
		return	(e.getMessage());
			
		}
		
		
		
	}
	
	
}
