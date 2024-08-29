package in.ashokit.service;

import java.io.File;
import java.nio.file.Files;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;


@Service
public class EmailService {

	private JavaMailSender jms;
	
	public EmailService(JavaMailSender jms) {
		this.jms = jms;
	}
	
	public void sendEmail(String subject, String body, String to) {
		
		try {

			SimpleMailMessage smm = new SimpleMailMessage();
			smm.setFrom("vishalsureshpawar@gmail.com");
			smm.setSubject(subject);
			smm.setText(body);
			smm.setTo(to);
			jms.send(smm);
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}
	
	public void sendEmail2(String subject, File body, String to) {
		try {
			
			MimeMessage mm = jms.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(mm, true);
			
			helper.setSubject(subject);
			String bodyContent = new String(Files.readAllBytes(body.toPath()));
			helper.setText(bodyContent, true);
			helper.setTo(to);
			helper.setFrom("vishalsureshpawar@gmail.com");
			
			jms.send(mm);
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
	
}
