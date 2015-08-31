package com.job4sure.util;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static String mailSend(String email,String fullName,Integer registrationId) {
		try {
			Message message = new MimeMessage(SendMailProperty.mailProperty());
			
			message.setFrom(new InternetAddress(IConstant.FROM_EMAIL_ID));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
			message.setSubject("Regards:registration confirmation");
			String msg = "Dear " + fullName + ",<br>";
			msg += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;You have been registered with jobpartal below are confirmation link click on link and access jobpartal account:<br>";
			msg += " <br>";
			msg += "<b>User Name:</b>" + email;
			msg += " <br>";
		    msg += "http://localhost:9091/job4sure-web/verify.do?registrationId=" + registrationId;// used
			msg += " <br>";
			msg += "Regards,<br>";
			msg += "Job Portal";
			message.setContent(msg, "text/html");
			Transport.send(message);
			System.out.println("Done");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		return null;
		
	}

}
