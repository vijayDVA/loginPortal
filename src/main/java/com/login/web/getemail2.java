package com.login.web;


import java.sql.SQLException;

import com.login.web.Dao.RegisterDao;
import com.login.web.model.Member;

public class getemail2 {

	static String uname;
	static String passwd;
	
	public RegisterDao loginDao = new RegisterDao();
	
	
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
	

	static String gmail;
	Member loginBean = new Member();
	
	public String getemail() throws SQLException
	{
		 
		 
		loginBean.setUname("dva"); 
		loginBean.setPassword("dva");
		
		
		gmail = loginDao.GetEmail(loginBean);
	
		System.out.print(gmail);
		return gmail;
	}
	public void getemail1(RegisterDao loginDao2){

		this.loginDao = loginDao2;
	
	}
	

	

		
		
}
