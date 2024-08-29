package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Student;

public interface StudentService {
	
	public boolean saveStudents(Student s);
	
	public List<Student> getAllStudents(); 

	public void deleteById(Integer studentId);
}
