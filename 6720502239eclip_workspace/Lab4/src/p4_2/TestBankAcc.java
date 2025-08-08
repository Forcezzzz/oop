package p4_2;
import p4_1.Date;

public class TestBankAcc {

	public static void main(String[] args) {
	BankAcc acc1 = new BankAcc("Mook");
	Date date = new Date(1,11,2015);
	BankAcc acc2 = new BankAcc("Thun",500,date);
	
	acc1.deposit(1000);
	acc2.transfer(acc1, 300);
	acc2.withdraw(300);
	
	System.out.println(acc1.getInfo() + "\nbalance : "+ acc1.getBalance());
	System.out.println(acc2.getInfo() + "\nbalance : "+ acc2.getBalance());
	}
}
