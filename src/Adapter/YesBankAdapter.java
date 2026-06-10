package Adapter;

import Adapter.ThirdParty.Yesbank;

public class YesBankAdapter implements BankApi{
    Yesbank yesbank=new Yesbank();

    @Override
    public double getBalance(int accountnumber) {
        return yesbank.checkBalance(accountnumber);
    }

    @Override
    public boolean trasferMoney(int fromacc, int toacc, int amt) {
       try{
           yesbank.transfer(fromacc, toacc, amt);
           return true;
       }
       catch (Exception e){
           return false;
       }
    }
}
