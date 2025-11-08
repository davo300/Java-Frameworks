import java.lang.Cloneable;//Clone mechanic import
public class MainClone implements Cloneable{//this class implements Cloneable for deep cloning

	public static void main(String[] args) {//main method for outputting information
		House house1 = new House(1, 1750.50);
		House house2 = (House)house1.clone();
        //Printing out the result of the tests
        System.out.println("Testing the code: house 1 == house 2: " + (house1 == house2));
        System.out.println("Testing the code: house 1.equals(house 2): " + house1.equals(house2));

    }//end of main

}//end of TestClass class



