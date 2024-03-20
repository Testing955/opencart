package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage
{
WebDriver driver;
public AccountRegistration(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstName;
@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtLastName;
@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmail;
@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;
@FindBy(xpath="//input[@name='agree']")
WebElement btnPrivacyandPolicy;
@FindBy(xpath="//button[normalize-space()='Continue']")
WebElement btnContinue;

public void setFirstname(String fname)
{
txtFirstName.sendKeys(fname);;
}
public void setLastname(String lname)
{
txtLastName.sendKeys(lname);
}
public void setEmail(String email)
{
txtEmail.sendKeys(email);
}
public void ClickContinue()
{
btnContinue.click();
}
public void setPassword(String password) 
{
	txtPassword.sendKeys(password);
	
}

public void ClickPrivacy() throws InterruptedException 
{
	WebElement agreeCheckbox = driver.findElement(By.xpath("//input[@name='agree']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].click();", agreeCheckbox);
	Thread.sleep(10000);
}



}
