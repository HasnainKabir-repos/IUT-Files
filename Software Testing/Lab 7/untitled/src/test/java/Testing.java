
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Testing {
    static WebDriver chrome;
    @BeforeAll
    public static void beforeall(){
        System.setProperty("webdriver.chrome.driver","E:\\Software\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        chrome=new ChromeDriver(options);
    }



    @Test
    public void SignIn(){
        chrome.get("https://practicesoftwaretesting.com/#/auth/login");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        chrome.findElement(By.id("email")).sendKeys("customer@practicesoftwaretesting.com");
        chrome.findElement(By.id("password")).sendKeys("welcome01");

       // chrome.findElement(By.className("btnSubmit")).click();
    }

    @Test
    public void sortOptions(){
        chrome.get("https://practicesoftwaretesting.com/#");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*[data-test=\"sort\"]")));

        chrome.findElement(By.cssSelector("*[data-test=\"sort\"]")).click();
        {
            WebElement dropdown = chrome.findElement(By.cssSelector("*[data-test=\"sort\"]"));
            dropdown.findElement(By.xpath("//option[. = 'Name (A - Z)']")).click();
        }
        chrome.findElement(By.cssSelector("*[data-test=\"sort\"]")).click();
        {
            WebElement dropdown = chrome.findElement(By.cssSelector("*[data-test=\"sort\"]"));
            dropdown.findElement(By.xpath("//option[. = 'Name (Z - A)']")).click();
        }
        chrome.findElement(By.cssSelector("*[data-test=\"sort\"]")).click();
        {
            WebElement dropdown = chrome.findElement(By.cssSelector("*[data-test=\"sort\"]"));
            dropdown.findElement(By.xpath("//option[. = 'Price (High - Low)']")).click();
        }
        chrome.findElement(By.cssSelector("*[data-test=\"sort\"]")).click();
        {
            WebElement dropdown = chrome.findElement(By.cssSelector("*[data-test=\"sort\"]"));
            dropdown.findElement(By.xpath("//option[. = 'Price (Low - High)']")).click();
        }
    }

    @Test
    public void productDetails(){
        chrome.get("https://practicesoftwaretesting.com/#/product/01HVZQ8YXTC6H4FCRT8MZ69B87");
        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("description")));
        chrome.findElement(By.cssSelector("*[data-test=\"increase-quantity\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"increase-quantity\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"increase-quantity\"]")).click();
        chrome.findElement(By.cssSelector(".fa-minus")).click();
        chrome.findElement(By.cssSelector(".fa-minus")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"add-to-favorites\"]")).click();

    }

    @Test
    public void ContactPage(){
        chrome.get("https://practicesoftwaretesting.com/#/contact");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));

        boolean b1 = chrome.findElement(By.id("last_name")).isDisplayed();
        boolean b2 = chrome.findElement(By.id("email")).isDisplayed();
        boolean b3 = chrome.findElement(By.id("message")).isDisplayed();

        assertTrue(b1);
        assertTrue(b2);
        assertTrue(b3);
    }

    @Test
    public void Favourites(){
        chrome.get("https://practicesoftwaretesting.com/#/auth/login");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        chrome.findElement(By.id("email")).sendKeys("customer@practicesoftwaretesting.com");
        chrome.findElement(By.id("password")).sendKeys("welcome01");

        chrome.findElement(By.className("btnSubmit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa.fa-star")));
        chrome.findElement(By.cssSelector(".fa.fa-star")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("card-text")));
        boolean b1 = chrome.findElement(By.className("card-text")).isDisplayed();

        assertTrue(b1);
    }

    @Test
    public void ProfilePage(){
        chrome.get("https://practicesoftwaretesting.com/#/auth/login");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        chrome.findElement(By.id("email")).sendKeys("customer@practicesoftwaretesting.com");
        chrome.findElement(By.id("password")).sendKeys("welcome01");

        chrome.findElement(By.className("btnSubmit")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa.fa-address-card")));
        chrome.findElement(By.cssSelector(".fa.fa-address-card")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));

        boolean b1 = chrome.findElement(By.id("last_name")).isDisplayed();
        boolean b2 = chrome.findElement(By.id("email")).isDisplayed();


        assertTrue(b1);
        assertTrue(b2);
    }


    @Test
    public void testCheckOutBuyNowPayLater(){
        chrome.get("https://practicesoftwaretesting.com/#/auth/login");
        chrome.manage().window().setSize(new Dimension(649, 789));
        chrome.findElement(By.id("email")).sendKeys("customer@practicesoftwaretesting.com");
        chrome.findElement(By.id("password")).sendKeys("welcome01");

        chrome.findElement(By.className("btnSubmit")).click();
        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa.fa-star")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".navbar-toggler")));
        chrome.findElement(By.cssSelector(".navbar-toggler")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".navbar-toggler-icon")));
        chrome.findElement(By.cssSelector(".navbar-toggler-icon")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"nav-home\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"nav-home\"]")).click();
        chrome.get("https://practicesoftwaretesting.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[1]/div[1]/img")));
        chrome.findElement(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[1]/div[1]/img")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"increase-quantity\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"increase-quantity\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".navbar-toggler")));
        chrome.findElement(By.cssSelector(".navbar-toggler")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".navbar-toggler-icon")));
        chrome.findElement(By.cssSelector(".navbar-toggler-icon")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a/i")));
        chrome.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a/i")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"proceed-1\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"proceed-1\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"proceed-2\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"proceed-2\"]")).click();
        wait.until(ExpectedConditions.textToBePresentInElementValue(By.cssSelector("*[data-test=\"address\"]"), "Test street 98"));
        chrome.findElement(By.cssSelector("*[data-test=\"state\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"state\"]")).sendKeys("Dhaka");
        chrome.findElement(By.cssSelector("*[data-test=\"postcode\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"postcode\"]")).sendKeys("1001");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"proceed-3\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"proceed-3\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"payment-method\"]")).click();

        {
            WebElement dropdown = chrome.findElement(By.cssSelector("*[data-test=\"payment-method\"]"));
            dropdown.findElement(By.xpath("//option[. = 'Buy Now Pay Later']")).click();
        }
        chrome.findElement(By.cssSelector("*[data-test=\"monthly_installments\"]")).click();
        {
            WebElement dropdown = chrome.findElement(By.cssSelector("*[data-test=\"monthly_installments\"]"));
            dropdown.findElement(By.xpath("//option[. = '3 monthly installments']")).click();
        }
        chrome.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
    }
    @Test
    public void testCheckOutCreditCard(){
        chrome.get("https://practicesoftwaretesting.com/#/auth/login");
        chrome.manage().window().setSize(new Dimension(649, 789));
        chrome.findElement(By.id("email")).sendKeys("customer@practicesoftwaretesting.com");
        chrome.findElement(By.id("password")).sendKeys("welcome01");

        chrome.findElement(By.className("btnSubmit")).click();
        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa.fa-star")));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".navbar-toggler")));
        chrome.findElement(By.cssSelector(".navbar-toggler")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".navbar-toggler-icon")));
        chrome.findElement(By.cssSelector(".navbar-toggler-icon")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"nav-home\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"nav-home\"]")).click();
        chrome.get("https://practicesoftwaretesting.com/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[1]/div[1]/img")));
        chrome.findElement(By.xpath("/html/body/app-root/div/app-overview/div[3]/div[2]/div[1]/a[1]/div[1]/img")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"increase-quantity\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"increase-quantity\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".navbar-toggler")));
        chrome.findElement(By.cssSelector(".navbar-toggler")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".navbar-toggler-icon")));
        chrome.findElement(By.cssSelector(".navbar-toggler-icon")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a/i")));
        chrome.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a/i")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"proceed-1\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"proceed-1\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"proceed-2\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"proceed-2\"]")).click();
        wait.until(ExpectedConditions.textToBePresentInElementValue(By.cssSelector("*[data-test=\"address\"]"), "Test street 98"));
        chrome.findElement(By.cssSelector("*[data-test=\"state\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"state\"]")).sendKeys("Dhaka");
        chrome.findElement(By.cssSelector("*[data-test=\"postcode\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"postcode\"]")).sendKeys("1001");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"proceed-3\"]")));
        chrome.findElement(By.cssSelector("*[data-test=\"proceed-3\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"payment-method\"]")).click();
        {
            WebElement dropdown = chrome.findElement(By.cssSelector("*[data-test=\"payment-method\"]"));
            dropdown.findElement(By.xpath("//option[. = 'Credit Card']")).click();
        }
        chrome.findElement(By.cssSelector("*[data-test=\"credit_card_number\"]")).click();
        chrome.findElement(By.id("credit_card_number_help")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"credit_card_number\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"credit_card_number\"]")).sendKeys("0000-0000-0000-0000");
        chrome.findElement(By.cssSelector("*[data-test=\"expiration_date\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"expiration_date\"]")).sendKeys("10/2025");
        chrome.findElement(By.cssSelector("*[data-test=\"cvv\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"cvv\"]")).sendKeys("1233");
        chrome.findElement(By.cssSelector("*[data-test=\"card_holder_name\"]")).click();
        chrome.findElement(By.cssSelector("*[data-test=\"card_holder_name\"]")).sendKeys("tahlil");
        chrome.findElement(By.cssSelector("*[data-test=\"finish\"]")).click();
    }
    @AfterAll
    public static void AfterAll(){
        chrome.quit();
    }
}
