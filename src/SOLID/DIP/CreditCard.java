package SOLID.DIP;

public class CreditCard implements BankCard{

    public void DoTransaction(long amount){
        System.out.println("Payment using Credit card");
    }
}
