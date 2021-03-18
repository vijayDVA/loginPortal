import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.login.web.Dao.RegisterDao;
import com.login.web.model.Member;

public class Testcases {
	String uname = "rajini";
	String password = "rajini";
	String email = "rajini@gmail.com";
	Member member = new Member(uname, password, email);
	RegisterDao rDao = new RegisterDao();
	
	@Test
	public final void TestRegistration()
	{
		try 
        {
			
		boolean bo = rDao.insert(member);
			assertEquals(true,bo);
		} catch (Exception e) 
        {
			System.out.println(e.getMessage());
		}
	}
	@Test
	public final void TestLogin()
	{
		try 
        {					
		boolean bo1= rDao.validate(member);
		assertEquals(true,bo1);
		
		rDao.delete();
		
        } catch (Exception e) 
        {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String args[])
    {			
        org.junit.runner.JUnitCore.main("TestCases");
         
     }
}
