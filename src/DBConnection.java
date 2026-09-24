import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:oracle:thin:@localhost:1521/FREEPDB1";

    private static final String USER = "SMART_PARK";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}