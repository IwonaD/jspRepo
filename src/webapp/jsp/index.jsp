<%@page import="java.time.LocalDate"%>
<%@page language="java" contentType="text/html; charset =UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>HOME PAGE</title>
</head>
<body>
Nasz pierwszy jsp
<h1><%    String numbers = "<br>";
    for (int i = 1; i <= 100; i++) {
        numbers += i + " ";
        if (i % 10 == 0) {
            numbers += "</br>";
            out.print(numbers);
            numbers = "";
        }
    } %></h1>
<h2><%= LocalDate.now().toString()%> </h2>
<h3><% String name = request.getParameter("name");
    String surname = request.getParameter("surname")
            ;%></h3>
<%-- Komentarz jsp --%>
<!-- Komentarz html -->
</body>
</html>