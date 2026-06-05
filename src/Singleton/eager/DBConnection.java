package Singleton.eager;

public class DBConnection {

    private static DBConnection instance=new DBConnection();

    private DBConnection() {
        //initialise attributes
    }


    public static DBConnection getInstance() {
        return instance;
    }


}
