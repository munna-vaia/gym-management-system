package DB;

import java.sql.*;

public class ConnectorProvider {

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_management_system", "root", "");
            return con;
        } catch (Exception ignore) {
            System.out.println(ignore.getMessage());
            return null;
        }
    }
}
