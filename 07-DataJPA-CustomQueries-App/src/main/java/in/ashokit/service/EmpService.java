package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.repo.EmpRepository;
import in.ashokit.repo.Employee;

@Service
public class EmpService {
	
	private EmpRepository empRepo;
	
	public EmpService(EmpRepository empRepo) {
		this.empRepo = empRepo;
	}
	
	//Get all employees with HQL query implementation
	public void getAllEmployees() {
		List<Employee> emps = empRepo.getEmps();
		emps.forEach(e->{
			System.out.println(e);
		});
	}
	
	//Get all employees with Gender = male using HQL query implementation
	public void getAllEmpWithGender() {
		List<Employee> emps = empRepo.getEmpsWithGender("Male");
		emps.forEach(System.out::println);
	}
	
	//Get all employees with age=22 and Country="India" using HQL query implementation
		public void getAllEmpsWithAgeAndCountry() {
			List<Employee> emps = empRepo.getEmpsWithAgeAndCountry(22,"India");
			emps.forEach(System.out::println);
		}
	
	public void getAllEmpsSQL() {
		List<Employee> emps = empRepo.getEmpsSQL();
		emps.forEach(System.out::println);
	}
	
	
	//Insert employees 
	public void insertEmployee(Integer empId, String empName, String empGender, Integer empAge, Double empSalary, String empCountry) {
	    if (empRepo.existsById(empId)) {
	        System.out.println("Employee with ID " + empId + " already exists. Skipping insert.");
	    } else {
	        int result = empRepo.insertEmps(empId, empName, empGender, empAge, empSalary, empCountry);
	        System.out.println("Number of records inserted: " + result);
	    }
	}
	
	
	//Insert or update employees
	public void updateOrinsertIntoEmps() {
		int insertEmps = empRepo.insertOrUpdateEmployee(6, "Shawn", "Male", 41, 10000.00, "USA");
		System.out.println("Number of records inserted or modified "+insertEmps);
	}
	

}
