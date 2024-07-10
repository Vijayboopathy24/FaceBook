package Step.org;


import javax.xml.xpath.XPath;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Pojo.org.FBpojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	  Select s;	
	  FBpojo fb;

	@Given("To Click Create New Account")
	public void to_Click_Create_New_Account() throws InterruptedException {
		Thread.sleep(3000);
		fb = new FBpojo();
	    WebElement createACC = fb.getCreateAcc();
	    btnClick(createACC);
	}

	@When("To Enter First Name in First name field")
	public void to_Enter_First_Name_in_First_name_field() throws InterruptedException {
		Thread.sleep(3000);
		fb = new FBpojo();
		WebElement fName = fb.getfName();	 
	    fillText(fName, "Vijay");
	}

	@When("To Enter Last Name in Last name field")
	public void to_Enter_Last_Name_in_Last_name_field() throws InterruptedException {
		fb = new FBpojo();
		WebElement lName = fb.getLName();		 
		 fillText(lName, "Boopathy");
	}

	@When("To Enter Mobile Number or Emailid  In Mobile Number or EmailId Field")
	public void to_Enter_Mobile_Number_or_Emailid_In_Mobile_Number_or_EmailId_Field() {
		fb = new FBpojo();
		WebElement email = fb.getEmail();
		   fillText(email, "6382174715");
	}

	@When("To Enter New PassWord")
	public void to_Enter_New_PassWord() {
		fb = new FBpojo();
	    	WebElement pass = fb.getPass();
	    	fillText(pass, "Vij@y24");
	}


	@When("To Enter Date")
	public void to_Enter_Date() {
		fb = new FBpojo();
		WebElement day = fb.getbDay();
		s = new Select(day);
		 s.selectByValue("24");
	}

	@When("To Enter Month")
	public void to_Enter_Month() {
		fb = new FBpojo();
		WebElement month = fb.getMonth();
		 s= new Select(month);
		 s.selectByIndex(8);
	}

	@When("To Enter Year")
	public void to_Enter_Year() {
		fb = new FBpojo();
		WebElement year = fb.getYear();   
	    s= new Select(year);
	    s.selectByVisibleText("2000");
	   
	}

	
	@When("To Enter Gender")
	public void to_Enter_Gender() {
		fb = new FBpojo();
		WebElement gender = fb.getGender();	    
	    btnClick(gender);
	}

	@When("To Click SignUp Button")
	public void to_Click_SignUp_Button() {
		fb = new FBpojo();
		WebElement signup = fb.getSignup();
	   
	   btnClick(signup);
	}

	

	@Given("Enter Valid UserName")
	public void enter_Valid_UserName() {
	    WebElement email = driver.findElement(By.name("email"));
	    fillText(email, "Vijay");
	}

	@Given("Enter Invalid Password")
	public void enter_Invalid_Password() {
		 WebElement pass = driver.findElement(By.name("pass"));
		    fillText(pass, "2482000");
	}

	@Given("Click Login Button")
	public void click_Login_Button() {
	    WebElement login = driver.findElement(By.xpath("//button[text()='Log in']"));
	    btnClick(login);
	}

	@Then("Close The Browser")
	public void close_The_Browser() {
	  closeBrowser();
	}


}
