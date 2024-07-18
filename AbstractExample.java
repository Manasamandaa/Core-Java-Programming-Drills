abstract class One
{
    abstract void add(int a ,int b);
    void sub(int a,int b)
    {
        System.out.printf("%d - %d =%d",a,b,(a-b));
    }
}
class Child extends One
{
    void add(int a,int b)
    {
        System.out.printf("%d - %d = %d",a,b,(a+b));
    }
}
public class AbstractExample
{
    public static void main(String[] args)
    {
        One o1=new Child();
        o1.add(10,20);
        o1.sub(10,2);

    }
}


