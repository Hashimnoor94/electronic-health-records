<%-- 
    Document   : Hello
    Created on : Mar 28, 2017, 4:11:46 PM
    Author     : anam_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id= "credexe" class= "Bean.ExternalCred" scope="request">
            <jsp:setProperty name="credexe" property="*"/>
        </jsp:useBean>
        <jsp:useBean id= "patients" class= "Bean.ExternalCred" scope="session">
            <jsp:setProperty name="patients" property="*"/>
        </jsp:useBean>  
        <% if(credexe.isValid())
        {
        %>    
            <jsp:forward page="ExternalHome.jsp"/>
         
        <%}
            else
            {
            %>
         
         <jsp:forward page="externalsys_signin.jsp"/>
         
            <%
        }
            %>
            
    </body>
</html>