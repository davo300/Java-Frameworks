// Code File Circle
public class Circle
{
    private double radius;
    private double PI = 3.14159;

    // no argument Constructor
    public Circle()
    {
        radius = 0;
    }
    // one argument Constructor
    public Circle(double rad)
    {
        // make sure the parameter is not negative
        if (rad < 0)
            radius = 0;
        else
            radius = rad;
    }
    
    // Radius Property
    public void setRadius(double rad) 
    {
        if (rad < 0)
        {
            radius = 0;
        }
        else 
        {
            radius = rad;
        }

    }
    
    public double getRadius() 
    {
        return this.radius;
    }

    // GetArea Method
    public double GetArea()
    {
        double area;
        // compute the area = radius^2 * PI
        area = radius * radius * PI;
        return area;
    }
    
    //overloaded > operator to compare circles
    public static boolean isGreater(Circle circle1, Circle circle2) 
    {
        if(circle1.radius > circle2.radius)
        {
            return true;
        }
        
        else 
        {
            return false;
        }
    }
}