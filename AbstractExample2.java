abstract class Bank
{
    void openAccount()
    {
        System.out.println("account is opened");
    } 
    abstract void deposit(float amt);
}
class CityBank extends Bank{
    public void deposit(float amt)
    {
        System.out.println("deposit"+amt);
    }
}
public class AbstractExample2 {
    public static void main(String[] args)
    {
        Bank b=new CityBank();
        b.openAccount();
        b.deposit(10000.00f);
    }
}
