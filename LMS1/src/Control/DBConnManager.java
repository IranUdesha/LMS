package Control;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnManager {

    private String sourceURL;

    public DBConnManager() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sourceURL = new String("jdbc:mysql://localhost:3306/lms?");
        } catch (ClassNotFoundException classNotFoundException) {
            System.err.println(classNotFoundException + "\nUnable to load database driver classes.");
        }
    }

    public Connection connect() {
        Connection dbConn = null;
        try {
            dbConn = (Connection) DriverManager.getConnection(sourceURL, "root", "");
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "\nDB connection failure");
        }
        return dbConn;
    }

    public void connectionClose(Connection dbConn) {
        try {
            dbConn.close();
        } catch (SQLException sQLException) {
            System.out.println(sQLException + "\nDB connection closing failure");
        }
    }
}
