

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.fileupload.FileItem;

import DatabasesConnection.DBConnection;

public class otp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		//// session TTL is good IDEA
		
		
		HttpSession session=request.getSession();  
		PrintWriter writer = response.getWriter();
		long otp;
	
		System.out.print(session.getAttribute("otp"));
    	if  ( null ==  session.getAttribute("otp") )
    	{
    		response.sendRedirect("index.jsp");
    		System.out.print("OTP IS Not Store IN Session");
    		
    	}
    	else {
			    		
			    	System.out.print("Value IS Not Null");
			    	otp =  Integer.parseInt( session.getAttribute("otp").toString());
			            	
			    	
			    		
			    	
			        
			        Object d = session.getAttribute("data");
			        
			        
			        Dictionary data =  (Hashtable) d;
			        
			        String paramValue = request.getParameter("otp");
			        
			        
			        if( otp == Integer.parseInt(paramValue)  )
			        {
			        	writer.print("Right OTP");
			        	System.out.print("Inside OTP");
			        	try {
			        		System.out.print("Inside Try");
							Connection con = DBConnection.initializeDatabase();
							
							PreparedStatement st = con.prepareStatement("insert into userrequest values(?,  ?, ?, ?, ?, ?,  ?, ?, ?, ?, ?,  ?, ?, ?, ?, ?, ?, ? , ?)"); 
							st.setString(1,  data.get("start_city").toString() );
							st.setString(2,  data.get("end_city").toString() ); 
							st.setString(3,  data.get("start_date").toString() ); 
							st.setString(4,  data.get("end_date").toString() ); 
							st.setString(5,  data.get("cont").toString()); 
							st.setString(6,  data.get("first_name").toString() ); 
							st.setString(7,  data.get("last_name").toString() ); 
							st.setString(8,  data.get("current_addr").toString() ); 
							st.setString(9,  data.get("addr_dest").toString() ); 
							st.setString(10,  data.get("vehicle").toString() ); 
							st.setString(11,  data.get("vehicle_no").toString() ); 
							st.setInt(12, Integer.parseInt(data.get("trav_cnt").toString()) ); 
							st.setString(13,  data.get("reason").toString() ); 
							st.setString(14,  data.get("exp_reason").toString() ); 
							st.setString(15,  data.get("your_email").toString() ); 
							st.setString(16,  data.get("contaminated_zone").toString() ); 
							st.setString(17,  data.get("file_path_0").toString() ); 
							st.setString(18,  data.get("file_path_1").toString() ); 
							st.setString(19,  data.get("file_path_2").toString() ); 
							
							
				            st.executeUpdate(); 
				   
				            st.close(); 
				            con.close(); 
					
						}catch(java.sql.SQLIntegrityConstraintViolationException e) {
							response.sendRedirect("already_registered.jsp");
						}catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			        	
			        	try {
			        		response.sendRedirect("sucess.jsp");
			        	}catch(Exception e) {
			        		
			        	}
			        	
			        }
			        else
			        {
			        	writer.print("Wrong OTP");
			        }
			        
        
    	}

	}


	
}
