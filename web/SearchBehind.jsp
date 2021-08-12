<%-- 
    Document   : SearchBehind
    Created on : 27-Apr-2017, 11:38:23
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

        <form action="SearchResults.jsp">



            <jsp:useBean id = "add" class= "Bean.ExternalCred">    
                <jsp:setProperty name="add" property="patientsName"/>      
            </jsp:useBean> 
            <input type="submit" value="View Results" />





        </form>

    </body>
</html>
