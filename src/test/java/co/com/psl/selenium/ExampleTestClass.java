package co.com.psl.selenium;

import org.junit.Test;
import co.com.psl.HomePage;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;

@Config(
		browser = Browser.CHROME,
        url     = "http://seleniumhq.org"
)
public class ExampleTestClass extends Locomotive {
	
	@Test
	public void method(){
		
		validatePresent(HomePage.LOC_LNK_PROJECTSTAB);
	}
}
