import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"stepDefinitions"},
        dryRun =false,
        monochrome = true,
        plugin = {"pretty","html:target/cucumber-html-report",
                "html:target/html_report/cucumber_reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)

@Listeners({ExtentITestListenerClassAdapter.class})
public class myRunner extends AbstractTestNGCucumberTests {

}
