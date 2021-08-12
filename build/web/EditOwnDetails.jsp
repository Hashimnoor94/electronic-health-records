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
    <center><h1>EDIT DOCTOR DETAILS </h1>
    <br/>
    <h2>WHAT DO YOU WANT TO CHANGE ? </h2>
    <form action="AddDoc.jsp">
    <table cellspacing="20">
            <tbody>
            <tr>
                <td><b>FULL NAME</b></td>
                <td><input type="text" name="name" value="admin" /></td>
            </tr>
            <tr>
                <td><b>USERNAME</b></td>
                <td><input type="text" name="uName" value="admin" /></td>
            </tr>
            <tr>
                <td><b>PASSWORD</b></td>
                <td><input type="password" name="pass" value="" /></td>
            </tr>
            <tr>
                <td><b>PHONE</b></td>
                <td><input type="text" name="phone" value="000" /></td>
            </tr>
            <tr>
                <td><b>YEARS OF EXPERIENCE</b></td>
                <td><input type="text" name="exp" value="2" /></td>
            </tr>
            <tr>
                <td><b>SPECIALIZATION</b> </td>
                <td><input type="text" name="spez" value="Cardio" /></td>
            </tr>
        </tbody>
    </table>
        <br/>
        <input type="submit" value="Edit" />
        </form>
    </center>
    </body>
</html>