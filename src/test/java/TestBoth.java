
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import com.login.web.model.Member;

public class TestBoth {
	
	TestPerform testperform=null;
	Testcases testc= Mockito.mock(Testcases.class);
	Member member = new Member();
	
	@Before
	public void setup()
	{
		testperform = new TestPerform(testc);
	}

	@Test
	public void testReg()
	{
		when(testc.insert(member)).thenReturn(true);
		assertEquals(true,testperform.performI(member));
	}
	@Test
	public void testLogin()
	{
		when(testc.validate(member)).thenReturn(true);
		assertEquals(true,testperform.performV(member));
	}
}
