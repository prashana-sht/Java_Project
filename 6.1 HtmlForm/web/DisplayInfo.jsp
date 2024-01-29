<%@ page import="java.io.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Information Entered:</h2>
    <% 
        String name = request.getParameter("name");
        String address = request.getParameter("address");
    %>
    <p><strong>Name:</strong> <%= name %></p>
    <p><strong>Address:</strong> <%= address %></p>
    </body>
</html>
