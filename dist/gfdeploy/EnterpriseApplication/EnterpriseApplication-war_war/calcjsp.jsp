<%-- 
    Document   : calcjsp
    Created on : 01-abr-2020, 19:49:56
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
   <form action="calcservlet" method="POST" >
            <input type="text" name="t1">
            <br>
            <input type="text" name="t2">
            <br>
            <br>
            <input name="calcular" type="submit" value="Suma">
            <input name="calcular" type="submit" value="Resta">
            <input name="calcular" type="submit" value="Multiplicacion">
            <input name="calcular" type="submit" value="Division">
        </form>
    </body>
</html>
