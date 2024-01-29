<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%
    Integer clickCount = (Integer) session.getAttribute("clickCount");

    if (clickCount == null) {
        clickCount = 0;
    }
    clickCount++;

    session.setAttribute("clickCount", clickCount);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Click Counter</title>
</head>
<body>
    <h2>Click Counter</h2>
    <p>You have clicked the link <strong><%= clickCount %></strong> times.</p>
    
    <a href="counter.jsp">Click me!</a>
</body>
</html>