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
public class PatCred 
{
    private String user;
    private String pass;
    private String list;
    Connection con = null;   
    ResultSet resultSet = null;
    java.sql.Statement st = null;
    
    public PatCred() 
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

    public String getPass() 
    {
        return pass;
    }

    public void setPass(String pass) 
    {
        this.pass = pass;
    }

    public boolean isValid() throws SQLException 
    {
        String selectSql = "select * from dbo.Patient where Username = '" + user + "' and Password = '" +pass+"'";
        st = con.createStatement(); 
        resultSet = st.executeQuery(selectSql);
        if (resultSet.next())   
        {  
            System.out.println("LOL");
            System.out.println(user);
            System.out.println(pass);
            return true;          
        }
        else
        {
            System.out.println("LOLA");
            return false;           
        }
        	
    }
   
    public String getList() 
    {
        String output = null;
        
        try {
            output = "<table style='width:20%' align = 'center'> ";
            
        String selectSql = selectSql = "SELECT * FROM dbo.Patient where username = '" + user + "'" ;
        st = con.createStatement();
        resultSet = st.executeQuery(selectSql);
        
        while (resultSet.next())   
            {  
                output = output + ("<tr><td><center><b> NAME: </td><td><center>"+resultSet.getString(1)+"</td></tr>" +
                        "<tr><td><center><b> PHONE: </td><td><center>"+resultSet.getString(3)+ "</td></tr>" +
                        "<tr><td><center><b>  ADDRESS: </td><td><center>" + resultSet.getString(4)+ "</td></tr>" +
                        "<tr><td><center><b>  EMAIL: </td><td><center>" + resultSet.getString(5)+ "</td></tr>" +
                        "<tr><td><center><b>  SUGAR: </td><td><center>" + resultSet.getString(6)+ "</td></tr>" +
                        "<tr><td><center><b>  RBC: </td><td><center>" + resultSet.getString(7)+ "</td></tr>" +
                        "<tr><td><center><b>  HEART RATE: </td><td><center>" + resultSet.getString(8)+ "</td></tr>" +
                        "<tr><td><center><b>  BLOOD PREASSURE: </td><td><center>" + resultSet.getString(9)+ "</td></tr>" +
                        "<tr><td><center><b>  HEMOGLOBIN: </td><td><center>" + resultSet.getString(10)+ "</td></tr>" +
                        "<tr><td><center><b> WBC: </td><td><center>" + resultSet.getString(11)+ "</td></tr>" +
                        "<tr><td><center><b>  WEIGHT: </td><td><center>" + resultSet.getString(12)+ "</td></tr>" +
                        "<tr><td><center><b>  AGE: </td><td><center>" + resultSet.getString(13)+ "</td></tr>" +
                        "<tr><td><center><b>  HEIGHT: </td><td><center>" + resultSet.getString(14)+ "</td></tr>" +
                        "<tr><td><center><b>  GENDER: </td><td><center>" + resultSet.getString(15)+ "</td></tr>" +
                        "<tr><td><center><b>  BLODD: </td><td><center>" + resultSet.getString(16)+ "</td></tr>" +
                        "<tr><td><center><b>  FAMILY DETAILS: </td><td><center>" + resultSet.getString(17)+ "</td></tr>" ); 
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
