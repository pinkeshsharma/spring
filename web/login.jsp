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
        <link rel="stylesheet" href="styles/common.css" >
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css" >
        <link rel="stylesheet" href="bootstrap/bootstrap-theme.min.css" >
        <script src="bootstrap/bootstrap.min.js"></script>
    </head>
    <body style="background-image: url('images/17094515785_73a96cb107_b.jpg');background-size:cover">
        <article class="rootContent">
            <form:form id="loginForm" method="post" action="login" modelAttribute="loginBean" class="form-group centered login_center">
                <div class="pad_3 topOfBox">${message}</div>
                <ul class="form-group">
                    <li class="inline"><label><font color="white" size="72"> Play9ers!!!</font></li>
                </ul>
                <form:label path="username"><font color="white">User Name</font></form:label>
                <form:input class="form-control" placeholder="Email" id="username" name="username" path="username" /><br>
                <form:label path="username"><font color="white">Password</font></form:label>
                <form:password class=" form-control" placeholder="Password"  id="password" name="password" path="password" /><br>
                <input class="btn btn-success" type="submit" value="Submit" />
            </form:form>
        </article>
    </body>
</html>

