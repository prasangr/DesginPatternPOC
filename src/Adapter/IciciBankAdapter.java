package Adapter;

import Adapter.ThirdParty.IciciBank;

public class IciciBankAdapter implements BankApi {
    IciciBank iciciBank=new IciciBank();

    @Override
    public double getBalance(int accountnumber) {
        return iciciBank.getBalance(accountnumber);
    }

    @Override
    public boolean trasferMoney(int fromacc, int toacc, int amt) {
        try {
            iciciBank.transferMoney(String.valueOf(fromacc), String.valueOf(toacc), amt);
            return true;
        }
        catch (Exception e){
            return false;
        }

    }
}
