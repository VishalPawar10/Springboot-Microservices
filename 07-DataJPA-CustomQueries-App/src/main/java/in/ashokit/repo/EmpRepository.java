package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer>{
	
	@Query("From Employee")
	public List<Employee> getEmps();
	
	@Query("From Employee where empGender=:gender")
	public List<Employee> getEmpsWithGender(String gender);
	
	@Query("From Employee where empAge=:age and empCountry=:country")
	public List<Employee> getEmpsWithAgeAndCountry(int age, String country);
	
	@Query(value="select * from Employee", nativeQuery = true)
	public List<Employee> getEmpsSQL();
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO Employee (emp_id, emp_name, emp_gender, emp_age, emp_salary, emp_country)"
			+ " VALUES (:empId, :empName, :empGender, :empAge, :empSalary, :empCountry) "
			+ "ON DUPLICATE KEY UPDATE emp_name = :empName, emp_gender = :empGender,"
			+ " emp_age = :empAge, emp_salary = :empSalary, emp_country = :empCountry", 
			nativeQuery = true)
	public int insertOrUpdateEmployee(@Param("empId") Integer empId, 
	                           @Param("empName") String empName, 
	                           @Param("empGender") String empGender, 
	                           @Param("empAge") Integer empAge, 
	                           @Param("empSalary") Double empSalary, 
	                           @Param("empCountry") String empCountry);

	
	 @Modifying
	    @Transactional
	    @Query(value = "INSERT INTO Employee (emp_id, emp_name, emp_gender, emp_age, emp_salary, emp_country) VALUES (:empId, :empName, :empGender, :empAge, :empSalary, :empCountry)", nativeQuery = true)
	    int insertEmps(@Param("empId") Integer empId, 
	                   @Param("empName") String empName, 
	                   @Param("empGender") String empGender, 
	                   @Param("empAge") Integer empAge, 
	                   @Param("empSalary") Double empSalary, 
	                   @Param("empCountry") String empCountry);

	
}
