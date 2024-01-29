<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // Database connection parameters
    String jdbcUrl = "jdbc:mysql://localhost:3306/java";
    String dbUser = "root";
    String dbPassword = "";

    // JDBC objects
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
        // Load the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the database connection
        connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
        statement = connection.createStatement();

        // Insert operation
        String insertQuery = "INSERT INTO employees (first_name, last_name, age) "
                + "VALUES ('John','Kc', 25)";
        int insertResult = statement.executeUpdate(insertQuery);

        // Update operation
        String updateQuery = "UPDATE employees SET age = 26 WHERE first_name = 'John'";
        int updateResult = statement.executeUpdate(updateQuery);

        // Select operation
        String selectQuery = "SELECT * FROM employees";
        resultSet = statement.executeQuery(selectQuery);

        // Display the results
        out.println("<h2>Database Operations Results:</h2>");

        // Display insert and update results
        out.println("<p>Insert Result: " + insertResult + "</p>");
        out.println("<p>Update Result: " + updateResult + "</p>");

        // Display select results
        out.println("<h3>Records in employees:</h3>");
        out.println("<ul>");

        while (resultSet.next()) {
            String name = resultSet.getString("first_name");
            int age = resultSet.getInt("age");
            out.println("<li>Name: " + name + ", Age: " + age + "</li>");
        }

        out.println("</ul>");

    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
        e.printStackTrace();
    } finally {
        // Close JDBC objects in a finally block
        try { if (resultSet != null) resultSet.close(); } catch (Exception e) { /* ignored */ }
        try { if (statement != null) statement.close(); } catch (Exception e) { /* ignored */ }
        try { if (connection != null) connection.close(); } catch (Exception e) { /* ignored */ }
    }
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Database Operations</title>
</head>
<body>
    <p><a href="index.html">Back to Home</a></p>
</body>
</html>
