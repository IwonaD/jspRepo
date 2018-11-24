<%@page language="java" contentType="text/html" %>
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
</body>
</html>