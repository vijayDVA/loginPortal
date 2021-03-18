package com.login.web.Dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.web.model.Member;


public class RegisterDao {

	private String dbUrl = "jdbc:mysql://localhost:3306/login";
	private String dbUname = "root";
	private String dbPassword = "1234";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	
	public boolean insert(Member member)
	{
		boolean status = true;
		loadDriver(dbDriver);
		Connection con = getConnection();

		String sql = "insert into member values(?,?,?)";
		
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, member.getUname());
		ps.setString(2, member.getPassword());
		ps.setString(3, member.getEmail());
		ps.executeUpdate();
		status=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			status=false;
		}
		return status;

	}
	public boolean validate(Member member)
	{
		boolean status = false;
		
		loadDriver(dbDriver);
		Connection con = getConnection();
		
		String sql = "select * from member where uname =? and password =?";
		PreparedStatement ps;
		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, member.getUname());
		ps.setString(2, member.getPassword());
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	public void delete() throws SQLException
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		
		String sql = "DELETE FROM member WHERE uname='rajini'";
		
		Statement stmt = con.createStatement();
		stmt.executeUpdate(sql);		
		
	}
}
