package IT20281564;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Catching values passed from AdministratorLogin,jsp
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		// checking the success of the validate
		isTrue = AdminDBUtil.validateAdmin(userName, password);
		
		if (isTrue == true) {
			
			List<Administrator> AdminDetails = AdminDBUtil.getAdministrator(userName);
			request.setAttribute("AdminDetails", AdminDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("AdminAccount.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Credentials is Incorrect');");
			out.println("location='AdministratorLogin.jsp'");
			out.println("</script>");
		}
	}

}
