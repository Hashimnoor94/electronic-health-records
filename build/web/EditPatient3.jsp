<%-- 
    Document   : EditPatient3
    Created on : Apr 22, 2017, 1:52:35 PM
    Author     : Hashim
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id = "edit" class= "Bean.Edit">    
           <jsp:setProperty name="edit" property="*"/>      
        </jsp:useBean>     
        <% if(edit.isValid())
        {
            %>
            <jsp:forward page="newjsp.jsp"/>
            <%}
            else
            {
            %>
            <jsp:forward page="EditPatient2.jsp"/>
            <%
        }
            %>
    </body>
</html>