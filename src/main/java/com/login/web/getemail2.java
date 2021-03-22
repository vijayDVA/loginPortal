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
		this.uname = uname;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	

	public String getemail() throws SQLException
	{
		String gmail;
		loginBean.setUname(uname);
		loginBean.setPassword(passwd);
		
		gmail = loginDao.GetEmail(loginBean);
		
		return gmail;
	}
		
		
}
