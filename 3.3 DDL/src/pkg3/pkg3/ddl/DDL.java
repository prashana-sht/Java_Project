
package pkg3.pkg3.ddl;
import java.sql.*;
public class DDL {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "";

        String createTableSQL = "CREATE TABLE IF NOT EXISTS employees ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "first_name VARCHAR(50),"
                + "last_name VARCHAR(50),"
                + "age INT"
                + ")";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
                Statement statement = connection.createStatement();

                // Execute the DDL statement
                statement.executeUpdate(createTableSQL);

                System.out.println("Table 'employees' created successfully.");

                // Close the resources
                statement.close();
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
}
