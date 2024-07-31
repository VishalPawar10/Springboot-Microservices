package in.vishal.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vishal.beans.UserService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
		UserService userservice = cxt.getBean(UserService.class);
		userservice.enterDetails();

	}

}
