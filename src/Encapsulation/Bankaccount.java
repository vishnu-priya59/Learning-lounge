package Encapsulation;

public class Bankaccount {
    double accountnumber;
    double balance;
    Bankaccount(double accountnumber, double balance){
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
     void deposit(double amount){
        balance += amount;
     }
     void withdraw(double withdraw){
        if(balance>=withdraw){
            balance -= withdraw;
        }
        else{
            System.out.println("Insuffficient funds");
        }
     }

}
