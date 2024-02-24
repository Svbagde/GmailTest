package baseclass;

import dev.failsafe.internal.util.Durations;
import org.joda.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

    public static WebDriver driver;

    public static void initialization() {
        try {
            driver = new ChromeDriver();

            // for headless browser.
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--headless");
//                options.addArguments("--disable-gpu");
//                options.addArguments("window-size=1056x1936");
//                driver = new ChromeDriver(options);

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
//            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void tearDown(){
        try{
            driver.close();
        }catch (Throwable e){
            e.printStackTrace();
        }
    }
    protected void setSleepTime(long millis) {

        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

