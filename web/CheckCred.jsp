<%-- 
    Document   : CheckCred
    Created on : Mar 28, 2017, 5:31:37 PM
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
        <jsp:useBean id= "cred" class= "Bean.Credential">
            <jsp:setProperty name="cred" property="*"/>
        </jsp:useBean>     
        <% if(cred.isValid())
        {
            %>
            <jsp:forward page="DoctorPage.jsp"/>
            <%}
            else
            {
            %>
            <jsp:forward page="doctor_signin.jsp"/>
            <%
        }
            %>
    </body>
</html>