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
            <div id="middle-div">
                <h1>Sign in to IoTBay</h1>
                <h3>Or <a href="register.jsp">create an account</a></h3>
                <form action="welcome.jsp" method="POST">
                    <input class="" type="email" id="email" placeholder ="Email address..." required><br>                
                    <input class="" type="password" id="password" placeholder ="Password..." required><br>
                    <button type="submit" id="login-button">Login</button>
                </form>
            </div>
           
        </main>

        <footer>
            <p>&copy; Group 8</p>
            <p>Introduction to Software Development 2022</p>
            <p>University of Technology, Sydney</p>
        </footer>
                
    </body>
</html>
