import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       loginPage=new LoginPage(driver);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();
   }
   @AfterClass
    public void tearDown(){
        driver.quit();
   }
}
