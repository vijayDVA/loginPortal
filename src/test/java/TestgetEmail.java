
import org.junit.Before;


import org.junit.Test;
import static org.mockito.Mockito.*;
import com.login.web.Dao.RegisterDao;
import com.login.web.model.Member;
import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import com.login.web.getemail2;

public class TestgetEmail {

	@Test
	public void testGmail() throws SQLException
	{
	getemail2 gete =new getemail2();
	RegisterDao loginDao= mock(RegisterDao.class);
	
	
	when(loginDao.GetEmail(any(Member.class))).thenReturn("dva");
	gete.loginDao = loginDao;

	String stg= gete.getemail();
	
	assertEquals("dva",stg);
	}
	
	
}
