package in.ashokit.service;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepo repo;

	private EmailService eservice;

	public StudentServiceImpl(StudentRepo repo, EmailService eservice) {
		this.repo = repo;
		this.eservice = eservice;
	}

	@Override
	public boolean saveStudents(Student s) {
		Student save = repo.save(s);
		String subject = "Contact Saved Successfully";
		File f = new File("C:\\Users\\visha\\workspace-sts\\09-ContactMgmt-WebApp\\src\\main\\resources\\templates\\body.html");

		eservice.sendEmail2(subject, f, s.getEmail());
		
		return save.getStudentId()!=null;
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public void deleteById(Integer studentId) {
		repo.deleteById(studentId);
	}

}
