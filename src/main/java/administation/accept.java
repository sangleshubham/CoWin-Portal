package administation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DatabasesConnection.SendEmail;


public class accept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public accept() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session=request.getSession();  
		String email = session.getAttribute("current_temp_email").toString();
		
		 try {
				SendEmail.sendEmail(email, "YOur Form For travel across cities has been Accepted");
			} catch (Exception e1) {
		
				e1.printStackTrace();
			}
		 response.sendRedirect("retrive_data");

	}

}
