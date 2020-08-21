

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import DatabasesConnection.SendEmail;

import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    public register() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		int n = 20;
		
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
            
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        String file_name = sb.toString();
  
		
		
        
        //generate OTP
        
        String numbers = "0123456789"; 
        int len = 6;
        // Using random method 
        Random rndm_method = new Random(); 
  
        char[] otp = new char[len]; 
  
        for (int i = 0; i < len; i++) 
        { 
            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length())); 
        } 
		
        String otp_final = String.valueOf(otp); 
        
        
        
        

        
        
        
        
        
        
        HttpSession session=request.getSession();  
        session.setAttribute("otp",otp_final);  
        
        System.out.println(otp_final);
		
		 
		Dictionary<String, String> d = new Hashtable<String, String>();
		
		String path = "D:\\upload_image\\";
		ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
		try {
			int file_cnt = 0;
			List<FileItem> documents = sf.parseRequest(request);
			for (FileItem item:documents)
			{	
				if (item.isFormField()) {

	                String fieldName = item.getFieldName();
	                String fieldValue = item.getString();
//	                System.out.println(fieldName + " : " + fieldValue);
	                
	                d.put(fieldName, fieldValue);
	                
	            } else {
	            	String f_path = path + file_name +"_" +item.getName();
	            	d.put("file_path_" + String.valueOf(file_cnt), f_path);
	            	item.write(new File(f_path));
	            	file_cnt++;
	            	
	            }
			}
			System.out.print("File Uploaded");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
			
        try {
			SendEmail.sendEmail(d.get("your_email"), "Your OTP to verify Account : " +  otp_final);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		PrintWriter writer = response.getWriter();
		String html_responce =  "<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"  <head>\r\n" + 
				"    <title>Simple registration form</title>\r\n" + 
				"    <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700\" rel=\"stylesheet\">\r\n" + 
				"    <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.4.1/css/all.css\" integrity=\"sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz\" crossorigin=\"anonymous\">\r\n" + 
				"    <style>\r\n" + 
				"      html, body {\r\n" + 
				"      display: flex;\r\n" + 
				"      justify-content: center;\r\n" + 
				"      height: 100%;\r\n" + 
				"      }\r\n" + 
				"      body, div, h1, form, input, p { \r\n" + 
				"      padding: 0;\r\n" + 
				"      margin: 0;\r\n" + 
				"      outline: none;\r\n" + 
				"      font-family: Roboto, Arial, sans-serif;\r\n" + 
				"      font-size: 16px;\r\n" + 
				"      color: #666;\r\n" + 
				"      }\r\n" + 
				"      h1 {\r\n" + 
				"      padding: 10px 0;\r\n" + 
				"      font-size: 32px;\r\n" + 
				"      font-weight: 300;\r\n" + 
				"      text-align: center;\r\n" + 
				"      }\r\n" + 
				"      p {\r\n" + 
				"      font-size: 12px;\r\n" + 
				"      }\r\n" + 
				"      hr {\r\n" + 
				"      color: #a9a9a9;\r\n" + 
				"      opacity: 0.3;\r\n" + 
				"      }\r\n" + 
				"      .main-block {\r\n" + 
				"      max-width: 340px; \r\n" + 
				"      min-height: 260px; \r\n" + 
				"      padding: 10px 0;\r\n" + 
				"      margin: auto;\r\n" + 
				"      border-radius: 5px; \r\n" + 
				"      border: solid 1px #ccc;\r\n" + 
				"      box-shadow: 1px 2px 5px rgba(0,0,0,.31); \r\n" + 
				"      background: #ebebeb; \r\n" + 
				"      }\r\n" + 
				"      form {\r\n" + 
				"      margin: 0 30px;\r\n" + 
				"      }\r\n" + 
				"      .account-type, .gender {\r\n" + 
				"      margin: 15px 0;\r\n" + 
				"      }\r\n" + 
				"      input[type=radio] {\r\n" + 
				"      display: none;\r\n" + 
				"      }\r\n" + 
				"      label#icon {\r\n" + 
				"      margin: 0;\r\n" + 
				"      border-radius: 5px 0 0 5px;\r\n" + 
				"      }\r\n" + 
				"      label.radio {\r\n" + 
				"      position: relative;\r\n" + 
				"      display: inline-block;\r\n" + 
				"      padding-top: 4px;\r\n" + 
				"      margin-right: 20px;\r\n" + 
				"      text-indent: 30px;\r\n" + 
				"      overflow: visible;\r\n" + 
				"      cursor: pointer;\r\n" + 
				"      }\r\n" + 
				"      label.radio:before {\r\n" + 
				"      content: \"\";\r\n" + 
				"      position: absolute;\r\n" + 
				"      top: 2px;\r\n" + 
				"      left: 0;\r\n" + 
				"      width: 20px;\r\n" + 
				"      height: 20px;\r\n" + 
				"      border-radius: 50%;\r\n" + 
				"      background: #1c87c9;\r\n" + 
				"      }\r\n" + 
				"      label.radio:after {\r\n" + 
				"      content: \"\";\r\n" + 
				"      position: absolute;\r\n" + 
				"      width: 9px;\r\n" + 
				"      height: 4px;\r\n" + 
				"      top: 8px;\r\n" + 
				"      left: 4px;\r\n" + 
				"      border: 3px solid #fff;\r\n" + 
				"      border-top: none;\r\n" + 
				"      border-right: none;\r\n" + 
				"      transform: rotate(-45deg);\r\n" + 
				"      opacity: 0;\r\n" + 
				"      }\r\n" + 
				"      input[type=radio]:checked + label:after {\r\n" + 
				"      opacity: 1;\r\n" + 
				"      }\r\n" + 
				"      input[type=text], input[type=password] {\r\n" + 
				"      width: calc(100% - 57px);\r\n" + 
				"      height: 36px;\r\n" + 
				"      margin: 13px 0 0 -5px;\r\n" + 
				"      padding-left: 10px; \r\n" + 
				"      border-radius: 0 5px 5px 0;\r\n" + 
				"      border: solid 1px #cbc9c9; \r\n" + 
				"      box-shadow: 1px 2px 5px rgba(0,0,0,.09); \r\n" + 
				"      background: #fff; \r\n" + 
				"      }\r\n" + 
				"      input[type=password] {\r\n" + 
				"      margin-bottom: 15px;\r\n" + 
				"      }\r\n" + 
				"      #icon {\r\n" + 
				"      display: inline-block;\r\n" + 
				"      padding: 9.3px 15px;\r\n" + 
				"      box-shadow: 1px 2px 5px rgba(0,0,0,.09); \r\n" + 
				"      background: #1c87c9;\r\n" + 
				"      color: #fff;\r\n" + 
				"      text-align: center;\r\n" + 
				"      }\r\n" + 
				"      .btn-block {\r\n" + 
				"      margin-top: 10px;\r\n" + 
				"      text-align: center;\r\n" + 
				"      }\r\n" + 
				"      button {\r\n" + 
				"      width: 100%;\r\n" + 
				"      padding: 10px 0;\r\n" + 
				"      margin: 10px auto;\r\n" + 
				"      border-radius: 5px; \r\n" + 
				"      border: none;\r\n" + 
				"      background: #1c87c9; \r\n" + 
				"      font-size: 14px;\r\n" + 
				"      font-weight: 600;\r\n" + 
				"      color: #fff;\r\n" + 
				"      }\r\n" + 
				"      button:hover {\r\n" + 
				"      background: #26a9e0;\r\n" + 
				"      }\r\n" + 
				"    </style>\r\n" + 
				"  </head>\r\n" + 
				"  <body>\r\n" + 
				"    <div class=\"main-block\">\r\n" + 
				"      <h1>OTP Verification</h1>\r\n" + 
				"      <form action=\"otp\" enctype=\"text/html\">\r\n" + 
				"		<hr>\r\n" + 
				"        <label id=\"icon\" for=\"name\"><i class=\"fas fa-envelope\"></i></label><input type=\"text\" name=\"name\" id=\"name\" placeholder=\"" + d.get("your_email") + "\" required disabled=\"disabled\"/>\r\n" + 
				"        <label id=\"icon\" for=\"name\"><i class=\"fas fa-user\"></i></label>\r\n" + 
				"        <input type=\"text\" name=\"otp\" id=\"name\" placeholder=\"OTP\" required/>\r\n" + 
				"        <hr>\r\n" + 
				"        <div class=\"btn-block\">\r\n" + 
				"           <button type=\"submit\" >Submit</button>\r\n" + 
				"        </div>\r\n" + 
				"      </form>\r\n" + 
				"    </div>\r\n" + 
				"  </body>\r\n" + 
				"</html>";
		writer.print(html_responce);
		
		session.setAttribute("data", d);
		//End Of image

		
		
//		
//		RequestDispatcher rd = request.getRequestDispatcher("/forward");
//		rd.forward(request, response);
//		
		
		
		
		
	}
}
