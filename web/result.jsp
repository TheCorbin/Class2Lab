<%-- 
    Document   : result
    Created on : Sep 2, 2015, 12:40:07 PM
    Author     : ryancorbin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page!</title>
    </head>
    <body>
        <p><%= request.getAttribute("greeting")%></p>
    </body>
</html>