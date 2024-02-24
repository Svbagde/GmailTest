package stepDefinitions;

import baseclass.BaseClass;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;

public class gmailStepDefination extends BaseClass {

    @Given("user open webBrowser")
    public void user_open_web_browser() {
        BaseClass.initialization();
    }
    @Given("user already on login page")
    public void user_already_on_login_page() {
        setSleepTime(1000);
        driver.get("https://www.google.com/gmail/about/");
        Assert.assertEquals(driver.getTitle(),"Gmail: Private and secure email at no cost | Google Workspace","your title is :>"+driver.getTitle());

    }
    @When("user enter all valid credentials")
    public void user_enter_all_valid_credentials(){
        driver.findElement(By.xpath("//*[text()='Sign in']")).click();
        setSleepTime(1000);
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("abc@gmail.com");
        setSleepTime(1000);
        driver.findElement(By.xpath("//*[text()='Next']")).click();
        setSleepTime(1000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
        setSleepTime(1000);
        driver.findElement(By.xpath("//*[text()='Next']")).click();
    }
    @When("click on login button")
    public void click_on_login_button() {
    driver.findElement(By.xpath("//*[text()='Login']")).click();
    }
    @Then("Homepage should open")
    public void homepage_should_open() {
    driver.getTitle();
    }
    @Given("user click on compose button")
    public void user_click_on_compose_button() {
    driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
    }
    @Given("enter all details")
    public void enter_all_details() {
    driver.findElement(By.xpath("//input[@id=':wp']")).sendKeys("xyz@gmail.com");
    driver.findElement(By.xpath("//input[@id=':sh']")).sendKeys("Incubyte");
    driver.findElement(By.xpath("//div[@id=':u3']")).sendKeys("Automation QA test for Incubyte");
    }
    @When("click on sent button")
    public void click_on_sent_button() {
    driver.findElement(By.xpath("//div[@id=':25']")).click();
    }
}
