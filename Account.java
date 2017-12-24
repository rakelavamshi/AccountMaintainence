
public class Account 
{
	int acctNo;
	String acctName;
	int balance;
	
	void insertNewAccount(int accountNumber,String accountHolderName,int currentBalance)
	{
		acctNo=accountNumber;
		acctName=accountHolderName;
		balance=currentBalance;
		System.out.println("Account Created");
	}
	void displayInfo()
	{
		System.out.println(acctNo+acctName+balance);
	}
	void deposit(int amt)
	{
		balance=balance+amt;
		System.out.println("Amount Successfully Deposited");
	}
	void withdraw(int amt)
	{
		if(balance<amt)
			System.out.println("Amount not Sufficient");
		else
		{
			balance=balance-amt;
			System.out.println("Amount Withdrawn is"+amt);
		}
	}
}
