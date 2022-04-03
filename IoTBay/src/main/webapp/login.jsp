<%-- 
    Document   : login
    Created on : 3 Apr 2022, 7:28:56 pm
    Author     : cdanielle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IoTBay Login</title>
    </head>
    <body>
        <h1>IoTBay Login Page</h1>
        <form action="welcome.jsp" method="POST">
            <label for="email" id="email-label" name="email">Email:</label><br>
            <input class="" type="email" id="email" placeholder ="Enter your email address..." required><br>
            
            <label for="password" id="password-label" name="password">Password:</label><br>
            <input class="" type="password" id="password" placeholder ="Enter your password..." required><br>
            
            <button type="submit" id="login-button">Login</button>
        </form>
                
    </body>
</html>
