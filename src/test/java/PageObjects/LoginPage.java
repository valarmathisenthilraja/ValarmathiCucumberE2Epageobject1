package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(linkText = "Log in")
    public WebElement loginlink;
    @FindBy(id="Email")
    public WebElement emailidTextbox;
    @FindBy(id="Password")
    public WebElement passwordTextbox;
    @FindBy(css = "input.login-button")
    public WebElement loginbutton;

    public void clickloginlink()
    {
        loginlink.click();
    }

    public void enterTextbox(String email)
    {
        emailidTextbox.sendKeys(email);
    }
    public void enterpasswordTextbox(String pwd)
    {
        passwordTextbox.sendKeys(pwd);
    }
    public void clickloginbutton()
    {
        loginbutton.click();
    }
    public void navigateurl(String url)
    {
        driver.navigate().to(url);
    }
}
