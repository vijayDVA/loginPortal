package com.login.web;


import java.sql.SQLException;

import com.login.web.Dao.RegisterDao;
import com.login.web.model.Member;

public class getemail2 {

	static String uname;
	static String passwd;
	
	RegisterDao loginDao = new RegisterDao();
	Member loginBean = new Member();
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		getemail2.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		getemail2.passwd = passwd;
	}
	

	
	
	public String getemail() throws SQLException
	{
		String gmail;
		loginBean.setUname(uname);
		loginBean.setPassword(passwd);
		
		gmail = loginDao.GetEmail(loginBean);
		
		return gmail;
	}
	public void getemail1(RegisterDao loginDao2) {

		this.loginDao = loginDao2;
		
	}
	

		
		
}
