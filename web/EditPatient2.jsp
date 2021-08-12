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
    <center><h1>Edit Patient Details </h1>
    <br/>
    <h2> EDIT THE VALUES YOU WANT TO CHANGE</h2>
    <br/><br/>
    <form action="EditPatient3.jsp">
    <table cellspacing='10'>
            <tbody>           
            <tr>
                <td><b>USERNAME</b></td>
                <td><input type="text" name="name" value="${editcred.name}" /></td>
            </tr>
            <tr>
                <td><b>PHONE</b></td>
                <td><input type="text" name="phone" value= "${editcred.phone}" /></td>
            </tr>
                <td><b>EMAIL</b></td>
                <td><input type="text" name="exp" value="${editcred.exp}" /></td>
            </tr>
            <tr>
                <td><b>ADDRESS</b></td>
                <td><input type="text" name="add" value="${editcred.add}" /></td>
            </tr>
            <tr>
                <td><b>SUGAR LEVEL</b> </td>
                <td><input type="text" name="sug" value="${editcred.sug}" />mg/dl</td>
            </tr>
            <tr>
                <td><b>RBC COUNT</b></td>
                <td><input type="text" name="rbc" value="${editcred.rbc}" />HcT</td>
            </tr>
            <tr>
                <td><b>HEART RATE</b></td>
                <td><input type="text" name="heart" value="${editcred.heart}" />Pulse/min</td>
            </tr>
            <tr>
                <td><b>BLOOD PRESSURE</b></td>
                <td><input type="text" name="bp" value="${editcred.bp}" />mm/Hg</td>
            </tr>
            <tr>
                <td><b>HEMOGLOBIN</b></td>
                <td><input type="text" name="hemoglobin" value="${editcred.hemoglobin}" />g/dL</td>
            </tr>
            <tr>
                <td><b>WBC COUNT</b></td>
                <td><input type="text" name="wbc" value="${editcred.wbc}" />HdL</td>
            </tr>
            <tr>
                <td><b>WEIGHT</b></td>
                <td><input type="text" name="wt" value= "${editcred.wt}" />Kg</td>
            </tr>
            <tr>
                <td><b>AGE</b></td>
                <td><input type="text" name="age" value="${editcred.age}" /></td>
            </tr>
            <tr>
                <td><b>HEIGHT</b></td>
                <td><input type="text" name="ht" value="${editcred.ht}" />cm</td>
            </tr>
            <tr>
                <td><b>GENDER</b></td>
                <td><input type="text" name="gen" value="${editcred.gen}" /></td>
            </tr>
            <tr>
                <td><b>BLOOD GROUP</b></td>
                <td><input type="text" name="bld" value="${editcred.bld}" />Kg</td>
            </tr>
            <tr>
                <td><b>FAMILY HISTORY</b></td>        
                <td><textarea name="hist" rows="4" cols="25" value="${editcred.hist}"></textarea></td>
            </tr>
        </tbody>
    </table>
        <br/>
            <input type="submit" value="Edit" />
        </form>
    </center>
    </body>
</html>
