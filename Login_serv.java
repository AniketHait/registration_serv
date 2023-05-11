

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

/**
 * Servlet implementation class Login_serv
 */
@WebServlet("/Login_serv")
public class Login_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public Login_serv() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
	
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			String uname=req.getParameter("un");
			String upass=req.getParameter("pass");
			
			
			String name="";
			String pass="";
			
			Cookie cookies[] = req.getCookies();
			for(Cookie c: cookies) {
				if(c.getName().equals("email")) {
					name =c.getValue();
				}
				
				if(c.getName().equals("pass")) {
					pass=c.getValue();
				}
			}
			PrintWriter p=res.getWriter();
			if(name.equalsIgnoreCase(uname) && pass.equalsIgnoreCase(upass))
			{
				p.println("Logged Succesfully");
			}
			else
			{
				p.println("Incorrect Credentials");
			}
	}
	

}
