package in.vishal.beans;

public class PwdService {
	   private UserService user;
       public PwdService() {
    	   System.out.println("PwdService Constructor called...");
       }
       
       public void setUser(UserService user) {
		this.user = user;
	}

	public void pwdEncrypt() {
	       user.enterPwd();
	       System.out.println("*****************************************************");
    	   System.out.println("Password Encrypted Successfully");
       }
}
