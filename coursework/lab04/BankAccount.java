/**
 * 
 */
package lab04;

/**
 * @author Tyrone
 *
 */
public class BankAccount {
		private String first, last;
		private int accNo;
		private double balance, loanAmount, initialBalance = 0;
		private double deposit = 0;
		private int timeInYears = 0;
		private double rate = 0.00;
		private double payback = 0.0;
		public double setbalance=0.0;
		
		public BankAccount(int i) {
			// TODO Auto-generated constructor stub
		}
		//Empty constructor
		public void Bankkaccount(){

		}
		//Constructor with initial balance
		public void Bankkaccount(double initialBalance)
		{
			this.initialBalance = initialBalance;
		}
		public void setName(String first, String last)
		{
			this.first = first;
			this.last = last;
		}
		public void setAccNo(int accNo)
		{
			this.accNo = accNo;
		}
		
		//Add getters and setters
		public void setLoanAmount(double loanAmount) {
			this.loanAmount = loanAmount;
		}
		public String getName() {
			return this.first+" "+ this.last;
		}
		public double getBal() {
			return this.initialBalance + this.getBalance();
			}
		public int getAccNo() {
			return this.accNo;
		}
		public void deposit(double deposit) {
			this.setBalance(this.getBalance() + deposit);
		}
		public void withdraw(double withdrawal) {
			this.setBalance(this.getBalance() - deposit);
		}
		public int getTimeInYears() {
			return timeInYears;
		}
		public void setTimeInYears(int timeInYears) {
			this.timeInYears = timeInYears;
		}
		public double getRate() {
			return rate;
		}
		public void setRate(double rate) {
			this.rate = rate;
		}
		public double getLoan2(double amount, int timeInYears, double rate) {
			return amount*(1+ (rate * timeInYears));
		}
		public double setLoanInterest(double loanAmount, double rate, int timeInYears) {
		    return this.loanAmount = loanAmount;
		}
		public double setLoan() {
		 return this.payback;
			
		}
		public void displayaccount() {

			System.out.println("Account holder: "+this.getName()+" account #:"+ this.accNo+"\nAccount Balance:"+this.getBal()+"\nPrinciple amount: "+
		this.loanAmount+"\nHow much loan needs to be payed back "+  getLoan2(this.loanAmount,3, 0.05) +"\n"+armstrong());
		}
		public double getBalance() {
			return (balance+this.loanAmount);
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getPayback() {
			return this.payback;
			
		}
		public double getInterestRate() {
			return (rate*timeInYears);
		}
		public void setInterestRate(double interestRate) {
		}
		public boolean armstrong() {
			String accStr = String.valueOf(accNo);
			char ch1 = accStr.charAt(0);
			char ch2 = accStr.charAt(1);
			char ch3 = accStr.charAt(2);
			int in1 = Character.getNumericValue(ch1);
			int in2 = Character.getNumericValue(ch2);
			int in3 = Character.getNumericValue(ch3);
			boolean problem = false;
			if((in1*in1*in1)+(in2*in2*in2)+(in3*in3*in3) ==accNo){
				problem = true;
			}
			
			
			return problem;
		}
		
		
		//Create necessary methods here
		
		
		
		
		

	// To Do
	// Create the necessary methods here



	}




