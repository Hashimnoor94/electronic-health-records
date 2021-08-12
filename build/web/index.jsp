<%-- 
    Document   : index
    Created on : Apr 21, 2017, 3:26:09 PM
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
    <title>Welcome Page</title>
    </head>
    <body>
    <center><h1>Welcome the the EHR Portal</h1></center> 
    <br/>
<center>
   <h2>I AM A ?</h2> 
   <br/><br/><br/><br/>
    <table cellspacing="30">
        <tbody>
            <tr>
                <td><img src="doctor.png" width="250" height="250" alt="doc"/></td>
                <td><img src="external.png" width="250" height="250" alt="ext"/></td>
                <td><img src="patient.png" width="250" height="250" alt="pat"/></td>
            </tr>
            <tr>
                <td>
                    <br/>
                    <form action="doctor_signin.jsp">
                    <center><input type="submit" value="Doctor" /></center>
                    </form>
                </td>
                <td>
                    <br/>
                    <form action="externalsys_signin.jsp">
                    <center><input type="submit" value="External System" /></center>
                    </form>
                </td>
                <td>
                    <br/>
                    <form action="patient_signin.jsp">
                    <center><input type="submit" value="Patient" /></center>
                    </form>
                </td>
            </tr>
        </tbody>
    </table>
</center>
    </body>
</html>
