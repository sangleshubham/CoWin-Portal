package administation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DatabasesConnection.DBConnection;


public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.print("Inside Try");
		// just check for SQL injection
		try {
			
			Connection con = DBConnection.initializeDatabase();
			String user = (String) request.getParameter("username");
			String pass = (String) request.getParameter("pass");
			System.out.print(user);
			System.out.print(pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from admin_login where username= '" + user + "' and password= '"+ pass +"'" );
			rs.next();
			if (rs.isLast())
			{
				response.sendRedirect("retrive_data");
				st.close(); 
		        con.close(); 
			}
			else {
				response.sendRedirect("admin_login.jsp");
			}
			
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("admin_login.jsp");
		} catch (ClassNotFoundException e) {
			System.out.print("Database Class is not Found");
			e.printStackTrace();
			response.sendRedirect("admin_login.jsp");
		} catch(Exception e) {
			response.sendRedirect("admin_login.jsp");
		}
		
		
		
		
		
        
		
	}

}
