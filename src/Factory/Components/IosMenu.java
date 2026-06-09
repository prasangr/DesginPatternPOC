package Factory.Components;

public class IosMenu implements Menu {
    @Override
    public void numberOfTabs() {
        System.out.println("Ios Menu has 5 tabs");
    }
}
