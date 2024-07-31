package in.vishal.beans;

public class UserDao {
       public UserDao() {
		System.out.println("userdao constructor called...");
	}
       
       public void save() {
    	   System.out.println("********************************");
    	   System.out.println("Save password into DB");
       }
}
