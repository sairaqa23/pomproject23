package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;
	String username = "demo@codefios.com";
	String password = "abc123";
	String dashboardvalText = "Dashboard";
	
  @Test(priority = 1)
	public void validUserShouldBeAbleToLogin() {
		
  driver = BrowserFactory.init();
LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
loginPage.insertUserName(username);	
loginPage.insertPassword(password);
loginPage.clickSiginButton();
DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
dashboardPage.validateDashboardPage(dashboardvalText);	
dashboardPage.clickOnCustomer();
dashboardPage.clickOnaddCustomer();
  BrowserFactory.tearDown();
  }
		
		
		



}
