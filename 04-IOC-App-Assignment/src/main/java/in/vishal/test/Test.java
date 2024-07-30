package in.vishal.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vishal.beans.EmailService;
import in.vishal.beans.PwdService;
import in.vishal.beans.UserDAO;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
//        PwdService pwd = cxt.getBean(PwdService.class);
//        pwd.pwdEncrypt();
//		  UserDAO dao = cxt.getBean(UserDAO.class);
//		  dao.userDB();
		  EmailService es = cxt.getBean(EmailService.class);
		  es.sendEmail();
	}

}
