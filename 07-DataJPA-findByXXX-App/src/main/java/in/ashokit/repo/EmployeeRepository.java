package in.ashokit.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	// select * from employee where country="India"
	public List<Employee> findByEmpCountry(String country);
	
	//select * from employee where gender="Male"
	public List<Employee> findByEmpGender(String gender);

}
