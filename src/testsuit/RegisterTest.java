package testsuit;
   /*Write down the following test into ‘RegisterTest’ class
1. userShouldNavigateToRegisterPageSuccessfully

        * click on the ‘Register’ link
        * Verify the text ‘Register’

        2. userShouldRegisterAccountSuccessfully

        * click on the ‘Register’ link
        * Select gender radio button
        * Enter First name
        * Enter Last name
        * Select Day Month and Year
        * Enter Email address
        * Enter Password
        * Enter Confirm password
        * Click on REGISTER button

        * Verify the text 'Your registration completed’  */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;
public class RegisterTest extends BaseTest {
    String baseurl="https://demo.nopcommerce.com/";
    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //Click on Register link
        WebElement register=driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        register.click();
        //verify the text register
        //WebElement registerLink=driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        WebElement registerLink = driver.findElement(By.xpath("//div[@class='page-title']"));
        String actualText=registerLink.getText();
        String expectedText="Register";
        assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //click on the ‘Register’ link
        WebElement register=driver.findElement(By.xpath("//div[@class='header-links']//a[text()='Register']"));
        register.click();
        //Select gender radio button
        WebElement gender=driver.findElement(By.xpath("//div[@id='gender']//span[@class='male']"));
        gender.click();
        //Enter First name
        WebElement firstname=driver.findElement(By.xpath("//input[@id='FirstName'"));
        firstname.sendKeys("j");
        //Enter Last name
        WebElement lastname=driver.findElement(By.id("LastName"));
        lastname.sendKeys("p");
        //Select Day
        WebElement day=driver.findElement(By.name("DateOfBirthDay"));
        Select select=new Select(day);
        select.selectByVisibleText("01"); //select by string visible text
        //select month
        WebElement month=driver.findElement(By.xpath("//div[@class='date-picker-wrapper']//select[@name='DateOfBirthMonth']"));
        Select select1=new Select(month);
        select1.selectByVisibleText("January");
        //Select year
        WebElement year=driver.findElement(By.name("DateOfBirthYear"));
        Select select2=new Select(year);
        select2.selectByVisibleText("1970");
        //Enter Email address
        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("pearldiya74@gmail.com");
        //Enter Password
        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("1234567a");
        //Enter Confirm password
        WebElement confirmed=driver.findElement(By.id("ConfirmPassword"));
        confirmed.sendKeys("1234567a");
        //Click on REGISTER button
        WebElement RegisterButton=driver.findElement(By.id("register-button"));
        RegisterButton.click();
        // Verify the text Your registration completed
        WebElement registerCompleted=driver.findElement(By.xpath("//div[@class='result']"));
        String actualText=registerCompleted.getText();
        String expectedText="Your registration completed";
        assertEquals(expectedText,actualText);
    }
    @After
    public void teardown(){
        closeBrowser();
    }
}
