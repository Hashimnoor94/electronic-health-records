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
    <center><h1>Create New Patient Account </h1></center>
    <br/>
    <center>
    <table cellspacing="20">
            <tbody>
            <tr>
                <td><b>FULL NAME</b></td>
                <td><input type="text" name="Name" value="" /></td>
            </tr>
            <tr>
                <td><b>USERNAME</b></td>
                <td><input type="text" name="UName" value="" /></td>
            </tr>
            <tr>
                <td><b>PASSWORD</b></td>
                <td><input type="password" name="Pass" value="" /></td>
            </tr>
            <tr>
                <td><b>PHONE</b></td>
                <td><input type="text" name="Phone" value="" /></td>
            </tr>
        </tbody>
    </table>
        <br/>
        <form action="a">
            <input type="submit" value="Sign Up" />
        </form>
    </center>
    </body>
</html>