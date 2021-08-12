
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Page</title>
    <style>
        body {font-family: Calibri, sans-serif; background: #EAEAEA}
        h1   {color: white; background-color: #F14141;}
    </style>
    </head>
    <body>
    <center>
        <h1>View All Patients</h1>
    </center>
        
        ${patients.data}
        <c:remove var="patients" scope="session"/>
        <%
            session.removeAttribute("bean");
        %>
    
    </body>
</html>
