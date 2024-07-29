package in.vishal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-bean.xml");
		Car c = cxt.getBean(Car.class);
		c.runCar();
	}
}
