<%-- 
    Document   : PatientPage
    Created on : Apr 21, 2017, 6:27:30 PM
    Author     : Hashim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <head>
        <title>Patient Page</title>
        <style>
        body {font-family: Calibri, sans-serif; background: #EAEAEA}
        h1   {color: white; background-color: #F14141;}
    </style>
    </head>
    <body>
    <center>
        <h1>Welcome Patient</h1>
    <br/>
    <h2>WHAT DO YOU WANT TO DO ?</h2> 
    <br/>
    <br/>
    <br/>
    <br/>
    <table cellspacing="25">
        <tbody>
            <tr>
                <td><img src="view_pat.png" width="250" height="250" alt="doc"/></td>
                <td><img src="edit_pat.png" width="250" height="250" alt="doc"/></td>
            </tr>
            <tr>
                <td>
                <center>
                    <form action="ViewRecord.jsp">
                        <input type="submit" value="View Medical Records" />
                    </form>
                 </center>
                </td>
                <td>
                <center>
                    <form action="PatientEdit.jsp">
                        <input type="submit" value="Edit Personal Information" />
                    </form>
                </center>
                </td>
            </tr>
        </tbody>
    </table>
 </center> 
    </body>
</html>