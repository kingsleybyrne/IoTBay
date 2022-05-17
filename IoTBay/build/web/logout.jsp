<!DOCTYPE html>
<html>
    <head>
        <title>IoTBay: Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="login.css">
        <script src="https://kit.fontawesome.com/5b9a15581a.js" crossorigin="anonymous"></script>
    </head>
    <body>
        <header>
            <div id="top-bar">
                <a href="index.html"><img src="iotbaylogo.png" alt="" id="logo"></a>
            </div>
        </header>

        <main>
            <div id="main-div">
                <p>Logged out</p>
            </div>
            <%session.invalidate();%>
           
        </main>

        <footer>
            <p>&copy; Group 8</p>
            <p>Introduction to Software Development 2022</p>
            <p>University of Technology, Sydney</p>
        </footer>
                
    </body>
</html>

<%-- 
    Document   : logout
    Created on : 3 Apr 2022, 9:29:23 pm
    Author     : cdanielle
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
</html>
