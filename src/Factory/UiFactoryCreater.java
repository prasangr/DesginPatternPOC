package Factory;

public class UiFactoryCreater {


    public static UIfactory getUiFactoryPlatform(SupportedPlatforms supportedPlatforms) {
        if (supportedPlatforms == SupportedPlatforms.ANDROID) {
            return new AndriodUiFactory();
        } else if (supportedPlatforms == SupportedPlatforms.IOS) {
            return new IosUiFactory();
        }

        return null;
    }

}
