package package1;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() {
		String Url = System.getProperty("url");
		String Browser = System.getProperty("browser");
		String UN = System.getProperty("username");
		String PWD = System.getProperty("password");
		System.out.println(Url);
		System.out.println(Browser);
		System.out.println(UN);
		System.out.println(PWD);
		System.out.println("Execute CreateContactTest");
	}
	
	
	@Test
	public void modifyContact() {
		System.out.println("Execute Contact modified");
	}
	
	@Test
	public void deleteContact() {
		System.out.println("Execute delete Contact");
	}
	
	@Test
	public void VerifyContact() {
		System.out.println("Execute Verify Contact");
	}
	
	
}
