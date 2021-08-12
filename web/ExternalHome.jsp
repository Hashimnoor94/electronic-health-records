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
        <title>Doctor Page</title>
        <style>
        body {font-family: Calibri, sans-serif; background: #EAEAEA}
        h1   {color: white; background-color: #F14141;}
    </style>
    </head>
    <body>
    <center>
        <h1>Welcome Doctor</h1> 
        
        <h3>
            
            ${param.time}
        <jsp:useBean id = "add" class= "Bean.ExternalCred">    
           <jsp:setProperty name="add" property="*"/>      
        </jsp:useBean> 
        
        </h3>
    <br/>
    <h2>WHAT DO YOU WANT TO DO ?</h2> 
    <br/>
    <br/>
    <br/>
    <br/>
    </center>
<center>
    <table cellspacing="50">
        <tbody>
            <tr>
                <td><img src="view.png" width="250" height="250" alt="doc"/></td>
                <td><img src="editdoc.png" width="250" height="250" alt="doc"/></td>
            </tr>
            <tr>
         
     
            <td>
               <center>
                    <form action="ViewExternalPatients.jsp">
                        <input type="submit" value="View All Patients" />
                    </form>
                </center>                  
            </td>
            <td>
               <center>
                    <form action="SearchExternal.jsp">
                        <input type="submit" value="Search For patients" />
                    </form>
                </center>                  
            </td>
            </tr>
        </tbody>
    </table>
</center>
</body>
</html>
