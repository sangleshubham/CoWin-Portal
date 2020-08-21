package DatabasesConnection;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void sendEmail(String rec , String otp) throws MessagingException {
		
		System.out.print("\n\n sending Mail");
		
		Properties prop = new Properties();
		prop.put("mail.smtp.auth", "true");
		prop.put("mail.smtp.starttls.enable", "true");
		prop.put("mail.smtp.host", "smtp.gmail.com");
		prop.put("mail.smtp.port", "587");
		
		final String myEmail = "itsmrsilentreal@gmail.com";
		final String pass = "mrsilent9@";
		
		Session sesssion = Session.getInstance(prop , new Authenticator() {
			
			protected PasswordAuthentication getPasswordAuthentication() {
			
				return new PasswordAuthentication(myEmail, pass);
				
			}
			
		});
	
		Message mes = prepareMessage(sesssion, myEmail,rec , otp);
		
		Transport.send(mes);
		System.out.print("\n\n\nMessage Send Successfully");
	}
	
	private static Message prepareMessage(Session session , String email, String rec , String otp) {
		
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(email));
			
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(rec) );
			message.setSubject("Varification OTP");
			message.setText(otp);
		
			return message;
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}
