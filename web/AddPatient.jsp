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
    <title>Add Patient Page</title>
    </head>
    <body>
    <center><h1>Create New Patient Account </h1>
    <br/>
    <form action="AddPat.jsp">
    <table cellspacing="20">
            <tbody>
            <tr>
               <td><center><h2>PERSONAL INFORMATION </h2><hr/></center> </td>     
            </tr>            
            <tr>
                <td><b>USERNAME</b></td>
                <td><input type="text" name="name" value="" /></td>
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
                <td><b>EMAIL</b></td>
                <td><input type="text" name="exp" value="" /></td>
            </tr>
            <tr>
                <td><b>ADDRESS</b></td>
                <td><input type="text" name="add" value="" /></td>
            </tr>
            <br/>
            <tr>
               <td><center><h2>MEDICAL INFORMATION </h2><hr/></center> </td>     
            </tr> 
            <tr>
                <td><b>SUGAR LEVEL</b> </td>
                <td><input type="text" name="sug" value="" />mg/dl</td>
            </tr>
            <tr>
                <td><b>RBC COUNT</b></td>
                <td><input type="text" name="rbc" value="" />HcT</td>
            </tr>
            <tr>
                <td><b>HEART RATE</b></td>
                <td><input type="text" name="heart" value="" />Pulse/min</td>
            </tr>
            <tr>
                <td><b>BLOOD PRESSURE</b></td>
                <td><input type="text" name="bp" value="" />mm/Hg</td>
            </tr>
            <tr>
                <td><b>HEMOGLOBIN</b></td>
                <td><input type="text" name="hemoglobin" value="" />g/dL</td>
            </tr>
            <tr>
                <td><b>WBC COUNT</b></td>
                <td><input type="text" name="wbc" value="" />HdL</td>
            </tr>
            <tr>
                <td><b>WEIGHT</b></td>
                <td><input type="text" name="wt" value="" />Kg</td>
            </tr>
            <tr>
                <td><b>AGE</b></td>
                <td><input type="text" name="age" value="" /></td>
            </tr>
            <tr>
                <td><b>HEIGHT</b></td>
                <td><input type="text" name="ht" value="" />cm</td>
            </tr>
            <tr>
                <td><b>GENDER</b></td>
                <td><input type="text" name="gen" value="" /></td>
            </tr>
            <tr>
                <td><b>BLOOD GROUP</b></td>
                <td><input type="text" name="bld" value="" />Kg</td>
            </tr>
            <tr>
                <td><b>FAMILY HISTORY</b></td>        
                <td><textarea name="hist" rows="4" cols="25"></textarea></td>
            </tr>
        </tbody>
    </table>
        <br/>
            <input type="submit" value="Add" />
        </form>
    </center>
    </body>
</html>
