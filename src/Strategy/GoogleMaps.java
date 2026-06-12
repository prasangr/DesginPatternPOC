package Strategy;

public class GoogleMaps {
public void FindPath(String from, String to, String mode) {
    PathCalculator pc = PathCalFactory.getPCforMode(mode);
    pc.FindPath(from, to);
    }
}
