import java.util.Date;//import for accurate date 

public class BankAccount implements Cloneable{      
	private int accountNumber;   
	private int balance;   
	private Date createDate;   
	
	// constructor for creating a bank account   
	public BankAccount(int accountNumber, int balance) {     
		this.accountNumber = accountNumber;     
		this.balance = balance;     
		this.createDate = new java.util.Date();   
		}      
	
	//deposit money   
	public int deposit(int amount) {     
		balance = balance + amount;      
		return balance;   }    
	
	//withdraw money   
	
	public int withdraw(int amount) throws Exception{     
		if (amount<0)       
			throw new Exception("Amount cannot be negative");     
		balance = balance - amount;      
		return balance;   
		}   
	
	@Override   
	public Object clone() {     
		BankAccount account = (BankAccount)super.clone();                         
		return account;     
		account.createDate = (Date) createDate.clone();            
	}
}