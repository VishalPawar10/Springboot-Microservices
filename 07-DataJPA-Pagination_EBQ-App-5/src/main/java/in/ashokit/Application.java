package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.repo.Students;
import in.ashokit.service.StudentService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentService service = context.getBean(StudentService.class);
		//service.getStudents(2);
		
		Students stud = new Students();
		stud.setStudCity("Mumbai");
		stud.setStudCollege("vppcoe");
		stud.setStudAge(22);
		
		//service.getStudentsEBQ(stud);//Performing And operation
		//service.getStudentsByOrEBQ(stud);
		service.getStudentsByCollegeOrAge(stud);
	}

}
