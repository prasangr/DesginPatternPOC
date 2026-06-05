package Singleton.doublechecking;

public class DBConnection {

    private static DBConnection instance=null;

    private DBConnection() {
        //initialise attributes
    }


    public static DBConnection getInstance() {
        if (instance==null){
            synchronized (DBConnection.class){
                if (instance==null){
                    instance=new DBConnection();
                }
            }
        }



        return instance;
    }


}
