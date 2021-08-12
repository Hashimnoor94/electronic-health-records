<%-- 
    Document   : DeletePatient
    Created on : Apr 22, 2017, 2:06:29 AM
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
    <title>Delete Patient Page</title>
    </head>
    <body>
    <center><h1>Delete Patient</h1>
        <br/><br/>

        <form action="DelPatient.jsp">
            <b>ENTER USERNAME OF PATIENT TO DELETE: <input type="text" name="user" value="" /> 
              <input type="submit" value="Delete" /></b>
        </form>
     </center>
</body>
</html>
  