import com.login.web.model.Member;

public interface Testcases
{
	String uname = "rajini";
	String password = "rajini";
	String email = "rajini@gmail.com";
	//Member member = new Member(uname, password, email);
	public boolean validate(Member member);
	public boolean insert(Member memer);
}
