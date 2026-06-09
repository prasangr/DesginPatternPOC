package Factory.Components;

public class IosButton implements Button {
    @Override
    public void changeColour() {
        System.out.println("Ios Button changes colour to blue");
    }
}
