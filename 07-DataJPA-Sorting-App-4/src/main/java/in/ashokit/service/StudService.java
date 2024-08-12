package in.ashokit.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.repo.StudentRepository;
import in.ashokit.repo.Students;

@Service
public class StudService {

	private StudentRepository studRepo;
	
	public StudService(StudentRepository studRepo) {
		this.studRepo = studRepo;
	}
	
	public void getAllStudents() {
		List<Students> all = studRepo.findByStudCity("Pune", Sort.by("studName"));
		all.forEach(System.out::println);
	}
	
	public void getAllStudentsInDescendingName() {
		List<Students> all = studRepo.findAll(Sort.by("studName").descending());
		all.forEach(System.out::println);
	}
}
