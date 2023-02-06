package org.stepdefinition;

import java.io.IOException;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;



public class HooksClass extends BaseClass {

	@Before(order=1)
	public void before() {
		launchBrowser();
		
		 
	}
	@Before(order=2)
	public void before2() {
		 launchUrl("https://www.facebook.com/");	

	}
	@Before(order=3)
	public void before3() {
		 maximize();

	}
@After
public void After(Scenario s) throws IOException {
String name = s.getName();
String replace = name.replace(" ", "_");
toScreenShot(replace);


}
@After(order=2)
public void after2() {
	System.out.println("take screensort");
}
@After(order=1)
public void after() {
	toQuit();

}
}
