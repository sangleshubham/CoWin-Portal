package administation;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DatabasesConnection.DBConnection;

public class retrive_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public retrive_data() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//select online first task
			
			Connection con = DBConnection.initializeDatabase();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from userrequest limit 1" );
			if(!rs.next()) {
				
			}
			
			
			String start_city = rs.getString(1);
			String end_city = rs.getString(2);
			String start_date = rs.getString(3);
			String end_date = rs.getString(4);
			String contact = rs.getString(5);
			String f_name  = rs.getString(6);
			String l_name = rs.getString(7);
			String curr_add = rs.getString(8);
			String dest_addr = rs.getString(9);
			String veh_type = rs.getString(10);
			long veh_no = rs.getInt(11);
			String trav_count = rs.getString(12);
			String reason = rs.getString(13);
			String exp_reason = rs.getString(14);
			String email = rs.getString(15);
			String contaminate_zom = rs.getString(16);
			String avatar = rs.getString(17);
			String aadhar = rs.getString(18);
			String doc_med = rs.getString(19);

			st.close(); 
	        con.close();
	        
	       
	        
	        request.setAttribute("start_city", start_city);
	        request.setAttribute("end_city", end_city);
	        request.setAttribute("start_date", start_date);
	        request.setAttribute("end_date", end_date);
	        request.setAttribute("contact", contact);
	        request.setAttribute("f_name", f_name);
	        request.setAttribute("l_name", l_name);
	        request.setAttribute("curr_add", curr_add);
	        request.setAttribute("dest_addr", dest_addr);
	        
	        request.setAttribute("veh_type", veh_type);
	        request.setAttribute("veh_no", veh_no);
	        request.setAttribute("trav_count", trav_count);
	        request.setAttribute("reason", reason);
	        request.setAttribute("exp_reason", exp_reason);
	        request.setAttribute("email", email);
	        request.setAttribute("contaminate_zom", contaminate_zom);
	        
	        HttpSession session=request.getSession();  
	        
	        session.setAttribute("current_temp_email", email);
	        session.setAttribute("avatar", avatar);
	        session.setAttribute("aadhar", aadhar);
	        session.setAttribute("medical", doc_med);
	        
	        System.out.print(f_name);
	        session.setAttribute("previous_completed", "false");
	        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin_panel.jsp");
	 
	        requestDispatcher.forward(request, response);
	        
		} catch(Exception e) {
			response.sendRedirect("no_data_to_fetch.jsp");
		}
		
	}



}
