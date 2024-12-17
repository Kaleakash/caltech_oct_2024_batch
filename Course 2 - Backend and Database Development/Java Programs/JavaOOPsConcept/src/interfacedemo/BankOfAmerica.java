package interfacedemo;

public class BankOfAmerica implements Bank{
	public void withdraw(int accno,float amount) {
		System.out.println("Bank of America withdraw funtionality");
		// logic
	}
	public void deposit(int accno, float amount) {
		System.out.println("Bank of America deposit funtionality");
		// logic
	}
	public String transferAmount(int toAccNo, int fromAccno, float amount) {
		System.out.println("Bank of America transfer amount funtionality");
		// logic
		return "done";
	}
}
