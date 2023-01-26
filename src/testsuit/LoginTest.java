package testsuit;
        /*  Write down the following test into ‘LoginTest’ class 1. userShouldNavigateToLoginPageSuccessfully
        * click on the ‘Login’ link
        * Verify the text ‘Welcome, Please Sign
        In!’    */
import static org.junit.Assert.assertEquals;
import browserfactory.BaseTest;
import graphql.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoginTest extends BaseTest {
        String baseurl="https://demo.nopcommerce.com/";
        @Before
        public void setup(){
                openBrowser(baseurl);
        }
        @Test
        public void userShouldNavigateToLoginPageSuccessfully(){
                //Click on Login link
                WebElement loginInLink=driver.findElement(By.className("ico-login"));
                loginInLink.click();

                //Verify welcome message
                WebElement welcomeMsg=driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
                String actualText=welcomeMsg.getText();
                String expectedText="Welcome, Please Sign In!";
                assertEquals(expectedText,actualText);
        }

        @Test
        public void userShouldLoginSuccessfullyWithValidCredentials(){
                //Click on Login link
                WebElement loginInLink=driver.findElement(By.className("ico-login"));
                loginInLink.click();

                //enter email id in to email field
                WebElement emailIdField=driver.findElement(By.id("Email"));
                emailIdField.sendKeys("pearldiya74@gmail.com");

                //enter password into password field
                WebElement passwordField=driver.findElement(By.name("Password"));
                passwordField.sendKeys("1234567a");

                //click on login button
                WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
                loginButton.click();

                //Verify Log out link
                //WebElement logOutLink=driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
                WebElement logOutLink = driver.findElement(By.xpath("//a[@class='ico-logout']"));
                String actualText=logOutLink.getText();
                String expectedText="Log out";
                assertEquals(expectedText,actualText);
        }

        @Test
        public void verifyTheErrorMessage(){
                WebElement loginInLink=driver.findElement(By.className("ico-login"));
                loginInLink.click();

                //enter email id in to email field
                WebElement emailIdField=driver.findElement(By.id("Email"));
                emailIdField.sendKeys("pearldiy74@gmail.com");

                //enter password into password field
                WebElement passwordField=driver.findElement(By.name("Password"));
                passwordField.sendKeys("123");

                //click on login button
                WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
                loginButton.click();
                //Verify the error message
                WebElement welcomeMsg = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
                String actualText = welcomeMsg.getText();
                String expectedText = "Login was unsuccessful. Please correct the errors and try again.\n" +
                        "No customer account found";
                String split[] = expectedText.split("No", 0);
                System.out.println(split);
                 System.out.println(expectedText.substring(64));
                Assert.assertEquals(expectedText,actualText);



        }

        @After
        public void teardown(){
                closeBrowser();
        }
}



