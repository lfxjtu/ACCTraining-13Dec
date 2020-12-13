import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {
@Test
    public void visitACCHomepage() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://acc.co.nz");
        driver.manage().window().maximize();
    }
}



