package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.repo.Employee;
import in.ashokit.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private EmployeeRepository empRepo;

	public EmployeeService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}
	
	public void empSave() {
		Employee emp = new Employee();
		emp.setEmpId(5);
		emp.setEmpName("Smith");
		emp.setEmpAge(32);
		emp.setEmpGender("Male");
		emp.setEmpCountry("Australia");
		emp.setEmpSalary(6000.00);
		empRepo.save(emp);
	}
	
	public void getEmpsWithCountry() {
		List<Employee> emps =empRepo.findByEmpCountry("USA");
		emps.forEach(e ->{
			System.out.println(e);
		});
	}
	
	public void getEmpsWithGender() {
		List<Employee> emps =empRepo.findByEmpGender("Male");
		emps.forEach(e ->{
			System.out.println(e);
		});
	}
	
	
}
