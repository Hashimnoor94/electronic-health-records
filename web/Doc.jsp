<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id = "add" class= "Bean.AddDoc">    
           <jsp:setProperty name="add" property="*"/>      
        </jsp:useBean>     
        <% if(add.isValid())
        {
            %>
            <jsp:forward page="EditOwnDetails.jsp"/>
            <%}
            else
            {
            %>
            <jsp:forward page="DoctorPage.jsp"/>
            <%
        }
            %>
    </body>
</html>
