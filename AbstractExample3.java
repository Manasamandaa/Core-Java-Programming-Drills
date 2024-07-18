/*write an abstract class with a shape that must contain an abstract method called area.Write two child classes  called circle and rectangle 
these two child classes must be concrete.*/
abstract class Shape{
    abstract void area();
}
class Circle extends Shape
{
    public void area()
    {
        int r=5;
        System.out.println("area of circle is:"+3.14*r*r);
    }
}
class Rectangle extends Shape
{
    public void area()
    {
        int l=5,b=6;
        System.out.println("area of rectangle:"+ l*b);
    }
   
}
public class AbstractExample3
{
    public static void main(String[] args)
    {
        Shape s=new Circle();
        s.area();
        Shape r=new Rectangle();
        r.area();
    }
}