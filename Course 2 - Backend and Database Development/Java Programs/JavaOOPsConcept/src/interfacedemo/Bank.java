package interfacedemo;

public interface Bank {
	public void withdraw(int accno,float amount);
	public void deposit(int accno, float amount);
	public String transferAmount(int toAccNo, int fromAccno, float amount);
}
