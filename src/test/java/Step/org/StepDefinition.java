package Step.org;


import javax.xml.xpath.XPath;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	  Select s;
	

	@Given("To Click Create New Account")
	public void to_Click_Create_New_Account() throws InterruptedException {
		Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	}

	@When("To Enter First Name in First name field")
	public void to_Enter_First_Name_in_First_name_field() throws InterruptedException {
		Thread.sleep(3000);
	 WebElement Fname = driver.findElement(By.name("firstname"));
	 fillText(Fname, "Vijay");
	}

	@When("To Enter Last Name in Last name field")
	public void to_Enter_Last_Name_in_Last_name_field() throws InterruptedException {
		
		 WebElement Fname = driver.findElement(By.name("lastname"));
		 fillText(Fname, "Boopathy");
	}

	@When("To Enter Mobile Number or Emailid  In Mobile Number or EmailId Field")
	public void to_Enter_Mobile_Number_or_Emailid_In_Mobile_Number_or_EmailId_Field() {
		  WebElement mobile = driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
		   fillText(mobile, "6382174715");
	}

	@When("To Enter New PassWord")
	public void to_Enter_New_PassWord() {
	    	WebElement pass = driver.findElement(By.xpath("(//input[@type=\"password\"])[2]"));
	    	fillText(pass, "Vij@y24");
	}


	@When("To Enter Date")
	public void to_Enter_Date() {
		WebElement date = driver.findElement(By.name("birthday_day"));
		s = new Select(date);
		 s.selectByValue("24");
	}

	@When("To Enter Month")
	public void to_Enter_Month() {
		WebElement month = driver.findElement(By.name("birthday_month"));
		 s= new Select(month);
		 s.selectByIndex(8);
	}

	@When("To Enter Year")
	public void to_Enter_Year() {
		WebElement year = driver.findElement(By.name("birthday_year"));	   
	    s= new Select(year);
	    s.selectByVisibleText("2000");
	   
	}

	
	@When("To Enter Gender")
	public void to_Enter_Gender() {
	    WebElement Male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	    btnClick(Male);
	}

	@When("To Click SignUp Button")
	public void to_Click_SignUp_Button() {
	   WebElement signup = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
	   btnClick(signup);
	}

	
}
