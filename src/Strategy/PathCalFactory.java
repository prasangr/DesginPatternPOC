package Strategy;

public class PathCalFactory {


    public static PathCalculator getPCforMode(String mode) {
        if (mode.equalsIgnoreCase("car")) {
            return new CarPathCalculator();
        } else if (mode.equalsIgnoreCase("bike")) {
            return new BikePathCalculator();
        } else {
            throw new IllegalArgumentException("Invalid mode: " + mode);
        }
    }
    }