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
        <jsp:useBean id= "pcred" class= "Bean.PatCred" scope="request">
            <jsp:setProperty name="pcred" property="*"/>
        </jsp:useBean>     
        <% if(pcred.isValid())
        {
            %>
            <jsp:forward page="PatientPage.jsp"/>
            <%}
            else
            {
            %>
            <jsp:forward page="patient_signin.jsp"/>
            <%
        }
            %>
    </body>
</html>