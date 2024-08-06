package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.ashokit.dao.UserDao;

@Component
public class UserService {
	
	@Autowired
	@Qualifier("oracle")
	private UserDao dao;
	
	public UserService() {
		System.out.println("UserService Constructor called...");
	}
	
	public void getData(int id) {
		dao.DaoImpl(id);
	}
}
