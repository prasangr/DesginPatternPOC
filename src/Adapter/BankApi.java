package Adapter;

public interface BankApi {

    public double getBalance(int accountnumber);
    public boolean trasferMoney(int fromacc, int toacc, int amt);
}
