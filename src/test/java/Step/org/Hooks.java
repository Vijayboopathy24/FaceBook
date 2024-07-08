package Step.org;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks extends BaseClass {

	@Before
	public void bef() {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
	}
	
	
	
}
