package Factory;

import Factory.Components.Button;
import Factory.Components.Menu;

public interface UIfactory {
Button createButton();
Menu createMenu();
}
