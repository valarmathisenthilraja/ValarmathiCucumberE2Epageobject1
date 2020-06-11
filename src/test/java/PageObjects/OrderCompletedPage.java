package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderCompletedPage
{
    WebDriver driver;
    public OrderCompletedPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//div[@class='title']/strong")
    public WebElement ordersuccessmsg;
    public void ordersuccessmsg()
    {
        System.out.println(ordersuccessmsg.getText());
    }


}
