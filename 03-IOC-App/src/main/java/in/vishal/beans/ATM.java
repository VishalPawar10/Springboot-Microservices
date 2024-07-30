package in.vishal.beans;

public class ATM {
	private PrintReceipt printer;

	public ATM() {
		System.out.println("ATM consturctor called....");
	}

	public ATM(PrintReceipt printer) {
		this.printer = printer;
		System.out.println("ATM 1-param constructor called....");
	}

	public void withdraw(int amt) {
		System.out.println("widthdrawn money " + amt);
		printer.print();
	}

}
