<%-- 
    Document   : register
    Created on : 21/03/2022, 11:10:54 AM
    Author     : Dan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        <link type="text/css" rel="stylesheet" href="registerStyle.css">
    </head>
    <body>
        <h1>Sign Up</h1>
        <form action="welcome.jsp" method="post" id="register-form">
            
            <label for="name">Name:</label><br>
            <input type="text" id="name" name="name" placeholder="Enter Name" required="true"><br>
            <label for="email">Email:</label><br>
            <input type="text" id="email" name="email" placeholder="Enter Email" required="true"><br>
            <label for="phone">Phone Number:</label><br>
            <input type="text" id="phone number" name="phone number" placeholder="Enter Phone Number" required="true"><br>
            <label for="address">Address:</label><br>
            <input type="text" id="address" name="address" placeholder="Enter Address" required="true"><br>
            <label for="password">Password:</label><br>
            <input type="password" id="password" name="password" placeholder="Enter Password" required="true"><br>
            <label for="dob">Date of Birth:</label><br>
            <input type="date" id="dob" name="dob" placeholder="Enter Date of Birth" required="true"><br>
            
            <label for="tos">ToS</label>
            <input type="checkbox" id="tos" name="tos" required="true"><br>
            
            <input type="submit" value="Sign Up">
        </form>
        <div>
            <a href="index.html">Return To Main</a>
            
        </div>
    </body>
</html>
