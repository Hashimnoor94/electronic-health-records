/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hashim
 */
public class DeletePat 
{
    private String user;
    Connection con = null;   
    ResultSet resultSet = null;
    java.sql.Statement st = null;

    public DeletePat() 
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

    public String getUser() 
    {
        return user;
    }

    public void setUser(String user) 
    {
        this.user = user;
    }
    
    public boolean isValid() throws SQLException 
    {
        int test = -1; 
        String s = "Delete from dbo.Patient where username = '" + user + "'";
        PreparedStatement ps = con.prepareStatement(s);
        test = ps.executeUpdate();
        if(test == 1)
        {
            return true;
        }
        else
            return false;
    } 
}
