public class DatabaseConnect {
    public static DatabaseConnect connect;

    private DatabaseConnect(){

    }

    public static DatabaseConnect getInstance(){
        if(connect == null){
            connect = new DatabaseConnect();
        }
        return connect;
    }
}
