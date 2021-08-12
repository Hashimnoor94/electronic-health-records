<%-- 
    Document   : SearchResults
    Created on : 27-Apr-2017, 11:41:24
    Author     : kareem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        
        <H1>HIII<H1>
        <jsp:useBean id="patients" class="Bean.ExternalCred"/>
        
    

         
        ${patients.search()}

         <%}%>

    </body>
</html>
