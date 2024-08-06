package in.ashokit.dao;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleDaoImpl implements UserDao {
	
	int id;

	public void DaoImpl(int id) {
		this.id = id;
		System.out.println("From Oracle Dao Implementaion class");
		if (id == 1) {
			System.out.println("Vishal");
		} else if (id == 2) {
			System.out.println("Rahul");
		} else {
			System.out.println("Please enter valid id....");
		}

	}

}
