

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

@WebServlet("/Registration_serv")
public class Registration_serv extends HttpServlet {

	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String email=req.getParameter("email");
		String password=req.getParameter("npass");
		
		Cookie cookie = new Cookie("email", email + "");
		Cookie cookie1 = new Cookie("pass", password + "");
		
		res.addCookie(cookie);
		res.addCookie(cookie1);
		
		PrintWriter p=res.getWriter();
		p.println("You have succesfully registered");

}
