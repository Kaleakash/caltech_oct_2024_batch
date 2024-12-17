package interfacedemo;

public class BankOfIndia implements Bank{

	@Override
	public void withdraw(int accno, float amount) {
		// TODO Auto-generated method stub
		System.out.println("Bank of India withdraw funtionality");
	}

	@Override
	public void deposit(int accno, float amount) {
		// TODO Auto-generated method stub
		System.out.println("Bank of India deposit funtionality");
	}

	@Override
	public String transferAmount(int toAccNo, int fromAccno, float amount) {
		// TODO Auto-generated method stub
		System.out.println("Bank of India transfer amount funtionality");
		return null;
	}

	
	
}
