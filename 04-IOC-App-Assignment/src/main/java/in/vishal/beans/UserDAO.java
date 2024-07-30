package in.vishal.beans;

public class UserDAO {
	private PwdService pwdservice;
        public UserDAO() {
        	System.out.println("UserDAO constructor called.....");
        }
        
        public void setPwdservice(PwdService pwdservice) {
			this.pwdservice = pwdservice;
		}

		public void userDB() {
			pwdservice.pwdEncrypt();
        	System.out.println("*****************************************************");
        	System.out.println("Name and Encrypted password saved to DB successfully ");
        }
}
