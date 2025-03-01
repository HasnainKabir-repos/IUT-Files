
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
    public void signUp1(){
        chrome.get("https://thinking-tester-contact-list.herokuapp.com/addUser");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));

        chrome.findElement(By.id("firstName")).sendKeys("Hasnain");
        chrome.findElement(By.id("lastName")).sendKeys("Kabir");
        chrome.findElement(By.id("email")).sendKeys("hasnainkabir_102");
        chrome.findElement(By.id("password")).sendKeys("1234567");

        chrome.findElement(By.id("submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
        WebElement errorMessageElement = chrome.findElement(By.id("error"));

        String errorMessage = errorMessageElement.getText();
        assert errorMessage.contains("User validation failed: email: Email is invalid") : "Error message validation failed";


    }

    @Test
    public void signUp2(){
        chrome.get("https://thinking-tester-contact-list.herokuapp.com/addUser");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));

        chrome.findElement(By.id("firstName")).sendKeys("Hasnain");
        chrome.findElement(By.id("lastName")).sendKeys("Kabir");
        chrome.findElement(By.id("email")).sendKeys("hasnainkabir_102@user.com");
        chrome.findElement(By.id("password")).sendKeys("123456");

        chrome.findElement(By.id("submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
        WebElement errorMessageElement = chrome.findElement(By.id("error"));

        String errorMessage = errorMessageElement.getText();
        assert errorMessage.contains("User validation failed: password: Path `password` (`123456`) is shorter than the minimum allowed length (7).") : "Error message validation failed";

    }

    @Test
    public void signUp3(){
        chrome.get("https://thinking-tester-contact-list.herokuapp.com/addUser");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));

        chrome.findElement(By.id("firstName")).sendKeys("Hasnain");
        chrome.findElement(By.id("lastName")).sendKeys("Kabir");
        chrome.findElement(By.id("email")).sendKeys("hasnain.kabir_102@user.com");
        chrome.findElement(By.id("password")).sendKeys("1234567");

        chrome.findElement(By.id("submit")).click();
        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://thinking-tester-contact-list.herokuapp.com/addUser")));

        String redirectedUrl = chrome.getCurrentUrl();

        String expectedUrl = "https://thinking-tester-contact-list.herokuapp.com/contactList";

        assert redirectedUrl.equals(expectedUrl) : "Redirection failed";

    }

    @Test
    public void login1(){
        chrome.get("https://thinking-tester-contact-list.herokuapp.com/login");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        chrome.findElement(By.id("email")).sendKeys("hasnain_102@user.com");
        chrome.findElement(By.id("password")).sendKeys("12345");

        chrome.findElement(By.id("submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
        WebElement errorMessageElement = chrome.findElement(By.id("error"));

        String errorMessage = errorMessageElement.getText();
        assert errorMessage.contains("Incorrect username or password") : "Error message validation failed";

    }

    @Test
    public void login2(){
        chrome.get("https://thinking-tester-contact-list.herokuapp.com/login");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

        chrome.findElement(By.id("email")).sendKeys("hasnain_102@user.com");
        chrome.findElement(By.id("password")).sendKeys("1234567");

        chrome.findElement(By.id("submit")).click();

        wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe("https://thinking-tester-contact-list.herokuapp.com/login")));

        String redirectedUrl = chrome.getCurrentUrl();

        String expectedUrl = "https://thinking-tester-contact-list.herokuapp.com/contactList";

        assert redirectedUrl.equals(expectedUrl) : "Redirection failed";

    }

    @Test
    public void contactList1(){
        chrome.get("https://thinking-tester-contact-list.herokuapp.com/contactList");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-contact")));
        chrome.findElement(By.id("add-contact")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));

        chrome.findElement(By.id("firstName")).sendKeys("HHHH");
        chrome.findElement(By.id("submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
        WebElement errorMessageElement = chrome.findElement(By.id("error"));

        String errorMessage = errorMessageElement.getText();
        assert errorMessage.contains("undefined") : "Error message validation failed";

    }

    @Test
    public void contactList2(){
        chrome.get("https://thinking-tester-contact-list.herokuapp.com/contactList");

        WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-contact")));
        chrome.findElement(By.id("add-contact")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));

        chrome.findElement(By.id("firstName")).sendKeys("HHHH");
        chrome.findElement(By.id("lastName")).sendKeys("IIII");
        chrome.findElement(By.id("birthdate")).sendKeys("01-01-2000");
        chrome.findElement(By.id("submit")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
        WebElement errorMessageElement = chrome.findElement(By.id("error"));

        String errorMessage = errorMessageElement.getText();
        assert errorMessage.contains("undefined") : "Error message validation failed";

    }


    @AfterAll
    public static void AfterAll(){
        chrome.quit();
    }
}
