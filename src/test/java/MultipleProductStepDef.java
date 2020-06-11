import PageObjects.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; */

import java.util.concurrent.TimeUnit;


public class MultipleProductStepDef extends TestRunner
{
    //  WebDriver driver;
     LoginPage loginpage;
     Productpage productpage;
     CartPage cartpage;
     CheckoutPage checkoutPage;
     OrderCompletedPage ordersuccesspage;

    @Before
    public void begin()
    {

        System.out.println("begin");
        //WebDriverManager.chromedriver().setup();
       // driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        loginpage=new LoginPage(driver);
        productpage = new Productpage(driver);
        cartpage=new CartPage(driver);
        checkoutPage=new CheckoutPage(driver);
        ordersuccesspage=new OrderCompletedPage(driver);
    }
    @After
    public void end(Scenario scenario)
    {
       byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshotBytes, "image/png");
        System.out.println("end");

        //driver.close();
    }
    @Given("I navigate into url {string}")
    public void i_navigate_into_url(String url)
    {
        loginpage.navigateurl(url);
    }

    @When("click login link on home page")
    public void click_login_link_on_home_page()
    {
    loginpage.clickloginlink();

    }

    @Then("should see login page")
    public void should_see_login_page()
    {

    System.out.println(driver.getTitle());
    }

    @When("enter email {string}")
    public void enter_email(String email)
    {
     loginpage.enterTextbox(email);

    }

    @When("enter password {string}")
    public void enter_password(String pwd)
    {
     loginpage.enterpasswordTextbox(pwd);
    }

    @When("click login button")
    public void click_login_button()
    {
    loginpage.clickloginbutton();
    }

    @Then("Should see home page")
    public void should_see_home_page()
    {
    System.out.println(driver.getTitle());
    }

    @When("add item1 into cart")
    public void add_item1_into_cart()throws InterruptedException
    {
        Thread.sleep(2000);
    productpage.additem1();
    }

    @When("add item2 into cart")
    public void add_item2_into_cart()throws InterruptedException
    {
     Thread.sleep(2000);
    productpage.additem2();
    }

    @When("add item3 into cart")
    public void add_item3_into_cart()throws InterruptedException
    {
    Thread.sleep(2000);
    productpage.additem3();
    }

    @When("go to cart")
    public void go_to_cart()
    {
    cartpage.shoppingcart();
    }

    @When("Should appear items into cart")
    public void should_appear_items_into_cart()
    {
        System.out.println(driver.findElement(By.xpath("//input[@value='Update shopping cart']")).isDisplayed());
    }

    @When("click checkout")
    public void click_checkout()
    {
    cartpage.termofserviceandcheckout();
    }

    @When("select billing address")
    public void select_billing_address()throws InterruptedException
    {
        Thread.sleep(2000);
        checkoutPage.billingaddress();
    }

    @When("select shipping address")
    public void select_shipping_address()
    {
       //checkoutPage.shippingaddress();
    }

    @When("Select shipping method")
    public void select_shipping_method()throws InterruptedException
    {
        Thread.sleep(2000);
        checkoutPage.shippingmethod();
    }

    @When("select payment method")
    public void select_payment_method()throws InterruptedException
    {
        Thread.sleep(2000);
        checkoutPage.paymentmethodaddress();
    }

    @When("provide payment info")
    public void provide_payment_info()throws InterruptedException
    {
        Thread.sleep(2000);
        checkoutPage.paymentinfo();

    }

    @When("confirm order")
    public void confirm_order()throws InterruptedException
    {
        Thread.sleep(2000);
        checkoutPage.orderconfirmbutton();
    }

    @Then("should see order confirm message")
    public void should_see_order_confirm_message()throws InterruptedException
    {

       Thread.sleep(2000);
       ordersuccesspage.ordersuccessmsg();
    }

}
