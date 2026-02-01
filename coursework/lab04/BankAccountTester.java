package lab04;


public class BankAccountTester {
	
public static void main(String[] args){
		{
			String firstname1 = "John";
			String lastname1 = "Smith";
			int accNo1 = 123;
			
			String firstname2 = "Alice";
			String lastname2 = "Bob";
			int accNo2 = 153;
			

			BankAccount test1 = new BankAccount(4500);
			test1.setName(firstname1,lastname1);
			test1.setAccNo(accNo1);
			test1.setLoanAmount(5000);
			test1.setRate(0.5);
			test1.setTimeInYears(3);
			test1.getBal();
			test1.getBalance();
			test1.getPayback();
			
			BankAccount test2 = new BankAccount(4500);
			test2.setName(firstname2,lastname2);
			test2.setAccNo(accNo2);
			test2.setLoanAmount(5001);
			test2.setRate(0.5);
			test2.getBal();
			test2.getBalance();
			test2.getPayback();
	
	
			
			
			test1.deposit(501.00);
			test2.deposit(502.00);
			
			test1.displayaccount();
			test2.displayaccount();
			
			
			
			//System.out.println(b.first);
			/*This statement will raise an error
			 * as the "first" variable in BankAccount class is defined as
			 * private and it cannot be accessed in a public class,
			 * you can only view the details using getter methods you define*/
		}

	}


}
