<%-- 
    Document   : login
    Created on : Nov 27, 2015, 4:49:50 AM
    Author     : Pinkesh
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login</title>
    </head>
    <body>

        <form:form id="loginForm" method="post" action="login" modelAttribute="loginBean">
            <form:label path="username">User Name</form:label>
            <form:input id="username" name="username" path="username" /><br>
            <form:label path="username">Password</form:label>
            <form:password id="password" name="password" path="password" /><br>
            <input type="submit" value="Submit" />
        </form:form>
    </body>
</html>

