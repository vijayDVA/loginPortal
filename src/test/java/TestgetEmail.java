
import org.junit.Test;
import static org.mockito.Mockito.*;
import com.login.web.Dao.RegisterDao;
import com.login.web.model.Member;
import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import com.login.web.getemail2;

public class TestgetEmail {

	RegisterDao loginDao = mock(RegisterDao.class);
	
	getemail2 gete =new getemail2();

		
	@Test
	public void testGmail() throws SQLException
	{
		

	when(loginDao.GetEmail(any(Member.class))).thenReturn("dva");
	
	gete.loginDao = loginDao;	
	String stg= gete.getemail();
	
	assertEquals("dva",stg);
	}
	
	  @Test
	    public void whenAddCalledAnswered() {
	        
	        doAnswer(invocation -> {
	            int arg0 = invocation.getArgument(0);
	            int arg1 = invocation.getArgument(1);

	            //do something with the arguments here
	            System.out.print(arg0+arg1);
	            assertEquals(5, arg0+arg1);
	          
	            return null;
	        }).when(loginDao).add(anyInt(), anyInt());
	        loginDao.add(3, 2);
	    }
	
	
}
