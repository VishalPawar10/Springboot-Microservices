package in.ashokit.service;


import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import in.ashokit.repo.StudentRepository;
import in.ashokit.repo.Students;

@Service
public class StudentService {
	public static final int pageSize = 2;
	private StudentRepository studRepo;
	public StudentService(StudentRepository studRepo) {
		this.studRepo = studRepo;
	}
	
	public void getStudents(int pageNum) {
	    Pageable page = PageRequest.of(pageNum-1, pageSize);
		Page<Students> all = studRepo.findAll(page);
		all.forEach(System.out::println);
	}
	
	//By default performs AND operation
	public void getStudentsEBQ(Students stud) {
		Example<Students> studEx = Example.of(stud);
		List<Students> all = studRepo.findAll(studEx);
		all.forEach(System.out::println);
	}
	
	//now to perform OR operation
	public void getStudentsByOrEBQ(Students stud){
		List<Students> all = studRepo.findByStudCityOrStudCollege(stud.getStudCity(), stud.getStudCollege());
		all.forEach(System.out::println);
	}
	
	//to get student based on college name or age
	public void getStudentsByCollegeOrAge(Students stud) {
		List<Students> all = studRepo.findByStudCityOrStudAge(stud.getStudCity(), stud.getStudAge());
		all.forEach(System.out::println);
	}
}
