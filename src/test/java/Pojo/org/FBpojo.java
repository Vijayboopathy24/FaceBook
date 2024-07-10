package Pojo.org;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBpojo extends BaseClass {

	public FBpojo() {
		PageFactory.initElements(driver, this);
	}
	
		
	public WebElement getCreateAcc() {
		return createAcc;
	}

	

	public WebElement getfName() {
		return fName;
	}

	public WebElement getLName() {
		return LName;
	}

	public WebElement getEmail() {
		return email;
	}
	
	
	public WebElement getPass() {
		return Pass;
	}

	public WebElement getbDay() {
		return bDay;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSignup() {
		return signup;
	}
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createAcc;

	
	@FindBy(name="firstname")
	private WebElement fName;
	
	@FindBy(name="lastname")
	private WebElement LName;
	

	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy(xpath="//input[@data-type='password']")
	private WebElement Pass;
	
	@FindBy(name="birthday_day")
	private WebElement bDay;
	
	@FindBy(name="birthday_month")
	private WebElement month;
	
	@FindBy(name="birthday_year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement gender;
	
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement signup;
}
