package interview;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgWithParameters {
	
	@Parameters({"URL","username","password"})
	@Test
	public void testParameters(String value,String user,String pass) {
		System.out.println("Using Parametes " + value);
		System.out.println("Using Parametes " + user);
		System.out.println("Using Parametes " + pass);
		
	}
	@Parameters({"driver","name","lastname"})
	@Test
	public void testParameters2(String driver,String name,String lastname) {
		System.out.println("Using Parametes " + driver);
		System.out.println("Using Parametes " + name);
		System.out.println("Using Parametes " + lastname);
}}

