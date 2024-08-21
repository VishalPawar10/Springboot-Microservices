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
		emp.setEmpId(8);
		emp.setEmpName("Jack");
		emp.setEmpAge(30);
		emp.setEmpGender("Male");
		emp.setEmpCountry("Australia");
		emp.setEmpSalary(6000.00);
		empRepo.save(emp);
	}
	
	 public List<Employee> getAllEmployees() {
	        return empRepo.findAll();
	    }
	
}
