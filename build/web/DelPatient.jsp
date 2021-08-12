<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id = "del" class= "Bean.DeletePat">    
           <jsp:setProperty name="del" property="*"/>      
        </jsp:useBean>     
        <% if(del.isValid())
        {
            %>
            <jsp:forward page="newjsp.jsp"/>
            <%}
            else
            {
            %>
            <jsp:forward page="DeletePatient.jsp"/>
            <%
        }
            %>
    </body>
</html>