<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id = "add" class= "Bean.AddPat">    
           <jsp:setProperty name="add" property="*"/>      
        </jsp:useBean>     
        <% if(add.isValid())
        {
            %>
            <jsp:forward page="newjsp.jsp"/>
            <%}
            else
            {
            %>
            <jsp:forward page="AddPatient.jsp"/>
            <%
        }
            %>
    </body>
</html>
