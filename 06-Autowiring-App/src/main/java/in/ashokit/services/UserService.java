package in.ashokit.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ashokit.dao.userdao;

@Component
public class UserService {
	@Autowired
	private userdao dao;
	public UserService() {
		System.out.println("User Service Constructor called...");
	}
	
	public void service() {
		dao.save();
	}
}
