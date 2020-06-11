package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage
{
    WebDriver driver;
    public CheckoutPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "(//input[@value='Continue'])[1]")
    public WebElement billingcbtn;

   /* @FindBy(id="ShipToSameAddress")
    public WebElement DontwantSamebillingAddress;

    @FindBy(id="ShippingNewAddress_FirstName")
    public WebElement shipFirstName;
    @FindBy(id="ShippingNewAddress_LastName")
    public WebElement shipLastName;
    @FindBy(id="ShippingNewAddress_Email")
    public  WebElement shipemail;
    @FindBy(id="ShippingNewAddress_City")
    public WebElement shipcity;
    @FindBy(id="ShippingNewAddress_Address1")
    public WebElement shipadd1;
    @FindBy(id="ShippingNewAddress_ZipPostalCode")
    public WebElement shippostcode;
    @FindBy(id="ShippingNewAddress_PhoneNumber")
    public WebElement shipphonenum;
    @FindBy(xpath ="(//input[@value='Continue'])[2]")
    public WebElement shipaddressbtn;*/

    @FindBy(xpath = "(//input[@value='Continue'])[3]")
    public WebElement shippingmcbtn;
    @FindBy(xpath = "(//input[@value='Continue'])[4]")
    public WebElement paymentmcbtn;
    @FindBy(xpath = "(//input[@value='Continue'])[5]")
    public WebElement paymentinfo;
    @FindBy(xpath = "//input[@value='Confirm']")
    public WebElement confirmbtn;

    public void billingaddress()
    {
       // DontwantSamebillingAddress.click();
       billingcbtn.click();
    }
    public void shippingaddress()
    {
       /* Select shippingnewaddress = new Select(driver.findElement(By.id("shipping-address-select")));
        shippingnewaddress.selectByVisibleText("New Address");
        shipFirstName.clear();
        shipFirstName.sendKeys("raja");

        shipLastName.clear();
        shipLastName.sendKeys("raja");

        shipemail.clear();
        shipemail.sendKeys("efg@tester.com");

        Select shipcountry = new Select(driver.findElement(By.id("ShippingNewAddress_CountryId")));
        shipcountry.selectByValue("1");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ShippingNewAddress_StateProvinceId")));
       Select shipstate=new Select(driver.findElement(By.id("ShippingNewAddress_StateProvinceId")));
        shipstate.selectByValue("1");
        Boolean ss= driver.findElement(By.id("ShippingNewAddress_StateProvinceId")).isSelected();
       System.out.println(ss);
        shipcity.sendKeys("Newyork");
        shipadd1.sendKeys("23,washington");
        shippostcode.sendKeys("E13NR");
        shipphonenum.sendKeys("7689543256");
        shipaddressbtn.click();*/


    }
    public void shippingmethod()
    {
        shippingmcbtn.click();
    }
    public void paymentmethodaddress()
    {
        paymentmcbtn.click();
    }
    public void paymentinfo()
    {
        paymentinfo.click();
    }
    public void orderconfirmbutton()
    {
        confirmbtn.click();
    }

}
