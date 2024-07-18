class Base
{
    int a=100;
    static int s=200;
    static void fun1()
    {
        System.out.println("Base class fun1..static");
    }
    void display()
    {
        System.out.println("Base class display...instance");
    }
}
class Child extends Base
{
    int a=1000;
    static int s=200;
    static void fun1()
    {
        System.out.println("Child class fun1..static");
    }
    void display()
    {
        System.out.println("Child class display...instance");
    }    
}

public class Upcasting {
    public static void main(String[] args) {
        Base b=new Child();
        System.out.println(b.a);
        System.out.println(Base.s);//static variables are accessed through class name
        Base.fun1();
        b.display();
    }
    
}
