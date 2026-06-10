package Adapter;

public class Phonepe {
    BankApi bankApi;

    public Phonepe(BankApi bankApi){
        this.bankApi=bankApi;
    }


    public void doSomething(){
        double currentBalance=bankApi.getBalance(12345);
        System.out.println("Current Balance: "+currentBalance);
        currentBalance=currentBalance*2;

    }
}
