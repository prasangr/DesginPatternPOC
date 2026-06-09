package Factory;

import Factory.Components.IosButton;
import Factory.Components.IosMenu;

public class IosUiFactory implements UIfactory {
    @Override
    public IosButton createButton() {
        System.out.println("Creating an iOS button");
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        System.out.println("Creating an iOS menu");
        return new IosMenu();
    }
}
