package SOLID.DIP;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard= bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.DoTransaction(amount);
    }

    public static void main(String[] args) {
         BankCard bankCard=new CreditCard();
         ShoppingMall shoppingMall = new ShoppingMall(bankCard);
         shoppingMall.doPurchaseSomething(5000);
    }
}
