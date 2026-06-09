package Factory;

public class Flutter {

    public void refreshRate(){

    }

    public void setTheme(){

    }


    public UIfactory createUiFactory(SupportedPlatforms supportedPlatforms) {
    return UiFactoryCreater.getUiFactoryPlatform(supportedPlatforms);

    }
}
