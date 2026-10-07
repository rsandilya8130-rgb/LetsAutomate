package Package2;

import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void createOrgTest() {
		System.out.println("Execute CreateOrgTest");
		String Url = System.getProperty("url");
		String Browser = System.getProperty("browser");
		String UN = System.getProperty("username");
		String PWD = System.getProperty("password");
		System.out.println(Url);
		System.out.println(Browser);
		System.out.println(UN);
		System.out.println(PWD);
	}
	
	
	@Test
	public void modifyOrg() {
		System.out.println("Execute Org modified");
	}
}
