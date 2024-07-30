package in.vishal.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vishal.beans.ATM;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("beans.xml");
		ATM atm = cxt.getBean(ATM.class);
        atm.withdraw(1000);
       
	}

}
