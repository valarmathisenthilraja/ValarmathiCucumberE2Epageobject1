package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
    WebDriver driver;
    public CartPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText="Shopping cart")
    public WebElement shoppingcart;
    @FindBy(id="termsofservice")
    public WebElement termofservice;
    @FindBy(id="checkout")
    public WebElement checkoutbtn;
    public void shoppingcart()
    {

        shoppingcart.click();

    }
    public void termofserviceandcheckout()
    {
        termofservice.click();
        checkoutbtn.click();
    }

}
