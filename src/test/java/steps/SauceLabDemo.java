package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLabDemo {
	static WebDriver driver;
	String username = "standard_user";
	String password = "secret_sauce";
	
	@Given("I launch the web application")
	public void i_launch_the_web_application() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@When("I enter username and password")
	public void i_enter_username_and_password() {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}
	@Then("I click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}
	@Then("I check if the element is present or not")
	public void i_check_if_the_element_is_present_or_not() {
	    
	    WebElement hamburgermenu = driver.findElement(By.xpath("//button[@id= \"react-burger-menu-btn\"]"));
	    if(hamburgermenu.isDisplayed()) {
	    	System.out.println("Logo is present");
	    	driver.quit();
	    
	}
	}

}
