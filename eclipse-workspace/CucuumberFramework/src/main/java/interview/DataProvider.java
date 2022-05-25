package interview;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider = "getData")
	public void UsingDataProvider(String username,String password,String name,String lastName) {
		System.out.println("Username " + username );
		System.out.println("Password " + password);
		System.out.println("Password " + name);
		System.out.println("Password " + lastName);
		
	}
	@org.testng.annotations.DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][4];
		
		data[0][0]="abc";
		data[0][1]="123";
		data[0][2]="Max";
		data[0][3]="K";		
		data[1][0]="xyz";
		data[1][1]="321";
		data[1][2]="Jon";
		data[1][3]="M";		
		data[2][0]="klm";
		data[2][1]="333";
		data[2][2]="Tom";
		data[2][3]="F";
		
		return data;
	}
	
}
