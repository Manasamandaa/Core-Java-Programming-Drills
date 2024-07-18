class Base
{
    int a=100;
    static int s=200;
    static void fun1()
    {
        System.out.println("Base Class fun1...static");
    }
    void display()
    {
        System.out.println("Base class Display..");
    }
}
class Child extends Base
{
    int a=1000;
    static int s=2000;
    static void fun1()
    {
        System.out.println("child Class fun1...static");
    }
    void display()
    {
        System.out.println("child class Display..");
    }
}


public class Downcasting
{
    public static void main(String[] args)
    {
        Base b=new Child();
        Child c=(Child)b;
        System.out.println(b.a);
        System.out.println(b.s);
        System.out.println(c.a);
        System.out.println(c.s);
        b.fun1();
        c.fun1();
        b.display();
        c.display();
        
    }
}