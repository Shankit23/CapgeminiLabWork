package lab.two;

public class BankingApplication {
	public class Bank{
	private long accountNumber;
	private float amount;
	private String name;
	public void setAccount(long l, float i, String n) {
		accountNumber=l;
		amount=i;
		name=n;
	}
	
	public int depositAmount(int deposit) {
		 return amount=amount+deposit;
		 }
	public void withdrawAmount(int withdraw) {
		 amount=amount-withdraw;
	 }
	  
	 public void checkBalance() {
		 System.out.println("Current Balance is "+amount);
	 }
	 
   }
	public class Customer {
		Bank b1= new Bank();
		b1.setAccount(12345l, 500000.0f, "Shankit");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Choice");
	}

}