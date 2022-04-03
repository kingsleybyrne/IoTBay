<%-- 
    Document   : welcome
    Created on : 3 Apr 2022, 8:42:39 pm
    Author     : cdanielle
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="dao.Customer"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>IoTBay-Signed In</title>
    </head>
    <body>
        <h1>Welcome, (name)></h1>
        <p>Loading...</p>
    </body>
</html>

<script>
    setTimeout(function(){
        window.location.href = 'main.jsp';
    }, 3000);
</script>