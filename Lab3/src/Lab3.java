import java.util.Scanner;
public class Lab3
{
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
        double inpRadius;
        // create a circle object with no arg constructor
        Circle cir1 = new Circle();
        // create a circle object with one arg constructor
        Circle cir2 = new Circle(10);

        // print out the area of the circles
        System.out.printf("Circle 1 has radius %f and area %f%n",
        cir1.getRadius(), cir1.GetArea());
        System.out.printf("Circle 2 has radius %f and area %f%n",
        cir2.getRadius(), cir2.GetArea());

        //prompt the user for a radius
        do
        {
          System.out.print("Enter a positive radius => ");
          inpRadius = input.nextDouble();
        } while (inpRadius < 0);
        
        cir1.setRadius(inpRadius);  

        // print out the area of the circles
        System.out.printf("Circle 1 has radius %f and area %f%n",
         cir1.getRadius(), cir1.GetArea());
        System.out.printf("Circle 2 has radius %f and area %f%n",
        cir2.getRadius(), cir2.GetArea());

        //add circles
        if (Circle.isGreater(cir1, cir2))
          System.out.printf("Circle 1, with radius %f is bigger the Circle 2 with radius %f%n", cir1.getRadius(), cir2.getRadius());
       else
          System.out.printf("Circle 1, with radius %f is not bigger the Circle 2 with radius %f%n", cir1.getRadius(), cir2.getRadius());
        readLine(null);
        }

    private static double readLine(String string) 
    {
        // TODO Auto-generated method stub
        return 0;
    }
}