package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService employeeService = context.getBean(EmployeeService.class);
		//employeeService.empSave();
		//employeeService.getEmpsWithCountry();
		employeeService.getEmpsWithGender();
		
	}

}
