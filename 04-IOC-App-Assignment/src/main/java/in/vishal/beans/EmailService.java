package in.vishal.beans;

public class EmailService {
	private UserDAO udao;
         public EmailService() {
        	 System.out.println("EmailService Constructor called....");
         }
         
         public void setUdao(UserDAO udao) {
			this.udao = udao;
		}

		public void sendEmail() {
			udao.userDB();
        	 System.out.println("*****************************************************");
        	 System.out.println("Email sent successfully");
         }
}
