<%-- 
    Document   : Doctor_SignUp
    Created on : Apr 21, 2017, 5:53:48 PM
    Author     : Hashim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <style>
        body {font-family: Calibri, sans-serif; background: #EAEAEA}
        h1   {color: white; background-color: #F14141;}
    </style>
    <title>Sign Up Page</title>
    </head>
    <body>
    <center><h1>Create New Doctor Account </h1>
    <br/>
    <form action="AddDoc.jsp">
    <table cellspacing="20">
            <tbody>
            <tr>
                <td><b>FULL NAME</b></td>
                <td><input type="text" name="name" value="" /></td>
            </tr>
            <tr>
                <td><b>USERNAME</b></td>
                <td><input type="text" name="uName" value="" /></td>
            </tr>
            <tr>
                <td><b>PASSWORD</b></td>
                <td><input type="password" name="pass" value="" /></td>
            </tr>
            <tr>
                <td><b>PHONE</b></td>
                <td><input type="text" name="phone" value="" /></td>
            </tr>
            <tr>
                <td><b>YEARS OF EXPERIENCE</b></td>
                <td><input type="text" name="exp" value="" /></td>
            </tr>
            <tr>
                <td><b>SPECIALIZATION</b> </td>
                <td><input type="text" name="spez" value="" /></td>
            </tr>
        </tbody>
    </table>
        <br/>
        <input type="submit" value="Sign Up" />
        </form>
    </center>
    </body>
</html>
