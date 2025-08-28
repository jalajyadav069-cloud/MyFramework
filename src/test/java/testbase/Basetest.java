package testbase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Basetest {

	public WebDriver driver;
	public Logger logger;
	public Properties p;

	@Parameters({ "os", "browser" })
	@BeforeClass
	public void setup(String os,String br) throws InterruptedException, IOException {
		
		FileReader file = new FileReader("./src//test//resources//config.properties");
		
		p =new Properties();
		p.load(file);
		

		logger = LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase()) {
		
		case "chrome" : driver = new ChromeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		default : System.out.println("invalid browser---");return;
		
		
		}

		//driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("appurl"));
		driver.manage().window().maximize();
		Thread.sleep(5000);

	}

	@AfterClass
	public void teardown() {

		driver.quit();

	}

	public String randomstring() {

		String generated_string = RandomStringUtils.randomAlphabetic(5);
		return generated_string;

	}

	public String randomnumstring() {

		String generated_stringnum = RandomStringUtils.randomNumeric(10);
		return generated_stringnum;

	}

	public String randomnalphumstring() {

		String generated_stringalphnum = RandomStringUtils.randomAlphabetic(5) + RandomStringUtils.randomNumeric(5);
		return generated_stringalphnum;

	}

}
