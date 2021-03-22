package com.login.web;

import com.login.web.getemail2;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.web.Dao.RegisterDao;
import com.login.web.model.Member;

/**
 * Servlet implementation class GetEmail
 */
@WebServlet("/GetEmail")
public class GetEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public GetEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		String gmail;
		try {
			
			getemail2 gete = new getemail2();
			gmail = gete.getemail();
			
			request.setAttribute("gmail", gmail);
			RequestDispatcher rd = request.getRequestDispatcher("/loginDone.jsp");
			
			rd.forward(request, response);	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
