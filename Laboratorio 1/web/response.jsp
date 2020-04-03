<%-- 
    Document   : response
    Created on : 17-mar-2020, 19:18:11
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name"/>
        <jsp:setProperty name="mybean" property="fNacimiento"/>
        <jsp:setProperty name="mybean" property="fIngreso"/>
        <jsp:setProperty name="mybean" property="fSemestre"/>

        <h1>Hola, <jsp:getProperty name="mybean" property="name" /></h1>
        <h1>Su edad es <jsp:getProperty name="mybean" property="edad" /></h1>
        <h1>Ingreso a la universidad en el periodo <jsp:getProperty name="mybean" property="fIngreso" />-<jsp:getProperty name="mybean" property="fSemestre" /></h1>
        <h1>Actualmente esta en <jsp:getProperty name="mybean" property="semestre"/> semestre</h1>




    </body>
</html>
