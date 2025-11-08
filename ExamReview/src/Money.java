public class Money {   
	private int cAmount;   
	private String cCurrency;   

//constructor for creating a money object
public Money(int amount, String currency) {     
	cAmount = amount;     
	cCurrency = currency;   
}
  // get money
public int getAmount() {     
	return cAmount;   
}   

// get money  
 public String getCurrency() {     
	 return cCurrency;   
}   

// adds money   
public Money add(Money m) throws Exception{     
            if (m.getAmount()<0)       
                    throw new Exception("Money cannot be negative");     
            return new Money(cAmount + m.getAmount(), getCurrency());   
}      

public static void main(String[] args) {          
	Money money = new Money(-100, "CAD");     
	Money result;     
	try {       
             result = money.add(new Money(100, "CAD")); 
	} catch (Exception e) {
             System.out.println("Sorry! We couldn't add money!");     
	} finally {       System.out.println("This was an attempt to add money!");     
	}  
	System.out.println("Whether money is added or not depends on your program!");   
	}
} 