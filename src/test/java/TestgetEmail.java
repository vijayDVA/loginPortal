
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.mockito.Mockito;

import com.login.web.Dao.RegisterDao;
import com.login.web.model.Member;

import static org.mockito.Mockito.*;

import java.sql.SQLException;

import com.login.web.getemail2;

public class TestgetEmail {

	RegisterDao loginDao= Mockito.mock(RegisterDao.class);
	Member loginBean = new Member();
	getemail2 gete = new getemail2();
	
	
	@Test
	public void testGmail() throws SQLException
	{
		when(loginDao.GetEmail(loginBean)).thenReturn("dva");
		assertEquals("dva",gete.getemail());
	}
	
	
}
