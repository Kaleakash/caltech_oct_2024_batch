package interfacedemo;

public class BankTest {

	public static void main(String[] args) {
	BankOfAmerica bom = new BankOfAmerica();
	bom.withdraw(1, 500);
	bom.deposit(1, 200);
	bom.transferAmount(1, 2, 350);

	BankOfIndia boi = new BankOfIndia();
	boi.deposit(1, 300);
	boi.withdraw(1, 240);
	boi.transferAmount(1, 2, 150);
	}

}
