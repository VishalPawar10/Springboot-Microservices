package in.vishal.beans;

public class UserService {

	private UserDao dao;
	private PwdService pwd;
	private EmailService email;

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	public void setPwd(PwdService pwd) {
		this.pwd = pwd;
	}

	public void setEmail(EmailService email) {
		this.email = email;
	}

	public UserService() {
		System.out.println("userservice consturctor called...");
	}

	public void enterDetails() {
		// dao service
		dao.save();
		// pwd service
		pwd.encrypt();
		// email service
		email.sendEmail();
	}
}
