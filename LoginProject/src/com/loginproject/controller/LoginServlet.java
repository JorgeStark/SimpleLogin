package com.loginproject.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loginproject.model.Login;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("txtUsuario");
		String password = request.getParameter("txtPassword");
		
		Login objLogin = new Login();
		objLogin.setUsuario(usuario);
		objLogin.setPassword(password);
		
		
		if(objLogin.esUsuario("admin", "root") == true)
		{
			//response.sendRedirect("D:/Generation/Workspace/LoginProject/WebContent/Inicio.jsp");
			response.getWriter().write("Los datos son correctos! Bienvenido usuario!");
			
		}
		else
		{
			response.getWriter().write("Los datos son incorrectos! Intente de nuevo!");
		}
	}

}
