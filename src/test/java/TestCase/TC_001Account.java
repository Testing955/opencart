package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.AccountRegistration;
import PageObject.HomePage;
import testBase.BaseClass;

public class TC_001Account extends BaseClass
{
@Test
public void verify_account_registration() throws InterruptedException 
{
	logger.info("**** String Tc_001 ****");
	logger.debug("*** Application log started ***");
try
{
HomePage hp = new HomePage(driver);
hp.MyAccount();
logger.info("Clicked on MyAccount link");
hp.Register();
logger.info("Clicked on Register link");

logger.info("Entering customer details.. ");
AccountRegistration regpage = new AccountRegistration(driver);

regpage.setFirstname(randomString().toUpperCase());
regpage.setLastname(randomString().toUpperCase());
regpage.setEmail(randomString()+"@gmail.com");// randomly generated the email
//regpage.setTelephone(randomeNumber());
String password=randomAlphaNumeric();
regpage.setPassword(password);
/*JavascriptExecutor js = (JavascriptExecutor)driver;
WebElement con = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/button"));
js.executeScript("argument[0].scrollintoview();",con);*/
regpage.ClickPrivacy();
regpage.ClickContinue();
}
catch(Exception e)
{
logger.error("test failed.....");
Assert.fail();
}
}

}
