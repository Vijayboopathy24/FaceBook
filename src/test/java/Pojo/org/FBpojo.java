package Pojo.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FBpojo {

	
	
	
	
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createAcc;
	
	@FindBy(xpath="//input[@placeholder='Mobile number or email address']")
	private WebElement email;
	
	@FindBy(name="firstname")
	private WebElement fName;
	
	@FindBy(name="lasttname")
	private WebElement LName;
	
	@FindBy(xpath="(//input[@type=\"password\"])[2]")
	private WebElement Pass;
	
	@FindBy(name="birthday_day")
	private WebElement bDay;
	
	
	
	
}
