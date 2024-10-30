import java.sql.*;

public class JDBC {

    private static String url = "url-connexion-a-votre-bd";
    private static String user = "votre-login";
    private static String passwd = "votre-password";
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                conn = DriverManager.getConnection(url, user, passwd);
                conn.setAutoCommit(false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
