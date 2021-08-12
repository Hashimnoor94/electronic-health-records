<%-- 
    Document   : doctor_signin
    Created on : Apr 21, 2017, 5:34:56 PM
    Author     : Hashim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Doctor Page</title>
        <style>
        body {font-family: Calibri, sans-serif; background: #EAEAEA}
        h1   {color: white; background-color: #F14141;}
    </style>
    </head>
    <body>
    <center><h1>Doctor Portal</h1></center> 
    <br/>
    </head>
    <body>
    <center>
        <form action="CheckCred.jsp">
        <table cellspacing="20">
            <tbody>
                <tr>
                    <td><b>USERNAME</b> </td>
                    <td><input type="text" name="user" value="" /></td>
                </tr>
                <tr>
                    <td><b>PASSWORD</b> </td>
                    <td><input type="password" name="pass" value="" /></td>
                </tr>
            </tbody>
        </table>
        <br/>
            <input type="submit" value="Sign In" />
        </form>
        <br/><br/>
        <b>NEW USER ? <a href="Doctor_SignUp.jsp">SIGN UP</a></b>
    </center>
    </body>
</html>
