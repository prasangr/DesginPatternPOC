package Decorator;

public class OrangeCone implements IceCreamConstituents{

    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDesc() {
        return "Orange Cone";
    }
}
