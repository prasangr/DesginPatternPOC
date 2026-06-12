package Strategy;

public class CarPathCalculator implements PathCalculator {

    @Override
    public void FindPath(String from, String to) {
        System.out.println("Finding path for car from "+from+" to "+to);
    }
}
