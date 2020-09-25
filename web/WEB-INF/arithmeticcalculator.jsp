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
        <title>Arithmetic Calculator</title>
    </head>
    <body>
    <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <input type="text" name="valone"><br>
            <input type="text" name="valtwo"><br>
            <input type="submit" name="addition" value="+">
            <input type="submit" name="subtract" value="-">
            <input type="submit" name="multiply" value="x">
            <input type="submit" name="divide" value="%">
        
        <div>
           <p>Calculation: </p>${messagetwo}
        </div>
        </form>
        <br>
         <a href="age">Age Calculator</a> 
    </body>
</html>
