package JavaApplication1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaApplication1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java";
        String username = "root";
        String password = "";

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                // Create a statement
                try (Statement statement = connection.createStatement()) {
                    // Execute a query
                    try (ResultSet resultSet = statement.executeQuery("SELECT * FROM student")) {
                        // Process the result set
                        while (resultSet.next()) {
                            int id = resultSet.getInt("roll");
                            String name = resultSet.getString("name");
                            System.out.println("ID: " + id + ", Name: " + name);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    