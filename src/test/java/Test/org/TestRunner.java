package Test.org;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\VijayB\\Desktop\\SeleniumProject\\FaceBook\\src\\test\\resources" , glue = "Step.org"
,dryRun = false
,plugin= {"html:C:\\Users\\VijayB\\eclipse-workspace\\ProjectFB\\AllReport\\htmlReport",
		"junit:C:\\Users\\VijayB\\eclipse-workspace\\ProjectFB\\AllReport\\junitReport\\Fb.xml",
		"json:C:\\Users\\VijayB\\eclipse-workspace\\ProjectFB\\AllReport\\json\\Facebook.json"})

           


public class TestRunner {

}
