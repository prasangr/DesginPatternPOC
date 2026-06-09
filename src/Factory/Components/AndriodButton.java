package Factory.Components;

public class AndriodButton implements Button {
    @Override
    public void changeColour() {
        System.out.println("Android Button is now Red");
    }
}
