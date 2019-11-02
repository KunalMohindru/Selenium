package Encapsulation;

public class Bank {

private int accountnumber = 1234;
private int password = 1111;
private int balance = 1000;
		
public void withdraw(int acc, int pass, int amt) {

	if ((acc==accountnumber)&&(pass==password))
	{ balance = balance - amt;
	System.out.println("Amount deducted   :"+ amt);
	System.out.println("Amount remaining   :"+ balance);
	}
	
	else 
	{
		System.out.println("Invalid Credentials");
	}
	
}
			
public void changepassword( int acc1, int oldpass, int newpas) {

	if ((acc1==accountnumber)&&(oldpass==password))
	{ password = newpas;
	System.out.println("Password changed   :"+ password);
	}
	
	else 
	{
		System.out.println("Invalid Credentials");
	}
}
}
