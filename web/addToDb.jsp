<%-- 
    Document   : addToDb
    Created on : 26-Apr-2017, 19:02:05
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
        
     
        <form action="ExternalHome.jsp">
            
            
      
        <jsp:useBean id = "add" class= "Bean.ExternalCred">    
           <jsp:setProperty name="add" property="*"/>      
        </jsp:useBean> 
            <%add.addToDB();%>
            
            <input type="submit" value="Go to account" />
        
        
          </form>
    </body>
</html>
