package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import page.NewCustomerPage;
import util.BrowserFactory;

public class NewCustomerTest {

   WebDriver driver;
	
	String username = "demo@codefios.com";
	String password = "abc123";
	String dashboardvalText = "Dashboard";
	String newCustomerText = "New Customer";
   String fullName = "Selenium";
   String company = "Techfios";
   @Test
   public void userShouldBeAbleToAddCustomer() {
	   
	   driver = BrowserFactory.init();
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	loginPage.performLogin(username, password);   
   
   DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
   dashboardPage.validateDashboardPage(dashboardvalText);
   dashboardPage.clickOnCustomer();
   dashboardPage.clickOnaddCustomer();
   
   
   NewCustomerPage newcustomerpage = PageFactory.initElements(driver, NewCustomerPage.class);
   newcustomerpage.validatenewCustomerPage(newCustomerText);
   newcustomerpage.insertfullName(fullName);
   newcustomerpage.selectCompany(company);
   
   }




}
