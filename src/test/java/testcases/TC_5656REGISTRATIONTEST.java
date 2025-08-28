package testcases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.Accountregistration;
import pageObject.Homepage;
import testbase.Basetest;

public class TC_5656REGISTRATIONTEST extends Basetest {


	
	@Test

	public void accountregtest() throws InterruptedException {
		
		logger.info("starting the test now>>>>>>>>>");
try {
		Homepage hp = new Homepage(driver);
		hp.accountclick();
		logger.info("clicked on my account>>>>>>>>>");
		hp.registerclick();
		logger.info("clicked on register>>>>>>>>>");
		Accountregistration ar = new Accountregistration(driver);
		
		logger.info("providing details>>>>>>>>>");
		ar.firstname(randomstring().toUpperCase());
		ar.lastname(randomstring().toUpperCase());
		ar.telephone(randomnumstring());
		ar.emailid(randomstring() + "@gmail.com");
		String passsss = randomnalphumstring();
		ar.password(passsss);
		ar.cpassword(passsss);
		ar.agree();
		ar.contbutt();
		logger.info("validating the confirmation msg>>>>>>>>>");
		String conffmessage = ar.confirmationmsg();

		
		if(conffmessage.equals("Your Account Has Been Created!"))
		{
			
			Assert.assertTrue(true);
			
			
		}
		
		else {
			
			
			logger.error("test is failed......");
			logger.debug("debuging the logs........");
			Assert.assertTrue(false);
			
		}
}
catch(Exception e){
	
	Assert.fail();
	
}
logger.info("finished test case>>>>>>>>>");

	}



	

}
