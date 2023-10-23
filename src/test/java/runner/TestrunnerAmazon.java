package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\MYPC\\eclipse-workspace\\CucumberEndProject\\src\\test\\java\\features\\webpage.feature",
				 glue = {"steps"},
				 plugin={"pretty",
							"html:target/cucumberreport2.html"},
				 tags = "@all")


public class TestrunnerAmazon {

}

