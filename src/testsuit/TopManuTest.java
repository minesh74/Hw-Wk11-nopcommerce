package testsuit;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;
public class TopManuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseurl);
    }

   @Test
   public void usershuoldNavigateToComputerPage() {
        //CLICK ON THE COMPUTER TAB
      WebElement computerText=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
     computerText.click();
    }

    @Test
    public void userShouldNavigateToElectronicPageSuccessfully(){
        //click on Electronictab
        WebElement ElectronicLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        ElectronicLink.click();


    //Verify the text Electronics
                WebElement electronic=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        String actualText=electronic.getText();
        String expectedText="Electronics";
        assertEquals(expectedText,actualText);
}
    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on Apparel
        WebElement ApparelLink=driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")));
        ApparelLink.click();


        //Verify the text Apparel
        WebElement LogOutLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        String actualText=LogOutLink.getText();
        String expectedText="Apparel";
        assertEquals(expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //click on Digital downloads
        WebElement DigitaldownloadslLink=driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")));
        DigitaldownloadslLink.click();


        //Verify the text Digital downloads
        WebElement LogOutLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"));
        String actualText=LogOutLink.getText();
        String expectedText="Digital downloads";
        assertEquals(expectedText,actualText);
    }
@Test
public void userShouldNavigateToBooksPageSuccessfully(){
    //click on Books
    WebElement BookslLink=driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']")));
    BookslLink.click();


    //Verify the text Books
    WebElement LogOutLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
    String actualText=LogOutLink.getText();
    String expectedText="Books";
    assertEquals(expectedText,actualText);

}
@Test
public void userShouldNavigateToJewelryPageSuccessfully(){
    //click on Jewelry
    WebElement JewelryLink=driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']")));
    JewelryLink.click();


    //Verify the text Jewelry
    WebElement LogOutLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
    String actualText=LogOutLink.getText();
    String expectedText="Jewelry";
    assertEquals(expectedText,actualText);

}
@Test
public void userShouldNavigateToGiftCardsPageSuccessfully(){
    //click on Gift Cards
    WebElement GiftCardsLink=driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']")));
    GiftCardsLink.click();


    //Verify the text Gift Cards
    WebElement LogOutLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
    String actualText=LogOutLink.getText();
    String expectedText="Gift Cards";
    assertEquals(expectedText,actualText);
}


        @After
        public void tearDown () {
            closeBrowser();
        }
    }
