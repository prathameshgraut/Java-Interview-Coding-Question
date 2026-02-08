package ADVANCED_OOP_JDBC_PROGRAMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connectivity {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ConnectionDB","root","Example@2024");

            // 3. Check Connection
            if (con != null) {
                System.out.println("Database Connected Successfully");
            }

            // 4. Close Connection
            con.close();
    }
}
