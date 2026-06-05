package _7_Singleton;

class DatabaseConnection{
    private static DatabaseConnection databaseConnection;

    private DatabaseConnection(){
        System.out.println("Database Connected");
    }

    public static synchronized DatabaseConnection getInstance(){
        if(databaseConnection==null){
            databaseConnection=new DatabaseConnection();
        }
        return databaseConnection;
    }

    public void connect(){
        System.out.println("Using Database Connection");
    }
    
}

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        
        db1.connect();

        System.out.println(db1==db2);
    }
}