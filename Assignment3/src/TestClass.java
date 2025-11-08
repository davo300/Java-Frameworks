import java.lang.Cloneable;//Clone mechanic import

public class TestClass implements Cloneable{//this class implements Cloneable for deep cloning

	public static void main(String[] args) {//main method for outputting information
        BankAccount account1 = new BankAccount(782597, 3500);//new bank account named account1 with a set account number and balance
        BankAccount account2 = (BankAccount) account1.clone();//cloning account 1 to create account 2
         
        //Printing out the result of the tests
        System.out.println("Testing the code: Account 1 == Account 2: " + (account1 == account2));
        System.out.println("Testing the code: Account 1.equals(Account 2): " + account1.equals(account2));

    }//end of main

}//end of TestClass class



