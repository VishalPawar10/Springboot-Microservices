package in.ashokit.dao;

import org.springframework.stereotype.Component;

@Component
public class userdao {
        public userdao() {
        	System.out.println("user-dao constructor called...");
        }
        
        public void save() {
        	System.out.println("Save user Details");
        	
        }
}
