//This program can create bank accounts and deep clones them

import java.util.Date;//import for accurate date 
import java.lang.CloneNotSupportedException;//exception import

public class BankAccount implements Cloneable{//this class implements Cloneable for deep cloning
	
	private int AccountNumber;//private variable for an account number made accessible through a get/set
    private int balance;//private variable for an account balance made accessible through a get/set
    private Date createDate;//private variable for a date made accessible through a get/set

	//constructor for creating a bank account
	public BankAccount(int AccountNumber, int balance) {
		this.AccountNumber = AccountNumber;//set account number to newly created account
		this.balance = balance;//set balance to newly created account
		this.createDate = new java.util.Date();//implementing the imported java.util.Date 
	}//end of BankAccount constructor
	
	//method to deposit money from account
	public int deposit(int amount) {
		balance = balance + amount; //updating balance
		return balance;//returning value to method call
	}//end of deposit method

	//method to withdraw money from account
	public int withdraw(int amount) throws Exception{
		if (amount<0)//if to insure balance is not below zero. Removing an amount from below zero would result in a negative number
			throw new Exception("Amount cannot be negative");//throw exception for invalid value case
		balance = balance - amount;//updating balance
		return balance;//returning value to method call
	}//end of withdraw method
	

    @Override //Override the clone method from the Object class to create a deep clone of the BankAccount object
    public Object clone() {
        BankAccount clonedAccount = null; //Declare a new BankAccount object
        try {
            clonedAccount = (BankAccount) super.clone();  //Call the clone() method of the Object class to clone the BankAccount object
            clonedAccount.createDate = (Date) this.createDate.clone(); //Clone the createDate field of the BankAccount object using the clone() method of the Date class
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonedAccount; //Return the cloned BankAccount object
    }

    @Override //Override the equals method from the Object class to compare two BankAccount objects
    public boolean equals(Object account1) {    
        if (account1 == null) //Check if the input object is null
            return false;
        if (getClass() != account1.getClass()) //Check if the input object is of the same class as this BankAccount object
            return false;
       
        BankAccount other = (BankAccount) account1; //Cast the input object to a BankAccount object
       
        if (AccountNumber != other.AccountNumber) //Compare the AccountNumber and balance fields of the two BankAccount objects
            return false;
        if (balance != other.balance)
            return false;
        if (createDate == null) {  //Compare the createDate fields of the two BankAccount objects using the equals() method of the Date class
            if (other.createDate != null)
                return false;
        } else if (!createDate.equals(other.createDate))
            return false;
        
        return true; //If all fields match, return true
    }
}//end of BankAccount class	