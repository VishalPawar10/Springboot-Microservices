package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Students, Integer>{

	 public List<Students> findByStudCityOrStudCollege(String studCity, String studCollege);
	 public List<Students> findByStudCityOrStudAge(String studCity, Integer studAge);
}
