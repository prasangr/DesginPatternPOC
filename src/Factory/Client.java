package Factory;

import Factory.Components.Button;

import java.nio.Buffer;

public class Client {
    public static void main(String[] args) {
        Flutter f=new Flutter();
         f.refreshRate();
         f.setTheme();
        UIfactory ui=f.createUiFactory(SupportedPlatforms.IOS);
        Button b=ui.createButton();
         b.changeColour();

    }
}
