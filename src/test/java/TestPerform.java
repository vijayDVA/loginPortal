import com.login.web.model.Member;

public class TestPerform {

	Testcases testc;
	public TestPerform(Testcases testc) {
		this.testc = testc;
	}

	public boolean performI(Member member)

	{
		return testc.insert(member);
	}
	
	public boolean performV(Member member)
	{
		return testc.validate(member);
	}
}
