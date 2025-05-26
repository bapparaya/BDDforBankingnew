package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;

    public BaseClass(){
//        try {
//            prop = new Properties();
//            FileInputStream fp = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\config\\configelements.txt");
//            prop.load(fp);
//        }
//        catch(Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(System.getProperty("user.dir"));
//
   }

    public void initialize(String browser){
        //this is added by bapparaya
        if(browser.equals("chrome")) {
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }else {
            System.out.println("oops...invalid browser please provide valid browser ): ");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");

    }

}
