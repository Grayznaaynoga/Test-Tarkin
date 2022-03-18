import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestJob {
    public static WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Calculator()
             {
        driver.navigate().to("https://www.google.com/");
        var calculator = "Калькулятор";
        driver.findElement(By.xpath("//input[@title=\"Поиск\"]")).sendKeys(calculator);
        driver.findElement(By.xpath("//input[@title=\"Поиск\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@jsname=\"jhotKb\"]")).click();
        driver.findElement(By.xpath("//div[@jsname=\"jhotKb\"]")).sendKeys("1*2-3+1");
        driver.findElement(By.xpath("//div[@jsname=\"jhotKb\"]")).sendKeys(Keys.ENTER);
        WebElement element = driver.findElement(By.id("cwos"));
                String result = element.getAttribute("textContent");
        System.out.println(result);


    }


}
