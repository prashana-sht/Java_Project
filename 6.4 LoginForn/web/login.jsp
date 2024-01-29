<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    // Hardcoded valid username and password for demonstration purposes
    String validUsername = "user";
    String validPassword = "pass123";

    // Retrieve user input from the form
    String enteredUsername = request.getParameter("username");
    String enteredPassword = request.getParameter("password");

    // Check if the entered credentials are correct
    boolean isValidLogin = validUsername.equals(enteredUsername) && validPassword.equals(enteredPassword);
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Result</title>
</head>
<body>
    <h2>Login Result</h2>
    
    <% if (isValidLogin) { %>
        <p>Login successful! Welcome, <%= enteredUsername %>!</p>
    <% } else { %>
        <p>Login failed! Invalid username or password.</p>
    <% } %>
    
    <p><a href="index.html">Back to Login Form</a></p>
</body>
</html>
