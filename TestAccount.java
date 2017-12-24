
public class TestAccount 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Account a1=new Account();
		a1.insertNewAccount(123, "vam", 10000);
		a1.displayInfo();
		a1.deposit(123);
		a1.displayInfo();
		a1.withdraw(124);
		a1.displayInfo();
	}

}
