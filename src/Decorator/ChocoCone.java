package Decorator;

public class ChocoCone implements IceCreamConstituents{


    IceCreamConstituents ic;
    public ChocoCone(){

    }
    public ChocoCone(IceCreamConstituents ic){
        this.ic=ic;
    }
    @Override
    public int getCost() {
        if (ic!=null) {
           return ic.getCost()+30;
        }else {
            return 30;
        }
    }

    @Override
    public String getDesc() {
    if (ic!=null) {
        return ic.getDesc()+" with Choco Cone";
    }
    return "Choco Cone";
    }



}
