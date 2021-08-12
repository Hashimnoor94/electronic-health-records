<%-- 
    Document   : ViewPatients
    Created on : Apr 22, 2017, 2:46:41 AM
    Author     : Hashim
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <head>
        <title>View Patient Page</title>
        <style>
        body {font-family: Calibri, sans-serif; background: #EAEAEA}
        h1   {color: white; background-color: #F14141;}
    </style>
    </head>
    <body>
    <center>
        <h1>View All Patients</h1>
        <jsp:useBean id= "pats" class= "Bean.ViewPatients"/>
        ${pats.list}
    </center>
    </body>
</html>