package Strategy;

public class BikePathCalculator implements PathCalculator {

    @Override
    public void FindPath(String from, String to) {
        System.out.println("Finding path for bike from "+from+" to "+to);
    }
}
