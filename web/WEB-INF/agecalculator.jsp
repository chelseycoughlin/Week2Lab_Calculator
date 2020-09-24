<%-- 
    Document   : agecalculator
    Created on : Sep 24, 2020, 12:15:23 AM
    Author     : 813017
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <form method="post" action="age">
    <body>
        <h1>Age Calculator</h1>
            Enter your age: <input type="text" name="age" value="${agecalc}"><br>
            <input type="submit" value="Age next birthday">
        <div>
            <p>Result: </p>${message}
        </div>
    </body>
    </form>
</html>
