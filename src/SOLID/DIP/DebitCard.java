package SOLID.DIP;

public class DebitCard implements BankCard{

    public void DoTransaction(long amount){
        System.out.println("Payment using Debit Card");
    }
}
