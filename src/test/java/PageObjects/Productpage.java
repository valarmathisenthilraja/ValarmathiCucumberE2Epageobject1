package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage
{
    WebDriver driver;

    public Productpage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@value='Add to cart']")
    public WebElement additem1;
    @FindBy(xpath = "(//input[@value='Add to cart'])[2]")
    public WebElement additem2;
    @FindBy(xpath = "(//input[@value='Add to cart'])[3]")
    public WebElement additem3;

    public void additem1()
    {

        additem1.click();
    }
    public void additem2()
    {
        additem2.click();
    }
    public void additem3()
    {

        additem3.click();
    }

}
