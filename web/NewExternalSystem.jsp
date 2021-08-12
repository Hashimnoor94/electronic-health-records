
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id= "cred" class= "Bean.ExternalCred">
            <jsp:setProperty name="cred" property="*"/>
        </jsp:useBean>
           
    </body>
</html>