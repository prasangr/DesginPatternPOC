package Factory;

import Factory.Components.AndriodButton;
import Factory.Components.AndroidMenu;

public class AndriodUiFactory implements UIfactory {
    @Override
    public AndriodButton createButton() {
        System.out.println("Creating Andriod Button");
        return new AndriodButton();
    }

    @Override
    public AndroidMenu createMenu() {
        System.out.println("Creating Andriod Menu");
        return new AndroidMenu();
    }
}
