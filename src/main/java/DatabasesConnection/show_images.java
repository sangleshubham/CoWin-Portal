package DatabasesConnection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;  
import javax.servlet.*;  

public class show_images extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public show_images() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
			//shows avatar
			HttpSession session=request.getSession(); 
			String aim_path = session.getAttribute("avatar").toString();
		    response.setContentType("image/jpeg");  
		    ServletOutputStream out;  
		    out = response.getOutputStream();  
		    
		    FileInputStream fin = new FileInputStream(aim_path);  
		      
		    BufferedInputStream bin = new BufferedInputStream(fin);  
		    BufferedOutputStream bout = new BufferedOutputStream(out);  
		    int ch =0; ;  
		    while((ch=bin.read())!=-1)  
		    {  
		    bout.write(ch);  
		    }  
		      
		    bin.close();  
		    fin.close();  
		    bout.close();  
		    out.close();  
	}  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
