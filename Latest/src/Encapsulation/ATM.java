package Encapsulation;

public class ATM {

	public static void main(String[] args) {

Bank card = new Bank();
ATM swipe = new ATM();

card.withdraw(1234, 1111, 10);
card.changepassword(1234, 1111, 2222);

	}

}
