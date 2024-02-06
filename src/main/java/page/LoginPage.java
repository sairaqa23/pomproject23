package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	

	@FindBy(how = How.XPATH, using = "//input[@id='user_name']")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@id='login_submit']")
	WebElement SIGN_IN_BUTTON;

//  INDIVIDUAL METHODS
	public void insertUserName(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
	}

	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);

	}

	public void clickSiginButton() {

		SIGN_IN_BUTTON.click();
	}

//   COMBINED METHODS
           public void performLogin(String username, String password) {
       	           	   USER_NAME_ELEMENT.sendKeys(username);
        	   PASSWORD_ELEMENT.sendKeys(password);
       	   SIGN_IN_BUTTON.click();
          }
}
