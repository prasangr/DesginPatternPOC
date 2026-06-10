package Decorator;

public class ChocoChip implements IceCreamConstituents{
    public IceCreamConstituents ic;
    public ChocoChip(IceCreamConstituents ic) {
        if (ic == null) {
            throw new IllegalArgumentException("Ice Cream Constituent cannot be null");
        }
        this.ic = ic;
    }

    @Override
    public int getCost() {
        return ic.getCost() + 40;
    }

    @Override
    public String getDesc() {
        return ic.getDesc() + " with ChocoChip";
    }
}
