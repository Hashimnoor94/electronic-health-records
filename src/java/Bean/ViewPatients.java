/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hashim
 */
public class ViewPatients 
{
    private String list;
    Connection con = null;   
    ResultSet resultSet = null;
    java.sql.Statement st = null;
    
    public ViewPatients() 
    {
        try 
        {
            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            String connectionString = "jdbc:sqlserver://bbbgroup.database.windows.net:1433;database=BBBgroup;user=bbbgroup@bbbgroup;"
                    + "password=Anam!123;encrypt=true;trustServerCertificate=false"
                    + ";hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            con = DriverManager.getConnection(connectionString);                
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Credential.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getList() 
    {
        String output = null;
        
        try {
            output = "<table border = '1' style='width:100%' align = 'center'> "
                    + "<tr> "
                    + "<th>Name</th> "
                    + "<th>Phone</th> "
                    + "<th>Address</th>"
                    + "<th>Email"
                    + "</th><th>Sugar Level</th>"
                    + "<th>RBC</th>"
                    + "<th>Heart Rate</th> "
                    + "<th>Blood Preassure</th> "
                    + "<th>Hemoglobin</th>"
                    + "<th>WBC"
                    + "</th><th>Weight</th>"
                    + "<th>Age</th>"
                    + "<th>Height</th> "
                    + "<th>Gender</th>"
                    + "<th>Blood Group</th>"
                    + "<th>Family History</th>"
                    + " </tr>";
            
        String selectSql = selectSql = "SELECT * FROM dbo.Patient";
        st = con.createStatement();
        resultSet = st.executeQuery(selectSql);
        
        while (resultSet.next())   
            {  
                output = output + ("<tr><td><center>"+resultSet.getString(1)+"</td>" +
                        "<td><center>"+resultSet.getString(3)+"</td>" +
                        "<td><center>"+resultSet.getString(4)+"</td>"+
                        "<td><center>"+resultSet.getString(5)+"</td>"+
                        "<td><center>"+resultSet.getString(6)+"</td>"+
                        "<td><center>"+resultSet.getString(7)+"</td>" +
                        "<td><center>"+resultSet.getString(8)+"</td>"+
                        "<td><center>"+resultSet.getString(9)+"</td>"+
                        "<td><center>"+resultSet.getString(10)+"</td>"+
                        "<td><center>"+resultSet.getString(11)+"</td>"+
                        "<td><center>"+resultSet.getString(12)+"</td>" +
                        "<td><center>"+resultSet.getString(13)+"</td>"+
                        "<td><center>"+resultSet.getString(14)+"</td>"+
                        "<td><center>"+resultSet.getString(15)+"</td>"+
                        "<td><center>"+resultSet.getString(16)+"</td>"+
                        "<td><center>"+resultSet.getString(17)+"</td></tr>");  
            }  
                        
                        output = output + "</table></body></html>";            
            
        } catch (SQLException ex) {
            Logger.getLogger(ViewPatients.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    public void setList(String list) 
    {
        this.list = list;
    }
    
    
    
}
