package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.EmpRepository;
import in.ashokit.dao.Employees;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepository empRepo;
	
	public void performCrudOps() {
		
		//create new employee
		Employees e1 = new Employees();
		e1.setEmpId(101);
		e1.setEmpName("Vishal");
		e1.setEmpSalary(50000.00);
		System.out.println("Employee saved "+empRepo.save(e1));

		
		Employees e2 = new Employees();
		e2.setEmpId(102);
		e2.setEmpName("Ram");
		e2.setEmpSalary(20000.00);
		
		System.out.println("Employee saved "+empRepo.save(e2));
		
		//Fetch all employees
		System.out.println("All Employees ");
		empRepo.findAll().forEach(System.out::println);
		
		//delete by id
		System.out.println("Delete employee by id ");
		empRepo.deleteById(102);
		
		Boolean exits = empRepo.existsById(102);
		if(exits) {
			System.out.println("Employee exist with id ");
		}else {
			System.out.println("Employee not exist with the given id");
		}
	}

}
