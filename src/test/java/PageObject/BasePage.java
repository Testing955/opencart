package PageObject;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
WebDriver driver;

public BasePage(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
}