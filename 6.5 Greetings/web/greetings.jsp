<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // Get the current time
    Calendar calendar = Calendar.getInstance();
    int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

    // Determine whether it's morning or evening
    String greeting = (hourOfDay < 12) ? "Good Morning" : "Good Evening";
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Greeting</title>
</head>
<body>
    <h2><%= greeting %></h2>
</body>
</html>
