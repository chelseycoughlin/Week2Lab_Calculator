<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 24, 2020, 12:16:56 AM
    Author     : 813017
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
            <form method="post" action="hello">
    <body>
            <input type="text" name="one" value="${numberone}"><br>
            <input type="text" name="two" value="${numbertwo}"><br>
            <input type="button" name="add" value="+">
            <input type="button" name="sub" value="-">
            <input type="button" name="multi" value="x">
            <input type="button" name="divide" value="%">
        
        <div>
            ${message}
        </div>
    </body>
    </form>
</html>
