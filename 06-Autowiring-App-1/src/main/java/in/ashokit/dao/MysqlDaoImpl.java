package in.ashokit.dao;

import org.springframework.stereotype.Component;

@Component("mysql")
public class MysqlDaoImpl implements UserDao {
	
	int id;
	
	public void DaoImpl(int id) {
		this.id = id;
		System.out.println("From Mysql Dao Implementaion class");
		if(id == 1) {
			System.out.println("Vishal");
		}else if(id==2) {
			System.out.println("Rahul");
		}else {
			System.out.println("Please enter valid id....");
		}
	
	}

}
