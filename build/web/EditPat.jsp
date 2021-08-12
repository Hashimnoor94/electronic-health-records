<%-- 
    Document   : EditPat
    Created on : Apr 22, 2017, 12:24:47 PM
    Author     : Hashim
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Credentials</title>
    </head>
    <body>
        <jsp:useBean id= "editcred" class= "Bean.EditPat" scope="request">
            <jsp:setProperty name="editcred" property="*"/>
        </jsp:useBean>     
        <% if(editcred.ispatValid())
        {
            %>
            <jsp:forward page="EditPatient2.jsp"/>
            <%}
            else
            {
            %>
            <jsp:forward page="EditPatient.jsp"/>
            <%
        }
            %>
    </body>
</html>
