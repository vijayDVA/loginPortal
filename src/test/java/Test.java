import com.login.web.Dao.RegisterDao;
import com.login.web.model.Member;

public class Test implements Testcases{

	RegisterDao rDao = new RegisterDao();
	@Override
	public boolean validate(Member member) {
		return rDao.validate(member);
	}

	@Override
	public boolean insert(Member member) {
		return rDao.insert(member);
	}

}
