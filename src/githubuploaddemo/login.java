package githubuploaddemo;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.data;
import pom.actime_login;



public class login extends BaseTest {
	@Test
	public void loginscript()
	{
		actime_login ob = new actime_login(driver);
		ob.setusername(data.getdata(excelpath, "sheet1", 0, 0));
		ob.setpassword(data.getdata(excelpath, "sheet1", 1, 0));
		ob.clicklogin();
		ob.titlewait("actiTIME - Enter Time-Track");
	}
	

}

}
