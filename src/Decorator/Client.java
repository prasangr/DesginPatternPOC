package Decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConstituents ic = new ChocoChip(new MangoScoop(new ChocoCone()));
        System.out.println(ic.getCost());
        System.out.println(ic.getDesc());
    }
}
